package org.cases.shopp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ShopSolution {

    /*
Вы — backend-разработчик в интернет-магазине.
Дела идут в гору и магазин решил повысить лояльность покупателей, предоставляя им персональные скидки.
К вам обратился product owner с задачей
- создать простую систему лояльности, которая предоставляет процентную скидку на корзину.
Размер скидки зависит от покупателя.
Аналитики уже определили, какие скидки должны быть предоставлены покупателям.


## Определения

Корзина - список покупок покупателя.

Покупка:
- id товара
- цена
- итоговая стоимость c учетом скидки -

Скидка. Для покупателя может быть задан % скидки (целое число).


## Задача
Написать часть новой системы лояльности, которая:

- на вход получает id покупателя и корзину
- вычисляет и применяет скидки
- возвращает корзину, в которой учтены скидки. Скидка учитывается в стоимости покупки

*/

    public static class Bucket {
        private List<Order> order;

        public List<Order> getOrder() {
            return order;
        }

        public void setOrder(List<Order> order) {
            this.order = order;
        }
    }

    public static class Order {
        private Long orderId;
        private BigDecimal price;
        private BigDecimal finalPrice;

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public BigDecimal getFinalPrice() {
            return finalPrice;
        }

        public void setFinalPrice(BigDecimal finalPrice) {
            this.finalPrice = finalPrice;
        }
    }

    //    order = price = 100
    // todo check for the edge case
    public Bucket countDiscount(Long clientId, Bucket bucket) {
        // todo handle error responses
        var discountPercent = getDiscountPercentByClientId(clientId);

        for (Order order : bucket.getOrder()) {

            // min price /
            // todo  refactor
            var discount = (order.getPrice().multiply(BigDecimal.valueOf(discountPercent)))
                    .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
            // validate for finalPrice - > inform external service of discount count fail

            var finalPrice = order.getPrice().subtract(discount);
            order.setFinalPrice(finalPrice);
        }

        return bucket;
    }


    public int getDiscountPercentByClientId(Long clientId) {
        return 3;
    }
}
