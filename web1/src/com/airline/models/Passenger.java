package com.airline.models;
import java.util.Date;

public class Passenger 
{
	private String cin;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender ;
	
	public Passenger()
	{
		//this instruction is empty
	}
	
	public Passenger(String cin,String firstName,String lastName,Date dob,String gender)
	{
		this.cin=cin;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dob=dob;
		this.gender=gender;
	}
	
	public String getCin()
	{
		return cin;
	}
	
	public void setCin(String cin)
	{
		this.cin=cin;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public Date getDob()
	{
		return dob;
	}
	
	public void setDob(java.util.Date dob2)
	{
		this.dob = dob2;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	@Override
	public String toString()
	{
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
}
