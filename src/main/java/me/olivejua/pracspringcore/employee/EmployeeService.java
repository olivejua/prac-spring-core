package me.olivejua.pracspringcore.employee;

public interface EmployeeService {

    void hire(Employee employee);

    //callEmployee
    Employee findEmployee(Long employeeId);
}
