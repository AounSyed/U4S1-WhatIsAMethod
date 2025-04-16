package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends


        //Find and print the entire table's total, including tax and tip
        System.out.println("Total amount: $" +
                (calc.findTotal(10, "Kevin", 6) +
                        calc.findTotal(12, "Isiah", 6) +
                        calc.findTotal(9, "John", 6) +
                        calc.findTotal(8,  "Terrance", 6) +
                        calc.findTotal(7, "Rick", 6) +
                        /*calc.findTotal(0, "Alex", 0) + */
                        calc.findTotal(11, "Manny", 6)
                        /* calc.findTotal(0, "Forgetful", 6)*/));
    }
}
