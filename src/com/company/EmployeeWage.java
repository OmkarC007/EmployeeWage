package com.company;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int WORK_DAYS = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int dailyWage = 0;
        int workDaysPerMonth = 0;
        int totalWage = 0;
        for(int i=1; i<=20; i++){
            double empCheck = Math.floor(Math.random() * 10)%3;
            switch((int) empCheck){
                case IS_FULL_TIME :
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Daily Wage is "+ dailyWage);
//                    workDaysPerMonth = WORK_DAYS * dailyWage;
//                    System.out.println("wages for a month "+ workDaysPerMonth);
                    break;
                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Daily Wage is "+ dailyWage);
//                    workDaysPerMonth = WORK_DAYS * dailyWage;
//                    System.out.println("wages for a month "+ workDaysPerMonth);
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage = totalWage + dailyWage;
        }
        System.out.println("total wage "+ totalWage);
    }
}

