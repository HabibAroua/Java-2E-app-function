package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAdresse 
{
	private String ipAdresse;
	
	public IpAdresse()
	{
		try 
		{
			InetAddress ipAddr = InetAddress.getLocalHost();
            		System.out.println(ipAddr.getHostAddress());
            		ipAdresse=ipAddr.getHostAddress();
		}
		catch (UnknownHostException ex) 
		{
            		ex.printStackTrace();
            		ipAdresse="localhost";
		}	
	}
	
	public String getIpAdresse()
	{
		return this.ipAdresse;
	}
}
