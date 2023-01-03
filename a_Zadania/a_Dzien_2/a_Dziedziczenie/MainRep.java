package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class MainRep {


    public static void main(String[] aaa) {

        BookRep bookRep = new BookRep();
        EbookRep ebookRep = new EbookRep();
        Parent parent = new Parent();
        Child child = new Child("Adam");
        Parent childParent = new Child();
        int intValue = 12345;
        short shortValue = (short) intValue;
        System.out.println(shortValue);
        child.staticTest(999);
        child.showStaticData();
        Child child1 = new Child();
        child1.showStaticData();

        for (String item : aaa) {
            System.out.println(item);
        }


    }
}
