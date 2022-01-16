package de.jknowledge.domain.article;

import de.jknowledge.domain.EntityBase;
import de.jknowledge.domain.IAggregateRoot;

public class ArticleEntity extends EntityBase implements IAggregateRoot {

    private String articleName;

    private String articleDescription;

    private Long articleEan;

    private Double articlePrice;

    public ArticleEntity(String articleName, String articleDescription, Long articleEan, Double articlePrice) {
        this.articleName = articleName;
        this.articleDescription = articleDescription;
        this.articleEan = articleEan;
        this.articlePrice = articlePrice;
    }

    // methods with behaviour

    public void addDiscount() {
        double discountPercentage = 0;
        if(this.articlePrice.doubleValue() > 50d && this.articlePrice.doubleValue() < 100d) {
            discountPercentage = 2d;
        } else if (this.articlePrice.doubleValue() > 50d) {
            discountPercentage = 3d;
        }
        if(this.articlePrice != null) {
            this.articlePrice = this.articlePrice - (this.articlePrice * Double.valueOf(discountPercentage) / 100);
        }
    }


    // getter and setter without logic

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public Long getArticleEan() {
        return articleEan;
    }

    public void setArticleEan(Long articleEan) {
        this.articleEan = articleEan;
    }

    public Double getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(Double articlePrice) {
        this.articlePrice = articlePrice;
    }
}
