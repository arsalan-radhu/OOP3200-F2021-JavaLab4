/*
 * @authors: Arsalan Arif Radhu
 * @date: 13 December, 2021
 * @program: OOP3200 - Java Lab 4
 * @description: Abstract superclass that inherits from employee class
 * and is able to instantiate HourlyWorker objects
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    //INSTANCE VARIABLES
    private double hourlyRate = 0.0;
    private double hoursPerWeek = 0.0;

    private double pay = 0.0;

    //ACCESSORS AND MUTATORS
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        double MINIMUM_WAGE = 17.0;
        double MAXIMUM_WAGE = Double.MAX_VALUE;

        this.hourlyRate = ValidateNumerals(hourlyRate, MINIMUM_WAGE, MAXIMUM_WAGE);

    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        double MINIMUM_HOURS = 0;
        double MAXIMUM_HOURS= 48;

        this.hoursPerWeek = ValidateNumerals(hoursPerWeek, MINIMUM_HOURS, MAXIMUM_HOURS);
    }

    //Pay method
    public double getPay()
    {
        return pay;
    }

    public void setPay(double hourlyRate, double hoursPerWeek)
    {
        this.pay = calculatePayDay();
    }


    //PARAMETERIZED CONSTRUCTOR
    public HourlyWorker(String id, String fullName, LocalDate birthDate, double hourlyRate, double hoursPerWeek) {
        super(id, fullName, birthDate);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
        setPay(hourlyRate, hoursPerWeek);
    }

    @Override
    public double calculatePayDay()
    {
        double salary = hourlyRate*hoursPerWeek;
        return salary;
    }
}
