package com.example.supplychainmanagement;
import  java.sql.*;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/supply_chain";
    private static final String USER = "root";
    private static final String PASS = "Manjusri@44";

    public Statement getStatement(){
        Statement statement = null;
        Connection conn;
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = conn.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
        return statement;
    }

    public ResultSet getQueryTable(String query){
        Statement statement = getStatement();
        try {
            return statement.executeQuery(query);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public int insertData(String query){
        Statement statement = getStatement();
        try {
            return statement.executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
//    public static void main(String[] args){
//        DatabaseConnection dbConn = new DatabaseConnection();
//
//        String query = "SELECT * FROM customer";
//        ResultSet rs = dbConn.getQueryTable(query);
//        try{
//            while (rs!=null && rs.next()){
//               System.out.println("Fetched Result");
//               System.out.println(" cid: "+rs.getInt("cid")+" name: " +
//                       rs.getString("first_name")+ " email: "+ rs.getString("email"));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
