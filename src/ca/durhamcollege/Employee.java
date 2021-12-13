/*
 * @authors: Arsalan Arif Radhu
 * @date: 13 December, 2021
 * @program: OOP3200 - Java Lab 4
 * @description: Abstract superclass that inherits from the parent class
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class Employee extends Person {
    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */

    //INSTANCE VARIABLES
    final String employeeId;
    int MIN_NUM = 8;
    int MAX_NUM = Integer.MAX_VALUE;

    // Parameterized Constructor
    public Employee(final String id, String fullName, LocalDate birthDate)
    {
        super(fullName, birthDate);
        this.employeeId = ValidateID(id, MIN_NUM, MAX_NUM);
    }

    //ACCESSORS
    public String getEmployeeId()
    {
        return employeeId;
    }


    //METHOD
    public double calculatePayDay()
    {
        double salary = 0.0;
        return salary;
    }

    // Function that validates the ID
    public String ValidateID(String num, int MIN_NUM, int MAX_NUM)
    {
        if(num.length() > MIN_NUM)
        {
            throw new IllegalArgumentException("Please enter a number less than or equal to" + MIN_NUM + ", positive number\n");
        }
        else
        {
            return num;
        }
    }

    // Function that validates data
    public double ValidateNumerals(double num, double MIN_NUM, double MAX_NUM) {
        if (num < MIN_NUM || num > MAX_NUM) {
            throw new IllegalArgumentException("Please enter a number greater than or equal to " + MIN_NUM + " and less than " + MAX_NUM + "\n");
        } else {
            return num;
        }
    }
}
