/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Employee {
    
   
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1;

    // Constructor with default values
    public Employee() {
        this.name = "Unknown";
        this.email = "noemail@domain.com";
        this.empNum = nextEmpNum++;
    }

    // Constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    // Method to set email
    public void setEmail(String email) {
    if (email.contains("@") && email.contains(".") && email.length() > 3) {
        this.email = email;
    }
}


    // Static method to get the next employee number
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
    
}


