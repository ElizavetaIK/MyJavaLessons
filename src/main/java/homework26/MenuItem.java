package homework26;

public class MenuItem {
    /*Добавьте поле name типа String для названия элемента.
Добавьте поле type типа MenuItemType для указания типа элемента.
Создайте конструктор, принимающий оба значения.
Реализуйте методы getName() и getType() для доступа к полям.
Переопределите метод toString() для вывода информации об элементе.
     */
           private String name;
           private MenuItemType type;

    public MenuItem(String name, MenuItemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MenuItemType getType() {
        return type;
    }
    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}

