package db;

import java.util.List;
import com.airline.models.Passenger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class PassengerDAOImp implements PassengerDAO
{
	private ConnectDb connection = new ConnectDb();
	private Connection conn;
	private Statement stmt;
	
	public PassengerDAOImp()
	{
		//empty
	}

	@Override
	public List<Passenger> getAllPassenger() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addPassenger(Passenger p)
	{
		try
		{
			String req="INSERT INTO passenger(firstName,lastName,dob,gender) VALUES (?,?,?,?)";
			PreparedStatement pr=connection.getConnection().prepareStatement(req);
			pr.setString(1, p.getFirstName());
			pr.setString(2,p.getLastName());
			pr.setDate(3,(java.sql.Date) p.getDob());
			pr.setObject(4, p.getGender());
			pr.executeUpdate();
			return 1;
		}
		catch(Exception ex)
		{
			System.out.println("Error message"+ex.getMessage());
			return 0;
		}
	}

	@Override
	public int removePassenger(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePassenger(int id, Passenger p)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Passenger findPassengerById(int numero)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger findPassengerByName(String name) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
