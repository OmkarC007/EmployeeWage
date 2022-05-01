package com.company;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() *10)  % 2;
        if(empCheck == 1){
            System.out.println("present");
        }else{
            System.out.println("Absent");
        }
    }
}
