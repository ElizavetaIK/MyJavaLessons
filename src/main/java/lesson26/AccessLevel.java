package lesson26;

public enum AccessLevel {
    NONE(0), READ(1), WRITE(2), ADMIN(3);
    //final - переменная принимает окончательное значение и не может быть перезаписана
    private final int level;
    //создаем конструктор для обозначения уровня доступа (1), (2) и т.д
    AccessLevel(int level) {
        this.level = level;
    }
    //пишем маленькие методы
    //метод, который показывает есть ли у данного пользователя доступ к чтению
    public boolean canRead (){
        return this.level >=READ.level;
    }

    public boolean canWrite (){
        return  this.level >= WRITE.level;
    }
    public boolean isAdmin (){
        return  this.level == ADMIN.level;
    }
}
