package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {

    //statyczne pole jest współdzielone przez wszystkie obiekty - ciekawostka
    private static int counter = 0;//nie dotyczy tego zadania
    private static String historyStatic;//nie dotyczy tego zadania
    private String[] history;
    static String[] globalHistory = new String[0];

    public Calculator() {

        history = new String[0];
    }

    public double add(double a, double b) {
        double result = a + b;
        addHistoryAndRewrite("added " + a + " to " + b + " got " + result);
        addGlobalHistoryAndRewrite("dodano " + a + "+" + b);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        addHistoryAndRewrite("multipled " + a + " with " + b + " got " + result);
        addGlobalHistoryAndRewrite("Pomnożono " + a + "*" + b);
        return result;
    }

    public double subtruct(double a, double b) {
        double result = a - b;
        addHistoryAndRewrite("subtructed " + a + " from " + b + " got " + result);
        addGlobalHistoryAndRewrite("Odjęto " + a + "-" + b);
        return a - b;
    }

    public double divide(double a, double b) {
        double result = a / b;
        addHistoryAndRewrite("divided " + a + " by " + b + " got " + result);
        addGlobalHistoryAndRewrite("Podzielono " + a + "/" + b);
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

    public static void addGlobalHistoryAndRewrite(String strNewGlobalHistoryRow) {
        String[] newTab = Arrays.copyOf(globalHistory, globalHistory.length + 1);
        newTab[globalHistory.length] = strNewGlobalHistoryRow;
        globalHistory = newTab;
    }

    public static void printGlobalOperations() {
        for (String oneHistory : Calculator.globalHistory) {
            System.out.println(oneHistory);
        }
    }

    public static void printGlobalOperations(int length) {
        int start = 0;
        if (globalHistory.length > length) {
            start = globalHistory.length - length;
        }
        for (int i = start; i < globalHistory.length; i++) {
            System.out.println(globalHistory[i]);
        }
    }

    public static void printGlobalOperations(String length) {
        boolean isNumeric = true;
        int len = 0;
        try {
            len = Integer.parseInt(length);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość " + length + " nie jest liczbą!");
            isNumeric = false;
        }
        if (isNumeric == true) {
            int start = 0;
            if (globalHistory.length > len) {
                start = globalHistory.length - len;
            }
            for (int i = start; i < globalHistory.length; i++) {
                System.out.println(globalHistory[i]);
            }
        }
    }

}
