package com.codedifferently.lab.calc2;

public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object
        Calculator2 calc = new Calculator2();

        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party
        calc.originalPrice = 10;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 12;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 9;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 8;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 7;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 15;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 11;
        System.out.print("$");
        calc.findTotal();
        calc.originalPrice = 30;
        System.out.print("$");
        calc.findTotal();

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}
