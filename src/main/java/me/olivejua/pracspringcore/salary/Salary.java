package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;

public class Salary {
    private Employee employee;
    private int raisedAmount;

    public Salary(Employee employee, int raisedAmount) {
        this.employee = employee;
        this.raisedAmount = raisedAmount;
    }

    public int calculateSalary() {
        return employee.getSalary() + raisedAmount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getRaisedAmount() {
        return raisedAmount;
    }

    public void setRaisedAmount(int raisedAmount) {
        this.raisedAmount = raisedAmount;
    }

    @Override
    public String toString() {
        return "SalaryAdjustment{" +
                "employee=" + employee +
                ", raisedAmount=" + raisedAmount +
                '}';
    }
}


