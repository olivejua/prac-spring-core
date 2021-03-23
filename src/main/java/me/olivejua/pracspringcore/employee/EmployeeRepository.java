package me.olivejua.pracspringcore.employee;

public interface EmployeeRepository {
    void save(Employee employee);

    Employee findById(Long employeeId);
}
