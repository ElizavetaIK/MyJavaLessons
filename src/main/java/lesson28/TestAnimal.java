package lesson28;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        perform(dog);
        perform(cat);
    }

    public static void perform(Animal animal){
        animal.makeSound();
    }
}
