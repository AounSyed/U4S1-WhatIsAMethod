package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)
        System.out.printf("Person 1: $%.1f%n", (10.0 + (10 * 0.05) + (10 * 0.15)));
        System.out.printf("Person 2: $%.1f%n", (12.0 + (12 * 0.05) + (12 * 0.15)));
        System.out.printf("Person 3: $%.1f%n", (9.0 + (9 * 0.05) + (9 * 0.15)));
        System.out.printf("Person 4: $%.1f%n", (8.0 + (8 * 0.05) + (8 * 0.15)));
        System.out.printf("Person 5: $%.1f%n", (7.0 + (7 * 0.05) + (7 * 0.15)));
        System.out.printf("Person 6: $%.1f%n", (15.0 + (15 * 0.05) + (15 * 0.15)));
        System.out.printf("Person 7: $%.1f%n", (11.0 + (11 * 0.05) + (11 * 0.15)));
        System.out.printf("Person 8: $%.1f%n", (30.0 + (30 * 0.05) + (30 * 0.15)));
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

    }
}
