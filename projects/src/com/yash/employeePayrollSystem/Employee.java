package com.yash.employeePayrollSystem;

abstract class Employee
{
    private String name;
    private int id;

    //constructor
    public Employee(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    //Encapsulation
    public String getName()             //give to access to the user to get the particular variable value.
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

    //abstract method. - we can't provide body & can't implement it. we only declare the method.
    public abstract double calculateSalary();

    @Override   //polymorphism
    public String toString()
    {
        return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}
