package com.airline.models;
import java.util.Date;

public class Passenger 
{
	private String firstName;
	private String lastName;
	private Date dob;
	private Gender gender ;
	
	public Passenger()
	{
		//this instruction is empty
	}
	
	public Passenger(String firstName,String lastName,Date dob,Gender gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dob=dob;
		this.gender=gender;
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
	
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	public Gender getGender() 
	{
		return gender;
	}
	
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}

	@Override
	public String toString()
	{
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
}
