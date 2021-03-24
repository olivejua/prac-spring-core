package me.olivejua.pracspringcore.employee;

import me.olivejua.pracspringcore.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeServiceTest {

    EmployeeService employeeService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        this.employeeService = appConfig.employeeService();
    }

    @Test
    public void join() {
        //given
        Employee employee = new Employee(1L, "employeeA", Position.STAFF, 30000000);

        //when
        employeeService.hire(employee);
        Employee findEmployee = employeeService.findEmployee(employee.getId());

        //then
        Assertions.assertThat(employee).isEqualTo(findEmployee);

    }
}
