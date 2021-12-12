/*
 * @authors: Arsalan Arif Radhu
 * @date: 13 December, 2021
 * @program: OOP3200 - Java Lab 4
 * @description: Application demonstrates the different attributes of each class.
 */

package ca.durhamcollege;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws ParseException {

        try
        {
            // Assign attributes to Employee 1
            SalariedEmployee Employee1 = new SalariedEmployee("10000001", "Random Salaried Employee", LocalDate.of(2000, 1, 14), 35000);

            // Used to display numbers in currency
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            // Displays ExtendedWorkTicket constructors
            System.out.println("\nSalaried Worker Payroll Information " +
                    "\nID           : " + Employee1.getEmployeeId() +
                    "\nName         : " + Employee1.getName() +
                    "\nAge          : " + Employee1.getAge() +
                    "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));

            // Sets new value for Employee 1 yearly Salary
            Employee1.setYearlySalary(50000);

            // Re-displays ExtendedWorkTicket constructors for Employee 1
            System.out.println("\nSalaried Worker Payroll Information after pay increase " +
                    "\nID           : " + Employee1.getEmployeeId() +
                    "\nName         : " + Employee1.getName() +
                    "\nAge          : " + Employee1.getAge() +
                    "\nYearly Salary: " + currency.format(Employee1.getYearlySalary()));


            // Assign attributes to Employee 2
            HourlyWorker Employee2 = new HourlyWorker("20000001", "Random Hourly Worker", LocalDate.of(1989, 2, 19), 30, 40);

            // Displays ExtendedWorkTicket constructors
            System.out.println("\nHourly Worker Payroll Information" +
                    "\nID            : " + Employee2.getEmployeeId() +
                    "\nName          : " + Employee2.getName() +
                    "\nAge           : " + Employee2.getAge() +
                    "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                    "\nHours Per Week: " + Employee2.getHoursPerWeek());

            // Sets new value for Hourly rate and Hours worked for Employee 2
            Employee2.setHourlyRate(32);
            Employee2.setHoursPerWeek(30);

            // Re-displays ExtendedWorkTicket constructors
            System.out.println("\nHourly Worker Payroll Information after pay increase" +
                    "\nID            : " + Employee2.getEmployeeId() +
                    "\nName          : " + Employee2.getName() +
                    "\nAge           : " + Employee2.getAge() +
                    "\nHourly Pay    : " + currency.format(Employee2.getHourlyRate()) +
                    "\nHours Per Week: " + Employee2.getHoursPerWeek());

            // Array to display employees
            Employee[] employeeArray = new Employee[5];

            // Assign attributes to array indexes
            employeeArray[0] = new HourlyWorker("20000002", "John Doe", LocalDate.of(1991, 04, 11), 22, 30);
            employeeArray[1] = new HourlyWorker("20000003", "Jack Neil", LocalDate.of(1987, 1, 22), 27, 38);
            employeeArray[2] = new HourlyWorker("20000004", "Luigi Pane", LocalDate.of(1998, 8, 10), 20, 48);
            employeeArray[3] = new SalariedEmployee("10000002", "Arif Khwa", LocalDate.of(1972, 2, 18), 150000);
            employeeArray[4] = new SalariedEmployee("10000003", "Viqar Radh", LocalDate.of(1978, 5, 3), 80000);

            // Output Header
            System.out.println("========================================\n");
            System.out.println("\n================================================");
            System.out.println("\t\t\t\t\tPayroll");
            System.out.println("------------------------------------------------");
            System.out.print("Employee ID\t\t\tFull Name\t\tWeekly Wage\n");
            System.out.println("================================================");

            // Declares total pay
            double totalPay = 0.0;

            // Displays different indexes from employee away, well formatted
            for(int i = 0; i < employeeArray.length; i++)
            {
                System.out.print(employeeArray[i].getEmployeeId() + "\t\t\t");
                System.out.print(employeeArray[i].getName()  + "\t\t");
                System.out.print(currency.format(employeeArray[i].calculatePayDay())  + "\n");

                // Sums pay of each employee
                totalPay += employeeArray[i].calculatePayDay();
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Total:\t\t\t\t\t\t\t\t"+ currency.format(totalPay));

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Exception occurred: " + illegalArgumentException.getMessage());
        }

    }

}
