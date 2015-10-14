package com.structural.pattern.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
        //get MySql DB connection using connection parameters 
        return null;
    }
      
    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    	System.out.println("Generated Oracle PDF report");
    }
      
    public void generateOracleHTMLReport(String tableName, Connection  con){
        //get data from table and generate pdf report
    	System.out.println("Generated Oracle HTML report");
    }
    
}
