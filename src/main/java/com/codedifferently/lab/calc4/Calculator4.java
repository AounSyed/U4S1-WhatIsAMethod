package com.codedifferently.lab.calc4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name, int totalPeople){
        double total = (Math.round(price * (1+tax+tip)) * Math.pow(10, 2) / Math.pow(10, 2) / totalPeople);
        double tableTotal = total * totalPeople;
        return tableTotal;

    }
}
