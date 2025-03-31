package com.academia.todoapp.logging;

import org.springframework.stereotype.Service;

@Service
public class ConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("[LOG] :) Academia Jira" + message);
    }
}
