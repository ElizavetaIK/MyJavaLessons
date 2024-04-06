package lesson04;

public class Task01 {
    /*
    Напишите программу, которая объявляет три переменные типа float/double
     и присваивает им значения. Программа должна вычислять и
     выводить среднее значение этих трёх чисел.
     */
    public static void main(String[] args) {
        System.out.println("-------float------");
        float firstNumber = 22.5f;
        float secondNumber = 35.6f;
        float thirdNumber = 21.9f;
        float result = ((firstNumber + secondNumber + thirdNumber)/3);
        System.out.println(result);

        System.out.println("-------double------");
        double numberOne = 22.1;
        double numberTwo = 45.3;
        double numberThree = 2.6;
        double res = ((numberOne + numberTwo + numberThree)/3);
        System.out.println(res);
    }
}
