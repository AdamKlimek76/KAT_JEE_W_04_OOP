package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Parent {

    public int parentData = 123;

    public Parent(){
        System.out.println("Parent constructor ");
        showInfo();
    }

    public Parent(String name){
        System.out.println(name);
    }

    final public void showInfo(){
        System.out.println(parentData);
    }


}
