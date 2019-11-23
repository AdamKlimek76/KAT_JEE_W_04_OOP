package a_Zadania.a_Dzien_1.a_Pierwsza_klasa;


public class Main1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        if (cat.equals(dog)) {//dwa różne typy obiektów
            System.out.println("prawda");
        }else{
            System.out.println("fałsz");
        }
    }
}
