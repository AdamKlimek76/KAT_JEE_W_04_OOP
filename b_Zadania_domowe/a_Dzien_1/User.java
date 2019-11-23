package b_Zadania_domowe.a_Dzien_1;


import java.util.Arrays;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] newTab = Arrays.copyOf(books, books.length + 1);
        newTab[books.length] = book;
        this.books = newTab;
    }

    public Book [] getBooksTab(){
        return books;
    }

    public int booksTabLenght(){
        return books.length;
    }

    public String toString(){
        return id + " " + firstName + " " + lastName;
    }

}
