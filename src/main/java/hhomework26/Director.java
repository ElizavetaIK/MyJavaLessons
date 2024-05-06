package hhomework26;

public class Director extends FilmStudioEmployee {
    //обязательно при таком наслеовании необходим конструктор
    public Director(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }

    public void direct (){
        System.out.println(getName()+ " is a director");
    }

    @Override
    public String toString() {
        return "Director{} " + super.toString();
    }

    @Override
    public void work() {
        System.out.println(getName() + " is making castings");
    }
}
