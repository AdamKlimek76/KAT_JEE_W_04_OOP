package b_Zadania_domowe.b_Dzien_2;

public class SoundBook extends Book {
    private int duration;
    private int numberOfCarriers;

    public SoundBook(int id, String title, int duration, int numberOfCarriers) {
        super(id, title);
        this.duration=duration;
        this.numberOfCarriers=numberOfCarriers;
    }

    public SoundBook(int id, String title, Author author, int duration, int numberOfCarriers) {
        super(id, title, author);
        this.duration=duration;
        this.numberOfCarriers=numberOfCarriers;
    }

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors, int duration, int numberOfCarriers) {
        super(id, title, author, additionalAuthors);
        this.duration=duration;
        this.numberOfCarriers=numberOfCarriers;
    }

    public void setDuration(int duration){
        this.duration=duration;
    }

    public void setNumberOfCarriers(int numberOfCarriers){
        this.numberOfCarriers=numberOfCarriers;
    }

    public int getDuration(){
        return duration;
    }

    public int getNumberOfCarriers(){
        return numberOfCarriers;
    }

    public String toString(){
        return getId() + " " + getTitle() + " " + this.duration + " " + this.numberOfCarriers;
    }
}
