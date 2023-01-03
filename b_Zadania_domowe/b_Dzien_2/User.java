package b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class User extends Person {

    private Book[] books;

    public User(int id, String name, String lastName) {
        super(id, name, lastName);
        books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] newTab = Arrays.copyOf(books, books.length + 1);
        newTab[books.length] = book;
        this.books = newTab;
        book.increasePopularityOfBook();
    }

    public Book[] getBooksTab() {
        return books;
    }

    public int booksTabLength() {
        return books.length;
    }

    public void returnBook(Book book) {
        if (books.length == 1) {
            if (books[0].equals(book)) {
                book.setAvailable(true);
                Book[] newTab = new Book[0];
                this.books = newTab;
            }
        } else if (books.length > 1) {
            Book[] newTab = new Book[books.length - 1];
            int j = 0;
            for (int i = 0; i < books.length; i++) {
                if (!books[i].equals(book)) {
                    newTab[j] = books[i];
                    j++;
                }
            }
            this.books = newTab;
        }
    }

    public void returnAllBooks() {
        if (books.length > 0) {
            for (int i = 0; i < books.length; i++) {
                books[i].setAvailable(true);
            }
        }
        Book[] newTab = new Book[0];
        this.books = newTab;
    }

}
