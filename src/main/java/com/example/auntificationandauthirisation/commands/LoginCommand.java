package com.example.auntificationandauthirisation.commands;

import com.example.auntificationandauthirisation.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {
    public String execute(HttpServletRequest req, HttpServletResponse resp){
        String login = req.getParameter("login");
        System.out.println("login ==> " + login);
        String password = req.getParameter("password");
    }
}
