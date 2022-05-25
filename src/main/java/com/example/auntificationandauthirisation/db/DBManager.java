package com.example.auntificationandauthirisation.db;

import com.example.auntificationandauthirisation.db.entity.User;

import java.sql.*;

public class DBManager {

    private static final String CONNECTION_URL = null;
    //singleton
    private static DBManager instance;

    public static synchronized DBManager getInstance(){
        if(instance == null){
            instance = new DBManager();
        }
        return instance;
    }

    private DBManager(){

    }

    private static final String SQL_FIND_USER_BY_LOGIN = "SELECT * FROM users where login=?";
    public User findUser(String login){
        try(Connection con = getConnection()){
            PreparedStatement preparedStatement = con.prepareStatement(SQL_FIND_USER_BY_LOGIN);
            preparedStatement.setString(1,login);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                return extractUser(rs);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private User extractUser(ResultSet rs) {
        User   user = new User();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
    }

    private Connection getConnection() {
        return DriverManager.getConnection(CONNECTION_URL);
    }
}

