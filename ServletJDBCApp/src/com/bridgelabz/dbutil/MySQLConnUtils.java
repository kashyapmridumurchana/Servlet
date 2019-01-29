package com.bridgelabz.dbutil;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.bridgelabz.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class MySQLConnUtils 
{
	// Connect to MySQL
	public static Connection getMySQLConnection() throws SQLException,
	ClassNotFoundException {
		String hostName = "localhost";

		String dbName = "ServletProject";
		String userName = "root";
		String password = "root";

	return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName,String userName, String password) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");

		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

		Connection conn = DriverManager.getConnection(connectionURL, userName,password);
		return conn;
	} 
	
	public static void registration(User user) throws ClassNotFoundException, SQLException
	{
		String string="insert into User(id,name,password,email,telno) values(?,?,?,?,?) ";
	 Connection connection = getMySQLConnection();
	
	PreparedStatement preparedStatement=connection.prepareStatement(string);
	preparedStatement.setInt(1,0);
	preparedStatement.setString(2, user.getName());
	preparedStatement.setString(3, user.getPassword());
	preparedStatement.setString(4, user.getEmail());
	preparedStatement.setLong(5, user.getTel());	 
	preparedStatement.execute();	
	connection.close();	 
	       
	}
	
	public static User login(User user) throws ClassNotFoundException, SQLException
	{
	String string="Select * from User where name=? and password=?";
	Connection conn=getMySQLConnection();
	PreparedStatement ps=conn.prepareStatement(string);
	ps.setString(1, user.getName());
	ps.setString(2, user.getPassword());
	ResultSet resultSet=ps.executeQuery();
	User user1=null;
	 while (resultSet.next()) 
	 {
  user1=new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getLong(5));		
       
     }
	return user1;
		
	}
	public static void edit(User user) throws ClassNotFoundException, SQLException
	{
		String query = "UPDATE User SET email = ? ,password=? ,telNo=? WHERE name = ?";
		Connection conn=getMySQLConnection();
		 PreparedStatement stmt = conn.prepareStatement(query);
		 stmt.setString(1, user.getEmail());
		 stmt.setString(2, user.getPassword());
		 stmt.setString(4, user.getName());
		 stmt.setLong(3, user.getTel());
		 int i=stmt.executeUpdate();
		 System.out.println(i);
}
	
}
