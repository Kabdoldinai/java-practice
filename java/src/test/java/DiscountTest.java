import org.cases.Main;
import org.cases.shopp.ShopSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class DiscountTest {



    @Test
    void shouldReturnBucketWithFinalPriceWhenGivenClientIdAndBucket() {
        var order = new ShopSolution.Order();
        var input = new ShopSolution.Bucket();


        order.setOrderId(1L);
        order.setPrice(BigDecimal.valueOf(100));
        order.setFinalPrice(BigDecimal.valueOf(0));

        input.setOrder(List.of(order));

        ShopSolution main = new ShopSolution();
        var request = main.countDiscount(10033L, input);
        Assertions.assertEquals(BigDecimal.valueOf(97), request.getOrder().get(0).getFinalPrice());

    }

    @Test
    void shouldReturnRoundedBucketWithFinalPriceWhenGivenClientIdAndBucket() {
        var order = new ShopSolution.Order();
        var input = new ShopSolution.Bucket();


        order.setOrderId(1L);
        order.setPrice(BigDecimal.valueOf(100.93));
        order.setFinalPrice(BigDecimal.valueOf(0));

        input.setOrder(List.of(order));

        ShopSolution main = new ShopSolution();
        var request = main.countDiscount(10033L, input);
        Assertions.assertEquals(new BigDecimal("97.90"), request.getOrder().get(0).getFinalPrice());

    }





}
