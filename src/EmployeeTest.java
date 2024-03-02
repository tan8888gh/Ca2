/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class EmployeeTest {
 
    public static void main(String[] args) {
        // Creating 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Declaring and loading the projectGroup array
        Employee[] projectGroup = {emp1, emp2, emp3};

        // Printing the nextEmpNum
        System.out.println("Next Employee Number: " + Employee.getNextEmpNum());

        // Variable m for comparison (example value)
        int m = 2;
        // Searching and displaying names of employees with empNum > m
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
    }
}


