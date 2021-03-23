package me.olivejua.pracspringcore.command;

public class Command {
    private Long employeeId;
    private Work assignedWork;

    public Command(Long employeeId, Work assignedWork) {
        this.employeeId = employeeId;
        this.assignedWork = assignedWork;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Work getAssignedWork() {
        return assignedWork;
    }

    public void setAssignedWork(Work assignedWork) {
        this.assignedWork = assignedWork;
    }

    @Override
    public String toString() {
        return "Command{" +
                "employeeId=" + employeeId +
                ", assignedWork=" + assignedWork +
                '}';
    }
}
