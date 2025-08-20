import org.cases.recommender.Document;
import org.cases.recommender.RecommenderServiceImpl;
import org.cases.recommender.Scorer;
import org.cases.recommender.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecommenderServiceTest {


    private User user;
    private RecommenderServiceImpl recommenderService;
    private Scorer scorer;

    @BeforeEach
    void setUp() {
        user = new User();
        recommenderService = new RecommenderServiceImpl(scorer);
    }

    @Test
    void shouldReturnEmptyListWhenGivenNoDocument() {
        List<Document> result = recommenderService.getTop(user, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnListOfOneDocument() {
        List<Document> result = recommenderService.getTop(user, 5);
        addFiveDocuments();
        assertTrue(result.size() == 1);
    }

    @Test
    void shouldReturnFiveMostRelevantDocuments() {
        List<Document> result = recommenderService.getTop(user, 5);
        assertTrue(result.size() == 5);
    }

    private void addFiveDocuments() {
        for (int i = 1; i < 5; i++) {
            recommenderService.addDocument(new Document());
        }
    }

}

/**
 * There is a service which evaluate the relevance by given document and user
 */

/**
 * There is a need to implement a service which can save the document and get top K (limit) by the score's value for particular user
 */

// - before putting to the queue ,
// I should get the score of document by the user
