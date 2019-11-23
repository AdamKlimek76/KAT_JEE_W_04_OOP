package a_Zadania.a_Dzien_1.c_Metody;

public class Person {

    private String name = "Adam";
    private String surname = "Klimek";
    private int age = 43;
    private char gender = 'm';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public void increaseAge() {
        this.age++;
    }

    public int getAge(){
        return this.age;
    }
}
