package homework26;

/*Создайте enum с именем OrderStatus.
Добавьте в него следующие статусы: PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
Внутри enum создайте метод getDescription(), который возвращает строку, описывающую каждый из статусов. */
public enum OrderStatus {
  PENDING,
  PROCESSING,
  SHIPPED,
  DELIVERED,
  CANCELLED;

    public static void getDescription (OrderStatus orderStatus) {
      switch (orderStatus){
          case PENDING:
              System.out.println("Статус заказа: на рассмотрении");
              break;
          case PROCESSING:
              System.out.println("Статус заказа: оформляется");
              break;
          case SHIPPED:
              System.out.println("Статус заказа: доставляется");
              break;
          case DELIVERED:
              System.out.println("Статус заказа: доставлен");
              break;
          case CANCELLED:
              System.out.println("Статус заказа: отменен");
              break;
      }
    }
}
