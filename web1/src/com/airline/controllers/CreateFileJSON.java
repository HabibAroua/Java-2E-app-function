package com.airline.controllers;
import java.util.*;

public class CreateFileJSON 
{
	
	public CreateFileJSON()
	{
	}
	
	private Formatter x;
	
	public void openFile()
	{
		try
		{
			x=new Formatter("C:/Users/lenovo/workspace/web1/WebContent/resources/json/passenger.json");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage()+" This an error");
		}
	}
	
	public void addRecords(String ch)
	{
		x.format("%s",ch);
	}
	
	public void closeFile()
	{
		x.close();
	}
}
