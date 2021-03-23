package me.olivejua.pracspringcore.salary;

import me.olivejua.pracspringcore.employee.Employee;
import me.olivejua.pracspringcore.employee.Position;

public class FixSalaryPolicy implements SalaryPolicy {

    private int amount = 10000000; // 천만원 인상


    @Override
    public int raisedAmount(Employee employee) {
        if (employee.getPosition() != Position.INTERN) {
            return amount;
        } else {
            return 0;
        }
    }
}
