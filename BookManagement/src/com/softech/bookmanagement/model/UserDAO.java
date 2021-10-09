/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.bookmanagement.model;


import com.softech.bookmanagement.helpers.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Nguyen Bae
 */
public class UserDAO {
    public User checkLogin(String username, String password) throws Exception{
        String query = "Select username, password from User";
        try(
                Connection conn = DatabaseHelper.connectSQLServer();
                PreparedStatement pstmt = conn.prepareStatement(query);
            ){
            
        }
        catch()
        {
            
        }
    }
}
