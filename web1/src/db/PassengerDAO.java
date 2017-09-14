package db;
import java.util.List;
import com.airline.models.Passenger;

public interface PassengerDAO 
{
	public List <Passenger> getAllPassenger () ;
	public int addPassenger(Passenger p);
	public int removePassenger(int id);
	public int updatePassenger(int id, Passenger p);
	public Passenger findPassengerById(int numero); 
	public Passenger findPassengerByName(String name);

}
