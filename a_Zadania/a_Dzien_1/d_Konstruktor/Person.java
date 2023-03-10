package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Person {

    private String name;
    private String surname;
    private int age;
    private char gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }
}
