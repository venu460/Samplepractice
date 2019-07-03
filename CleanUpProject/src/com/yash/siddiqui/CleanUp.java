package com.yash.siddiqui;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author siddiqui.mahboob
 *
 */
public class CleanUp {
	public static Connection connection = null;
	public static Statement stmt = null;
	public static String readLine = "";

	/**
	 * @param driveripAddressAnddatabasename
	 *            This variable for JDBC driver, IP address of database, database
	 *            name.
	 * @param Username
	 *            This variable is used for login into database as user name.
	 * @param Password
	 *            This variable is used for login into database as password.
	 * 
	 *            This Method perform the cleanup activity from the data base
	 *            cumulus4operationaldb.
	 */
	public void cleanUpActivity(String driveripAddressAnddatabasename, String Username, String Password) {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(driveripAddressAnddatabasename, Username, Password);
			//System.out.println("database connected successfully");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		try {
			File file = new File("data//DataDeletionQueries.txt");
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			System.out.println("Database Cleanup Activity Started.");
			System.out.println("Please Wait Data is getting deleted from data base..........");
				while ((readLine = buffer.readLine()) != null) {
				try {
					stmt = connection.createStatement();
					System.out.println("Running this DB Query : " + readLine);
					stmt.executeUpdate(readLine);
					stmt.close();
					
				} catch (Exception e) {
					System.err.println(e.getClass().getName() + ": " + e.getMessage());
					System.exit(0);
				}
				
			}
			buffer.close();
			try {
				System.out.println("Database Cleanup Activity completed.");
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		CleanUp ps=new CleanUp();
		ps.cleanUpActivity("jdbc:postgresql://10.0.18.164:5432/cumulus4operationaldb", "sqauser", "letmein123!");
		
	}
	
	
	
}
