package de.jknowledge.domain.article;

public class ArticleBuilder {

    public ArticleEntity buildCocaColaArticle() {
        return new ArticleEntity("Coca Cola", "Coca Cola Softdrink", 2382910876281L, 2.4D);
    }

    public ArticleEntity buildToothbrushArticle() {
        return new ArticleEntity("Toothbrush", "Modern electric toothbrush for clean tooths", 8262830152738L, 79.99D);
    }

    public ArticleEntity buildNotebookArticle() {
        return new ArticleEntity("Notebook", "Super modern and fast notebook", 7835183761198L, 937D);
    }
}
