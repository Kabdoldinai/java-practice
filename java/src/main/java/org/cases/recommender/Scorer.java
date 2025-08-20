package org.cases.recommender;

public interface Scorer {

    double getScore(Document doc, User user);

}
