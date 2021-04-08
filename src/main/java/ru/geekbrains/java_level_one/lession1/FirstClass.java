package ru.geekbrains.java_level_one.lession1;

import static java.lang.System.*;

public class FirstClass {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
//      System.out.println("Orange\nBanana\nApple");
        System.out.println("Orange" + System.lineSeparator() + "Banana" + System.lineSeparator() + "Apple");
    }

    private static void checkSumSign () {
        int a = 0;
        int b = 2;
        if ( (a + b) >= 0 ) out.println("Positive sum");
        else {out.println("Negative sum");
        }
    }

    private static void printColor() {
        int value = 20;

        if (value <= 0) {
            out.println("\u001B[31mRed \u001B[0m"); //variables for colors would be better, but we didnt leaned String ))
        } else if (value > 100) {
            out.println("\u001B[32mGreen \u001B[0m");
        } else {
            out.println("\u001B[33mYellow \u001B[0m");
        }
    }

    private static void compareNumbers() {
        int a = 0;
        int b = 1;
        if (a >= b) out.println("a>=b");
            else out.println("a<b");
    }
}