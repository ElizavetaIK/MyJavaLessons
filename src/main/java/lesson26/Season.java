package lesson26;

public enum Season {
    /*Создайте enum `Season`, который включает четыре времени года:
    `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
    Напишите метод в этом enum, который возвращает рекомендуемую
    активность для каждого сезона (например, лыжи зимой).
     */
    SPRING ("Устроить пикник"),
    SUMMER ("Купаться в озере"),
    AUTUMN ("Ходить за грибами"),
    WINTER ("Кататься на коньках");

    private String activities;

    Season(String activities) {
        this.activities = activities;
    }

    public String getActivities() {
        return activities;
    }


}
