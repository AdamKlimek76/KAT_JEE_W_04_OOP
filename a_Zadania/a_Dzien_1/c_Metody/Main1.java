package a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Rafał");
        person.setSurname("Frei");
        person.setAge(40);
        person.setGender('c');
        person.increaseAge();
        System.out.println(person.getFullName());
        System.out.println(person.getAge());

        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());

        car.setBrand("Fiat");
        car.setModel("Punto");
        car.setPrice(999.00);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.toString());


    }
}
