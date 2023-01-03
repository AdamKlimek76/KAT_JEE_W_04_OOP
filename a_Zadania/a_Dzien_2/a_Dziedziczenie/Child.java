package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Child extends Parent{

    public int childData=10;
    public static int staticData;

    public Child(){};

    public Child(String name){
        System.out.println(name);
    }

    public void polimorfAttempt(){
        System.out.println("Tak działa polimorfizm");
    }

    public void staticTest(int staticDataInf){
        staticData=staticDataInf;
        System.out.println(staticData);
    }

    public void showStaticData(){
        System.out.println(staticData);
    }


}
