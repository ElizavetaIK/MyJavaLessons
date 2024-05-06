package hhomework26;

public class Operator extends FilmStudioEmployee{
    public Operator(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }
    public void operateCamera(){
        System.out.println(getName() + " is operating camera");
    }

    @Override
    public String toString() {
        return "Operator{} " + super.toString();
    }

    @Override
    public void work() {
        System.out.println(getName() + " is making light");
    }
}
