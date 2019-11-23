package b_Zadania_domowe.a_Dzien_1;

public class Main2 {

    public static void main(String[] args) {

        Author author1 = new Author(1, "Autor1", "Nazwautor1", "a1");
        Author author2 = new Author(2, "Autor2", "Nazwautor2", "a2");
        Author author3 = new Author(3, "Autor3", "Nazwautor3", "a3");

        Author[] authorTab = new Author[3];
        authorTab[0] = author1;
        authorTab[1] = author2;
        authorTab[2] = author3;
        System.out.println(author1.toString());

        Book book = new Book(11, "Książka1", author1);
        Book book1 = new Book(22, "Ksiązka2", author2, authorTab);
        Book book2 = new Book(33, "Książka3", author3);

        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());

        System.out.println(book1.getId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        for (int i = 0; i < authorTab.length; i++) {
            System.out.println(book1.getAdditionalAuthors()[i]);
        }

        User user = new User(111, "Adam", "Klimek");
        user.addBook(book);
        System.out.println(user.getBooksTab()[0]);
        user.addBook(book1);
        System.out.println(user.getBooksTab()[1]);
        user.addBook(book2);
        for (int i=0; i<user.booksTabLenght(); i++){
            System.out.println(user.getBooksTab()[i]);
        }

        User currentUser=new User(222, "Rafael", "Frei");
        book.setCurrentUser(currentUser);
        System.out.println(book.getCurrentUser());
        System.out.println(currentUser.getBooksTab()[0]);


    }
}
