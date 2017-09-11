package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDb 
{
	public ConnectDb()
	{
		
	}
	
	Connection conx;
    Statement st;
    public  Connection getConnection()
	{
	try
	{
		String url="jdbc:mysql://localhost:3306/airline";
		String user="root";
		String pwd="";
		Class.forName("com.mysql.jdbc.Driver");
		conx=DriverManager.getConnection(url,user,pwd);
			 
	}
	catch(Exception e)
	{
		System.out.println("Connexion Echoé");
				
	}
			
			return conx;
	}
    public Statement getStatement()
    {
    	try
		{
    		if(this.conx==null)
			{
				this.getConnection();
			}
			st=conx.createStatement();
			
		}
		catch(Exception e)
		{
            e.printStackTrace();			
		}
		return st;	
	}
	
}
