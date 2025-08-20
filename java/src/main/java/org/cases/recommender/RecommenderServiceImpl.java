package org.cases.recommender;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class RecommenderServiceImpl implements RecommenderService<Document, User> {

    private Scorer scorer;
    private List<Document> list = new ArrayList<>();

    public RecommenderServiceImpl(Scorer scorer) {
        this.scorer = scorer;
    }

    @Override
    public List<Document> getTop(User user, int limit) {
        List<Document> result = new ArrayList<>();
        PriorityQueue<Document> priorityQueue = new PriorityQueue((Doc1, Doc2) -> Double.compare(
                scorer.getScore((Document) Doc2, user), scorer.getScore((Document) Doc1, user)));
        priorityQueue.addAll(list);

        for (int i = 0; i < limit; i++) {
            result.add(priorityQueue.poll());
        }

        return result;
    }

    @Override
    public void addDocument(Document document) {
        list.add(document);
    }

}
//
//return
//        documents.stream
//        ()
//                .sorted((doc1, doc2) ->
//        Double.compare
//        (
//                scorer.getScore(doc2, user),
//                        scorer.getScore(doc1, user)))
//        .limit(limit)
//                .collect(Collectors.toList());
//        2
