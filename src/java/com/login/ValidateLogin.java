package com.login;

import java.sql.*;

public class ValidateLogin {
    
    String url = "jdbc:mysql://localhost:3306/jdbc";
    String dbUsername = "root";
    String dbPassword = "admin";
    
    public boolean validateLogin(String username, String password) throws ClassNotFoundException, SQLException {
        
        String query = "select * from login where username = '" + username +  "' and pass = '" + password + "'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(query);
        
        Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs.next();
    }
}
