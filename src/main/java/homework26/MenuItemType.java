package homework26;

public enum MenuItemType {
    /*Определите перечисление MenuItemType:
DRINK для напитков.
DISH для блюд.
     */

    DRINK("напиток"),
    DISH("блюдо");

    public String description;

    MenuItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
