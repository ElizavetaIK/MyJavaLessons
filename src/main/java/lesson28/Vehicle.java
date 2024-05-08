package lesson28;

public interface Vehicle {
    /*методы абстрактные (на них пока только есть намек, вся
    реализация в классах-наследниках не сожержат тела, по дефолту
    public. Для многочисленного наследования. Например 1 класс может иметь
    несколько "родителей". Перечисляем несколько implements
    Возможность дать доступы только к тем методам, которые нужны.
    Не ко всем подряд
    Изменение в интерфейсе ведут к изменениям во всех цепочках
    наследования
     */
    void start ();
    void stop();
    void vehicleWait();

    //в интерфейсе могут быть методы
    default void displayVehicleStatus(){
        System.out.println("Vehicle status "+ this.getClass().getSimpleName());
    }
}
