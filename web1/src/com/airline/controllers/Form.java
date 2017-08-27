package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Form
 */

@WebServlet("/Form")
public class Form extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		RequestDispatcher view=request.getRequestDispatcher("WEB-INF/views/form.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String firstName=request.getParameter("first_name");
		String lastName=request.getParameter("last_name");
		String dateBirth=request.getParameter("date_birth");
		String gender=request.getParameter("gender");
		System.out.println("The first name is :"+firstName);
		System.out.println("The last name is "+lastName);
		System.out.println("Date of birth "+dateBirth);
		System.out.println("Gender is "+gender);
		
		if (firstName.length()==0)
		{
			System.out.println("Empty first name error");
			request.setAttribute("error", true);
		}
		try
		{
			String dobArray[]=dateBirth.split("\\/");
		
		    String month=dobArray[0];
		    String day=dobArray[1];
		    String year=dobArray[2];
		
		    Calendar cal =Calendar.getInstance();
	        //Type date	
		    cal.set(Calendar.YEAR , Integer.parseInt(year));
		    cal.set(Calendar.MONTH , Integer.parseInt(month));
		    cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
		    Date dob=cal.getTime();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<script>alert('You don/t enter the birth date !!'); </script>");
		}
		
		
	}
}
