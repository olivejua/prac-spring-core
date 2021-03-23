package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;

public interface SalaryPolicy {

    int raisedAmount(Employee employee);
}
