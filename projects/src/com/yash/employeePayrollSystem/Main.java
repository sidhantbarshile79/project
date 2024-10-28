package com.yash.employeePayrollSystem;

public class Main
{
    public static void main(String args[])
    {
        // create object
        PayrollSystem payrollSystem=new PayrollSystem();            // default constructor
        FullTimeEmployee emp1= new FullTimeEmployee("Siddhant", 1100960, 70000.00); // parameterised constructor
        PartTimeEmployee emp2= new PartTimeEmployee("Karan", 1100966, 45, 300);


        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details...");
        payrollSystem.displayEmployees();
        System.out.println("*******************************************************");
        System.out.println("Removing Employee...");
        payrollSystem.removeEmployee(1100966);
        System.out.println("*******************************************************");
        System.out.println("Remaining Employees Details...");
        payrollSystem.displayEmployees();
        System.out.println("*******************************************************");
    }
}
