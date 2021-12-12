/*
 * @authors: Arsalan Arif Radhu
 * @date: 13 December, 2021
 * @program: OOP3200 - Java Lab 4
 * @description: Abstract superclass that inherits from employee class
 * and is able to instantiate SalariedEmployee objects
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{

    //INSTANCE VARIABLES
    private double annualSalary;

    //ACCESSOR AND MUTATOR
    public double getAnnualSalary()
    {
        //Calculate pay on getter
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        double MIN_NUM = 0;
        double MAX_NUM = Double.MAX_VALUE;

        this.annualSalary = ValidateNumerals(annualSalary, MIN_NUM, MAX_NUM);
    }

    //PARAMETERIZED CONSTRUCTOR
    public SalariedEmployee(String id, String fullName, LocalDate birthDate, double annualSalary) {
        super(id, fullName, birthDate);
        setAnnualSalary(annualSalary);
    }

    //METHOD
    @Override
    public double calculatePayDay()
    {
        int WEEKS = 52;
        double weeklyPay = annualSalary / WEEKS;

        return weeklyPay;
    }
}
