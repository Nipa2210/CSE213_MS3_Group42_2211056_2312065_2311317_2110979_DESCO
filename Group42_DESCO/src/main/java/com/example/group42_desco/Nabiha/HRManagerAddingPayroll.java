package com.example.group42_desco.Nabiha;

public class HRManagerAddingPayroll {
    private String designation;
    private int salary;

    public HRManagerAddingPayroll(int salary, String designation) {
        this.salary = salary;
        this.designation = designation;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "HRManagerAddingPayroll{" +
                "designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}





