package hhomework26;

public class SoundEngineer extends FilmStudioEmployee{
    public SoundEngineer(String name, String position, int experienceYear) {
        super(name, position, experienceYear);
    }
    public void recordSound(){
        System.out.println(getName()+" record sound");
    }

    @Override
    public String toString() {
        return "SoundEngineer{} " + super.toString();
    }
    //переопределяем метод work. Дети пользуются методом родителя, если он публичный.
    //мы его переопределяем по-своему, наследник будет вчыполнять его своим способом
    //если не переопрееляем, будет выполнен родительский метод
    @Override
    public void work() {
        System.out.println(getName() + " is checking sound");
    }
}
