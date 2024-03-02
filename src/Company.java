/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Company {



    private String companyName;
    private ArrayList<Employee> staff;

    // Default constructor
    public Company() {
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();
    }

    // Overloaded constructor
    public Company(String name) {
        this.companyName = name;
        this.staff = new ArrayList<>();
    }

    // Add new staff member
    public void addNewStaff(Employee employee) {
        this.staff.add(employee);
    }

    // Get the number of staff
    public int getStaffNumber() {
        return this.staff.size();
    }

    // List employees above a certain employee number
    public void listEmployees(int empNum) {
        Iterator<Employee> it = staff.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpNum() > empNum) {
                System.out.println(emp.getName());
            }
        }
    }

    // Remove a staff member
    public void removeStaff(int empNum) {
        staff.removeIf(emp -> emp.getEmpNum() == empNum);
    }
}


