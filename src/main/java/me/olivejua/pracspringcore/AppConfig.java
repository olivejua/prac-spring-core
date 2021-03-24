package me.olivejua.pracspringcore;

import me.olivejua.pracspringcore.employee.EmployeeRepository;
import me.olivejua.pracspringcore.employee.EmployeeService;
import me.olivejua.pracspringcore.employee.EmployeeServiceImpl;
import me.olivejua.pracspringcore.employee.MemoryEmployeeRepository;
import me.olivejua.pracspringcore.salary.*;

public class AppConfig {

    public EmployeeService employeeService() {
        return new EmployeeServiceImpl(employeeRepository());
    }

    public SalaryService salaryService() {
        return new SalaryServiceImpl(
                employeeRepository(),
                salaryPolicy()
        );
    }

    public EmployeeRepository employeeRepository() {
        return new MemoryEmployeeRepository();
    }

    public SalaryPolicy salaryPolicy() {
        return new RateSalaryPolicy();
    }
}
