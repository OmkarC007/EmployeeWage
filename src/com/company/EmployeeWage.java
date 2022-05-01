package com.company;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");


        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily Wage is "+ dailyWage);
    }
}
