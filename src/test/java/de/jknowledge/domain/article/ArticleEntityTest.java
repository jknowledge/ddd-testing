package de.jknowledge.domain.article;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArticleEntityTest {

    private static ArticleBuilder articleBuilder;

    @BeforeAll
    public static void setUp() {
        articleBuilder = new ArticleBuilder();
    }

    @Test
    public void testAddDiscoutWithNoDiscount() {
        // given
        ArticleEntity colaArticle = articleBuilder.buildCocaColaArticle();
        Double currentPrice = colaArticle.getArticlePrice();

        // when
        colaArticle.addDiscount();

        // then
        assertTrue(currentPrice.doubleValue() == colaArticle.getArticlePrice().doubleValue());
    }

    @Test
    public void testAddDiscoutWithTwoPercentageDiscount() {
        // given
        ArticleEntity colaArticle = articleBuilder.buildToothbrushArticle();
        Double currentPrice = colaArticle.getArticlePrice();
        Double newPrice = currentPrice - (currentPrice * 2) / 100;

        // when
        colaArticle.addDiscount();

        // then
        assertTrue(newPrice.doubleValue() == colaArticle.getArticlePrice().doubleValue());
    }

    @Test
    public void testAddDiscoutWithThreePercentageDiscount() {
        // given
        ArticleEntity colaArticle = articleBuilder.buildNotebookArticle();
        Double currentPrice = colaArticle.getArticlePrice();
        Double newPrice = currentPrice - (currentPrice * 3) / 100;

        // when
        colaArticle.addDiscount();

        // then
        assertTrue(newPrice.doubleValue() == colaArticle.getArticlePrice().doubleValue());
    }
}
