package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {

    //statyczne pole jest współdzielone przez wszystkie obiekty - ciekawostka
    private static int counter = 0;//nie dotyczy tego zadania
    private static String historyStatic;//nie dotyczy tego zadania
    private String[] history;

    public Calculator() {

        history = new String[0];
    }

    public double add(double a, double b) {
        double result = a + b;
        addHistoryAndRewrite("added " + a + " to " + b + " got " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        addHistoryAndRewrite("multipled " + a + " with " + b + " got " + result);
        return result;
    }

    public double subtruct(double a, double b) {
        double result = a - b;
        addHistoryAndRewrite("subtructed " + a + " from " + b + " got " + result);
        return a - b;
    }

    public double divide(double a, double b) {
        double result = a / b;
        addHistoryAndRewrite("divided " + a + " by " + b + " got " + result);
        return a / b;
    }

    public void addHistoryAndRewrite(String strNewHistoryRow) {
        String[] newTab = Arrays.copyOf(history, history.length + 1);
        newTab[history.length] = strNewHistoryRow;
        this.history = newTab;
    }

    public void printOperations() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }

    public void clearOperations() {
        String[] newTab = new String[0];
        this.history = newTab;
    }
}
