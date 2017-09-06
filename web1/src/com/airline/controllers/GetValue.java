package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetValue
 */
@WebServlet("/GetValue")
public class GetValue extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    static String name;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetValue() 
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
		//RequestDispatcher view=request.getRequestDispatcher("WEB-INF/views/GetValue.jsp");
        name=request.getParameter("name");
        System.out.println("Your name is "+name);
		//view.forward(request, response);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Hello world  "+name+"</h1>");
		out.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//Show get value
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
