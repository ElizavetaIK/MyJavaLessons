package lesson20;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava {
    public static void main(String[] args) {
        //создание ArrayList
        ArrayList<String> list = new ArrayList<>();
        //добавление элементов. Элемент сохранятся на следующее свободное место
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");
        //сохранение на определенный индекс, на определенную позицию
        list.add(0, "Kiwi");

        //итерация элементов в листе
        for (String element: list) {
            System.out.println(element);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //hasNext - проверяет, есть ли следующий элемент. Внутри Итератора можно производить действия с элементами
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
        //преобразование листа в массив
        String[] array = list.toArray(new String[0]);
        //удаление элементов. По значению и по индексу.

        list.remove("Banana");
        list.remove(0);

        //замена элементов по указанной позиции
        list.set(1, "Mango");
        //получение элемента на указанной позиции
        String elements = list.get(0);
        System.out.println(elements);

        //размер листа (именно количество элементов)
        int listSize = list.size();
        System.out.println(listSize);
        //очистить ArrayList. Удаление всех жлементов в листе

        //list.clear();
        //System.out.println(listSize);
        System.out.println();




    }
}
