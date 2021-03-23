package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;

public interface SalaryService {
    Salary increaseSalary(Long employeeId);
}
