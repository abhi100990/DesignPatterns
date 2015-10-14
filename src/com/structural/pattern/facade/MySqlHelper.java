package com.structural.pattern.facade;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters 
        return null;
    }
      
    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    	System.out.println("Generated MySql PDF report");
    }
      
    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    	System.out.println("Generated MySql HTML report");
    }

}
