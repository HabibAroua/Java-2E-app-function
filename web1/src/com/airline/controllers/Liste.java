package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.PassengerDAOImp;

/**
 * Servlet implementation class Liste
 */
@WebServlet("/Liste")
public class Liste extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Liste() 
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
		 RequestDispatcher view=request.getRequestDispatcher("WEB-INF/views/liste.jsp");
	        view.forward(request, response);
	        PrintWriter out=response.getWriter();
			response.setContentType("text/html");
	        String id=request.getParameter("id");
	        PassengerDAOImp passengerDAOImp=new PassengerDAOImp();
	        int res=passengerDAOImp.removePassenger(id);
	        if(res==1)
	        {
	        	System.out.println("The passenger has deleted");
	        	response.sendRedirect("http://localhost:8080/web1/");
	        }
	        else
	        {
	        	if(res==0)
	        	{
	        		System.out.println("Error");
		        	out.println("<script>alert('Error');</script>");
	        	}
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
