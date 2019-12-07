package b_Zadania_domowe.b_Dzien_2;


public class Author extends Person{
    private String pseudonym;

    public Author(int id, String name, String lastName, String pseudonym) {
        super(id, name, lastName);
        this.pseudonym = pseudonym;
    }

}
