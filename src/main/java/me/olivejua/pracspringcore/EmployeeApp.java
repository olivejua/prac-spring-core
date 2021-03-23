package me.olivejua.pracspringcore;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.EmployeeService;
import me.olivejua.pracspringcore.employee.EmployeeServiceImpl;
import me.olivejua.pracspringcore.employee.Position;

public class EmployeeApp {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new Employee(1L, "employeeA", Position.STAFF, 30000000);
        employeeService.hire(employee);

        Employee findEmployee = employeeService.findEmployee(employee.getId());
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("findEmployee.getName() = " + findEmployee.getName());
    }
}
