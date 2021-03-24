package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.AppConfig;
import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.EmployeeService;
import me.olivejua.pracspringcore.employee.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryServiceTest {

    EmployeeService employeeService;
    SalaryService salaryService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        employeeService = appConfig.employeeService();
        salaryService = appConfig.salaryService();
    }

    @Test
    void increaseSalary() {

        long employeeId = 1L;
        Employee employee = new Employee(employeeId, "employeeA", Position.STAFF, 30000000);
        employeeService.hire(employee);

        Salary salary = salaryService.increaseSalary(employeeId);
        Assertions.assertThat(salary.getRaisedAmount()).isEqualTo(10000000);
    }
}