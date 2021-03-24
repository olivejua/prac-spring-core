package me.olivejua.pracspringcore;

import me.olivejua.pracspringcore.employee.*;

public class EmployeeApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        EmployeeService employeeService = appConfig.employeeService();
        Employee employee = new Employee(1L, "employeeA", Position.STAFF, 30000000);
        employeeService.hire(employee);

        Employee findEmployee = employeeService.findEmployee(employee.getId());
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("findEmployee.getName() = " + findEmployee.getName());
    }
}
