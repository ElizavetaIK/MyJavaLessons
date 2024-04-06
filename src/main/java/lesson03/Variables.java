package lesson03;

public class Variables {

        //-128 до 127 1байт
        static byte age;

        //-32768 до 32767 2байта
        static short price = 3354;

        //-2147483648 до 2147483647 4байта
        static int number = 500;

        //-9223372036854775808 до 9223372036854775807 8байт
        static long bigNumberPeople = 34343434343343343L;

        //дробные числа, с плавающей точкой
        static float euroPrice = 0.85f;

        //дробные числа, с плавающей точкой
        static double dollarPrice = 0.855;

        //символы
        static char charLetter = 'A';

        //логические (да или нет)
        static boolean result;

        //текст
        static String text = "Hello Java";

        public static void main(String[] args) {
            age = 27;
            System.out.println("Возраст " + true + age);
            System.out.println(number + number);
            System.out.println(number - number);
            System.out.println(number * 2);
            System.out.println(number / 2);
            System.out.println(number);
        }
    }

