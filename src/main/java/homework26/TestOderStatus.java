package homework26;
/*В методе main создайте переменную типа OrderStatus и присвойте ей одно из значений.
Выведите на экран описание текущего статуса заказа.
 */

import static homework26.OrderStatus.getDescription;

public class TestOderStatus {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PROCESSING;
        getDescription(status);
           }
}
