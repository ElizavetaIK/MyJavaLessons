package homework26;

public class TestMenuItem {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("Пицца", MenuItemType.DISH);
        MenuItem menuItem1 = new MenuItem("Кофе", MenuItemType.DRINK);
        System.out.println("Наименование - " + menuItem.getName() + ", тип - " + MenuItemType.DISH.getDescription ());
        System.out.println("Наименование - " + menuItem1.getName() + ", тип - " + MenuItemType.DRINK.getDescription ());

    }


}
