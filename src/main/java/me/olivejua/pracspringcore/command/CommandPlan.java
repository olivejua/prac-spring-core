package me.olivejua.pracspringcore.command;

import me.olivejua.pracspringcore.employee.Employee;

public interface CommandPlan {

    Work assign(Employee employee);
}
