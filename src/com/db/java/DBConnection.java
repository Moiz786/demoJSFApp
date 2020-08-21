package com.db.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		 Connection conn = null;
         String url = "jdbc:sqlserver://localhost:1433;databaseName=employeeDB;";
         //String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String userName = "sa"; 
         String password = "Avanza123";
         Statement stmt;
         try{
        	 //Class.forName(driver);//.newInstance();
             conn = DriverManager.getConnection(url,userName,password);
             
             System.out.println("Connected!!!");
             String query = "INSERT INTO [dbo].[employee_details]([empName],[designation],[salary])"
            		 +"VALUES('Meesam Ali','SQA',75000)";
             stmt = conn.createStatement();
             int rows = stmt.executeUpdate(query);
             
             if(rows>0){
            	 System.out.println("Row inserted");
             }
             
         }
         catch(Exception e){
        	 e.printStackTrace();
         }
         finally{
        	 if(conn!=null){
        		 conn.close();
        	 }
         }
	}
	
}
