package lesson26;

import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnum {
    Day day;
    private static AccessLevel accessLevel = AccessLevel.READ;
    //хранилище EnumSet и EnumMap - более эффективны, чем HashSet и HashMap, т.к. элементы упорядочены, как в исходнике
    private static EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
    private static EnumMap<Day, String> dayStringEnumMap = new EnumMap<>(Day.class);


    public static void main(String[] args) {
        weekend.add(Day.FRIDAY);
        System.out.println(weekend);
    dayStringEnumMap.put(Day.FRIDAY, "Super!!!");
    dayStringEnumMap.put(Day.MONDAY, "HARD DAY!!!");
    dayStringEnumMap.put(Day.SATURDAY, "Relax!!!");
        System.out.println();

        System.out.println(HttpStatus.NOT_FOUND.getMessage());


checkDayOfWeek(Day.SUNDAY);
        System.out.println(Operations.MINUS.apply (100, 50));

        //проверяем может ли пользователь вносить изменения через equals
        if(accessLevel.equals(AccessLevel.WRITE)){
            System.out.println("File was changed");
        }
        else {
            System.out.println("Low access level");
        }
        //проверяем может ли пользователь вносить изменения через метод .canWrite
        if(accessLevel.canWrite()){
            System.out.println("File was changed");
        }
        else {
            System.out.println("Low access level");
        }


    }

    public static void checkDayOfWeek (Day day){
        switch (day){
            case MONDAY:
                System.out.println(day.name() + " " + day.getDescription());
                break;
            case TUESDAY:
                System.out.println(day.name() + " " + day.getDescription());
                break;
            case WEDNESDAY:
                System.out.println(day.name() + " " + day.getDescription());
                break;
            default:
                System.out.println(day.name() + " " + day.getDescription());
                break;

        }
    }
}
