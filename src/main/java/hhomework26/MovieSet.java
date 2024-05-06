package hhomework26;

import lesson26.Operations;

import java.util.ArrayList;

public class MovieSet{
    public static void main(String[] args) {
        //создаем массив сотрудников, добавляем в него объекты
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        Director director = new Director("Schmidt", "Director", 10);
        SoundEngineer soundEngineer = new SoundEngineer("Klum", "Sound Engineer", 5);
        Operator operator = new Operator("Marvin", "Operator", 8);
        FinancialDirector financialDirector = new FinancialDirector("Johnson", "Financial Director", 5);
        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);
        filmStudioEmployees.add(operator);
        filmStudioEmployees.add(financialDirector);


        for (final FilmStudioEmployee filmStudioEmployee : filmStudioEmployees){
            filmStudioEmployee.work();
        }





    }
}
