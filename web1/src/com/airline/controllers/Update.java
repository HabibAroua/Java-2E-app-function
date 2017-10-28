package com.airline.controllers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import db.PassengerDAOImp;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() 
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
		
        int cin=Integer.parseInt(request.getParameter("cin"));
        PassengerDAOImp p=new PassengerDAOImp();
        String myCin=p.findPassengerById(cin).getCin();
        String myFirstName=p.findPassengerById(cin).getFirstName();
        String mylastName=p.findPassengerById(cin).getLastName();
        Date dob=p.findPassengerById(cin).getDob();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Modifier</h1>");
		out.println("<table>"
				+ "<tr><td>Cin</td><td><input type='text' value='"+myCin+"'></tr>"
				+ "<tr><td>First name</td><td><input type='text' value='"+myFirstName+"'></tr>"
				+ "<tr><td>Last name</td><td><input type='text' value='"+mylastName+"'></tr>"
				+ "<tr><td>Birth date</td><td><input type='text' value='"+dob+"'></tr></table>"
				+ "<select name='gender' id='gender'><option></option><option>Male</option><option>Female</option></select>"
				+ "<br><input type='submit' value='Update'/><input type='submit' value='Cancel' /> ");
		out.println("</body></html>");
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
