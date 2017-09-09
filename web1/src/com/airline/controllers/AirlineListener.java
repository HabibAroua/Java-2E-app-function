package com.airline.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.airline.models.Passenger;

/**
 * Application Lifecycle Listener implementation class AirlineListener
 *
 */
@WebListener
public class AirlineListener implements ServletContextListener 
{
    /**
     * Default constructor. 
     */
    public AirlineListener() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)
    { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  
    { 
         // TODO Auto-generated method stub
    	ServletContext sc=event.getServletContext();
        ArrayList<Passenger> list=(ArrayList<Passenger>)sc.getAttribute("passangers");
        
        if(list==null)
        {
        	System.out.println("No passanger list created yet .. Let's create here");
        	list=new ArrayList<Passenger>();
        	sc.setAttribute("passangers", list);
        }

    }
	
}
