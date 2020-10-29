package com.kodilla.calculator;

import java.util.Objects;

public class Calculator {

    public Calculator(String result) {
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {

        return a - b;
    }

}

class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("Result");

        int result= 10;
        if (!Objects.equals(result, "Result")) {
            System.out.println("Error!");
        } else {
            System.out.println("test OK");
        }

        int addResult = calculator.add(8, 2);
        int subResult = calculator.subtract(15, 5);

        if (addResult == 10)  {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        if (subResult==10) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }
    }
}

