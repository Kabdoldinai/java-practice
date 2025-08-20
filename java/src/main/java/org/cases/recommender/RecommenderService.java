package org.cases.recommender;

import java.util.List;

public interface RecommenderService <Document, User>{

    void addDocument(Document document);

    List<Document> getTop(User user, int limit);

}
