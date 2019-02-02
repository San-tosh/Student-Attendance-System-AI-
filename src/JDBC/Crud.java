/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SuperNatural
 */
public class Crud {

    String countryname, continen;
    int countryid;

    static final String url = "jdbc:mysql://localhost/StudentAttendance";
    static final String driver = "com.mysql.jdbc.Driver";

    static Statement stmt;
    static Connection con;

    public static Connection makeConnection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();
            if (con != null) {
                // System.out.println("connnection success");
            }
        } catch (Exception e) {
            System.out.println("connection" + e);
        }
        return con;
    }

    public static void insert(String name[]) throws SQLException {
        int flag = 0;
        String studentname[] = {"Ajit", "Sushant", "Bikrant", "Shirish", "Bibek", "Saurav", "Risha", "Ronit",
            "Rajat", "Sagar", "Alisha", "Utsav", "Ashma", "Sushmita", "Purnima", "Poonam", "Sabina",
            "Silu", "Sweta", "Praneet", "Anish", "Sureson", "Manish", "Sumeeran", "Samip", "Subhaneet", "Santosh", "Sarthak"};
        String query = null;
        makeConnection();
        queryexecute("deletion", "delete from studentattendane;");
        for (int i = 0; i < studentname.length; i++) {
            flag = 0;
            for (int j = 0; j < name.length; j++) {

                if (studentname[i].equals(name[j])) {

                    query = "insert into studentattendane VALUES(" + i + "," + "'" + studentname[i] + "'," + "' present'" + ");";
                    queryexecute("insertion", query);
                    flag = 1;
                } else {
                    if (j == name.length - 1 && flag == 0) {
                        query = "insert into studentattendane VALUES(" + i + "," + "'" + studentname[i] + "'," + "'absent'" + ");";
                        queryexecute("insertion", query);
                    }
                }

            }
        }
        stmt.close();
        con.close();
    }

    static void queryexecute(String action, String query) {

        try {
            int res = stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ResultSet rs;

    static void createTable() {

        makeConnection();
        String query = "CREATE TABLE countries(country_id int,country_name VARCHAR(20),continent VARCHAR(12));";
        queryexecute("Table", query);

    }

    public void update() {

        makeConnection();

        //      String query = "update countries set country_name='" + countryname + "'" + ",continent=" + "'" + continen + "'" + " where country_id=" + countryid + ";";
        //String query="update countries set country_name='Nepal',continent='Asia' where country_id=1;";
        //    queryexecute("Update", query);
    }

    public void delete() {

        makeConnection();
        //String query="update countries set country_name='"+countryname+"'"+",continent="+"'"+continen+"'"+" where country_id="+1+";";
        //multiple executeUpdate can be done

//        String query = "delete from countries where country_id=" + countryid + ";";
        //  queryexecute("Deletion", query);
    }

}
