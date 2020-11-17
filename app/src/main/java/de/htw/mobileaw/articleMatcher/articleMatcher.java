package de.htw.mobileaw.articleMatcher;

import java.util.List;

public interface articleMatcher<T> {

    /** add article to search for */
    public void addSearchArticle(T searchArticle);

    /** add found article to offer */
    public void addFoundArticle(T foundArticle);

    /** does a article matching a searched or found article */
    public boolean isArticleMatching();

    /** return a List with all Matching Articles */
    public List<T> getMatchingArticleInformation() throws NullPointerException;
}
