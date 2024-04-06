package lesson04;

public class Task05 {
    /*
    Рассчитайте общую продолжительность трех песен,
    если известна продолжительность каждой из них в секундах.
    Преобразуйте продолжительность каждой песни из секунд
    в минуты и секунды.
     */
    public static void main(String[] args) {
        double songOne = 180;
        double songTwo = 240;
        double songThree = 150;
        double songOneMin = songOne/60;
        double songTwoMin = songTwo/60;
        double songThreeMin = songThree/60;
        double sumSec = songThree + songOne + songTwo;
        double sumMinSec = sumSec/60;
        System.out.println("Длительность первой песни - " + songOneMin + " мин");
        System.out.println("Длительность второй песни - " + songTwoMin + " мин");
        System.out.println("Длительность третьей песни - " + songThreeMin + " мин");
        System.out.println("Общая продолжительность - " + sumSec + " сек");
        System.out.println("Общая продолжительность - " + sumMinSec + " мин");
    }
}
