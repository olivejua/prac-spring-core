package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.EmployeeRepository;
import me.olivejua.pracspringcore.employee.MemoryEmployeeRepository;

public class SalaryServiceImpl implements SalaryService {

    private final EmployeeRepository employeeRepository;
    private final SalaryPolicy salaryPolicy;

    public SalaryServiceImpl(EmployeeRepository employeeRepository, SalaryPolicy salaryPolicy) {
        this.employeeRepository = employeeRepository;
        this.salaryPolicy = salaryPolicy;
    }

    @Override
    public Salary increaseSalary(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId);
        int raisedAmount = salaryPolicy.raisedAmount(employee);

        return new Salary(employee, raisedAmount);
    }
}
