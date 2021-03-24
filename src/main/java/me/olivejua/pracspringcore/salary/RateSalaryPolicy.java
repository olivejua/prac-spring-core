package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.Position;

public class RateSalaryPolicy implements SalaryPolicy {

    private int amount = 20;

    @Override
    public int raisedAmount(Employee employee) {
        if (employee.getPosition() != Position.INTERN) {
            return employee.getSalary() * amount / 100;
        } else {
            return 0;
        }
    }
}
