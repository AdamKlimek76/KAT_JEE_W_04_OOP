package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    final static double PI = 3.14159265;


    public double pow(double a, double b) {
        //int b
        //double result=1;
        //for (int i=0; i<b; i++){
        //result*=base;}

        double result = Math.pow(a, b);
        super.addHistoryAndRewrite(a + "^" + b + " equals " + result);
        Calculator.addGlobalHistoryAndRewrite("Potęgowanie" + a + b);
        return result;
    }

    public double root(double a, double b) {
        double result = Math.pow(a, 1 / b);
        super.addHistoryAndRewrite(b + " root of  " + a + " equals " + result);
        Calculator.addGlobalHistoryAndRewrite("Pierwiastkowanie" + a + b);
        return result;
    }

    public static double computeCircleArea(double r) {
        double result=PI*r*r;
        addGlobalHistoryAndRewrite("Pole koła o promieniu " + r + "wynosci " + r);
        return result;
    }


}
