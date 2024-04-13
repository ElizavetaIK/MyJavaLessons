package lesson26;

public enum Day {
    //можержат внутри себя строго константные значения в виде списка (в строчку или столбик, неважно, главное через ",")
    //добавили описание, тогда около каждой константы должно быть описание. Создали конструктор и геттер
    MONDAY ("Monday is bad day..."),
    TUESDAY ("По-прежнему сложный день"),
    WEDNESDAY ("Уже середина рабочей недели, полегче"),
    THURSDAY ("Еще всего два рабочих дня"),
    FRIDAY ("Ура, пятница!"),
    SATURDAY ("Суббота - лучшиий день недели"),
    SUNDAY ("Хорошо, но завтра понедельник");
private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
