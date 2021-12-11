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
    public Employee(String fullName, LocalDate birthDate) {
        super(fullName, birthDate);
    }
}
