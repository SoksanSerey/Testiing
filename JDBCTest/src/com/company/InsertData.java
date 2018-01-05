package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData
{
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root", "");
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO students VALUES (?,?,?)");
            preparedStatement.setString(1,"Vignesh");
            preparedStatement.setInt(2, 125);
            preparedStatement.setInt(3,3);
            System.out.println("Entering Value successfully");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
