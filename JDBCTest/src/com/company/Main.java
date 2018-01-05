package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root","");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM students");
            int id=0,room = 0;
            String name = null;

            while(resultSet.next())
            {
                id = resultSet.getInt("id");
                name= resultSet.getString("name");
                room = resultSet.getInt("room_num");

                System.out.println(""+id+" : "+name+" : "+room);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
