package b_Zadania_domowe.b_Dzien_2;


public class Person {
    private int id;
    private String name;
    private String lastname;

    public Person(int id, String name, String lastname){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
    }

    public String toString(){
        return id + " " + name + " " + lastname;
    }


}
