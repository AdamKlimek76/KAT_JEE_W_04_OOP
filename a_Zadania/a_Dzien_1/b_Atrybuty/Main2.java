package a_Zadania.a_Dzien_1.b_Atrybuty;


public class Main2 {

    public static void main(String[] args) {
        AccessModifier testModifier=new AccessModifier();
        testModifier.publicAttribute="jeden";
        testModifier.protectedAttribute=5;
        System.out.println(testModifier.publicAttribute);
        System.out.println(testModifier.protectedAttribute);

    }
}
