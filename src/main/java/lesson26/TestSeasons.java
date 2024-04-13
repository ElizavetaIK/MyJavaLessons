package lesson26;

public class TestSeasons {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.getActivities());
        seasonClothes(Season.WINTER);


    }
    public static void seasonClothes (Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Осенью нужно одеться тепло и взять зонт");
                break;
            case SPRING:
                System.out.println("Весной уже можно надеть кроссовки и снять шапку");
                break;
            case SUMMER:
                System.out.println("Летом надевай футболку и шорты, не забудь кепку!");
                break;
            case WINTER:
                System.out.println("Зимой одевайся очень тепло, не забудь шарф и варежки!");
                break;

        }

    }
}
