package me.olivejua.pracspringcore;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.EmployeeService;
import me.olivejua.pracspringcore.employee.Position;
import me.olivejua.pracspringcore.salary.Salary;
import me.olivejua.pracspringcore.salary.SalaryService;

public class SalaryApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        EmployeeService employeeService = appConfig.employeeService();
        SalaryService salaryService = appConfig.salaryService();

        long employeeId = 1L;
        Employee employee = new Employee(employeeId, "employeeA", Position.STAFF, 30000000);
        employeeService.hire(employee);

        Salary salary = salaryService.increaseSalary(employeeId);

        System.out.println("salary = " + salary);
    }
}
