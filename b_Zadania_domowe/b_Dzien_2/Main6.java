package b_Zadania_domowe.b_Dzien_2;

public class Main6 {

    public static void main(String[] args) {

        SoundBook soundBook = new SoundBook(1, "Tytul1", 60, 3);
        SoundBook soundBook1 = new SoundBook(2, "Tytul2", 61, 2);
        SoundBook soundBook2 = new SoundBook(1, "Tytul3", 62, 1);
        User user = new User(1, "Adam", "Klimek");
        User user1 = new User(2, "Alfred", "Kopaczka");
        System.out.println(soundBook.toString());
        soundBook.setCurrentUser(user);
        user1.addBook(soundBook);
        user1.addBook(soundBook1);
        user1.addBook(soundBook2);
        System.out.println(soundBook.getPopularity());
        System.out.println(soundBook.equals(soundBook1));
        System.out.println(soundBook.equals(soundBook2));
        for (int i = 0; i < 3; i++) {
            System.out.println(user1.getBooksTab()[i]);
        }
        user1.returnBook(soundBook1);
        for (int i = 0; i < user1.booksTabLenght(); i++) {
            System.out.println(user1.getBooksTab()[i]);
        }

        user1.returnAllBooks();
        System.out.println(user1.booksTabLenght());
    }


}
