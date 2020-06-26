package com.marlabs.bala.designpatterns.singleton;


import java.sql.*;
import java.io.*;

public class JDBCSingleton {

	private static JDBCSingleton jdbc;

	private JDBCSingleton()
	{

	}

	public static JDBCSingleton getJdbcSingleton()
	{
		if(jdbc == null)
		{
			jdbc = new JDBCSingleton();
		}

		return jdbc;
	}

	private static Connection getConnection() throws Exception
	{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bala" , "root","root");
		return con;
	}

	public int insert(String name,String pass) throws Exception
	{
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter =0;

		try {
			c = this.getConnection();
			ps = c.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps !=null)
			{
				ps.close();
			}
			if(c != null)
			{
				c.close();
			}
		}
		return recordCounter;
	}

	public void view(String name) throws Exception
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			con = this.getConnection();
			ps = con.prepareStatement("select * from userdata where uname = ?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("name : " + rs.getString(2)+ "\t" + "pass : " + rs.getString(3));
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			if(rs != null)
			{
				rs.close();
			}
			if(ps != null)
			{
				ps.close();
			}
			if(con != null)
			{
				con.close();
			}
		}
	}

	public int update (String name, String password) throws Exception
	{
		Connection c = null;
		PreparedStatement ps = null;
		int recordCount =0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");
			ps.setString(1, password);
			recordCount =ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(ps != null);
			{
				ps.close();
			}
			if(c!= null)
			{
				c.close();
			}

		}
		return recordCount;
	}
	public int delete(int id) throws Exception{  
		Connection c=null;  
		PreparedStatement ps=null;  
		int recordCounter=0;  
		try {  
			c=this.getConnection();  
			ps=c.prepareStatement(" delete from userdata where id='"+id+"' ");  
			recordCounter=ps.executeUpdate();  
		} catch (Exception e) 
		{ 
			e.printStackTrace(); 
			}   
		finally{  
			if (ps!=null){  
				ps.close();  
			}if(c!=null){  
				c.close();  
			}   
		}  
		return recordCounter;  
	}

}
