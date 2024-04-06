package lesson03;

public class Calculator {

        static int numberOne = 145;

        static int numberTwo = 55;

        public static void main(String[] args) {
            //выводим на экран метод summary и multiplication, аргументы - два int числа, которые мы задали выше
            System.out.println(summary(numberOne, numberTwo));
            System.out.println(multiplication(numberOne, numberTwo));
        }
        //создаем метод, который позволяет сложить два числа и вернуть их сумму
        //название метода summary, принимает два int числа и возвращает сумму этих чисел
        public static int summary(int firstNumber, int secondNumber){
            return firstNumber + secondNumber;
        }
        //создаем метод, который позволяет перемножиьть два числа и вернуть их произведение
        //название метода multiplication, принимает два int числа и возвращает произведение этих чисел

        public static int multiplication(int firstNumber, int secondNumber){
            return firstNumber * secondNumber;

        }
}
