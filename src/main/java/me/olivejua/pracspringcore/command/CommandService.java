package me.olivejua.pracspringcore.command;

public interface CommandService {
    Command assignWork(Long employeeId, Work work);
}
