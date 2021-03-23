package me.olivejua.pracspringcore.command;

import me.olivejua.pracspringcore.employee.Employee;

public class CommandPlanA implements CommandPlan {
    @Override
    public Work assign(Employee employee) {
        switch (employee.getPosition()) {
            case MANAGER:
                return Work.GIVE_PRESENTATION;
            case GENERAL_MANAGER:
                return Work.EXAMINE_PRODUCTS;
            case ASSISTANT_MANAGER:
                return Work.WRITE_DOCUMENTS;
            default:
                return Work.COPY_DOCUMENTS;
        }
    }
}
