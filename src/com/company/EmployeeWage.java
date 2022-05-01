package com.company;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");


        int WAGE_PER_HOUR = 20;
        //int FULL_DAY_HOUR = 8;
        int PART_TIME_HOUR = 4;

        int dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        System.out.println(" Part time Daily Wage is "+ dailyWage);


    }
}
