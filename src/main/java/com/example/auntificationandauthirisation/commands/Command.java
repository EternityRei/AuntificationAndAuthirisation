package com.example.auntificationandauthirisation.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    default String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return null;
    }
}
