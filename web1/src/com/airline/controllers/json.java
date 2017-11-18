package com.airline.controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.airline.models.Passenger;
import db.PassengerDAOImp;

/**
 * Servlet implementation class json
 */
@WebServlet("/json")
public class json extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public json() 
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
		PassengerDAOImp passengerDAOImp=new PassengerDAOImp();
		List<Passenger>list=passengerDAOImp.getAllPassenger();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<head><title>json</title><link rel='stylesheet' href='resources/json/passenger.json'></head>");
		String result="[";
		for(int i=0; i<list.size();i++)
		{
			JsonObject json = Json.createObjectBuilder()
			     .add("cin", list.get(i).getCin())
			     .add("firstName", list.get(i).getFirstName())
			     .add("lastName", list.get(i).getLastName())
			     .add("dob",""+list.get(i).getDob())
			     .add("gender",list.get(i).getGender() )
			     .build();
			if(i!=list.size()-1)
			{
			   result = result+json.toString()+",";
			}
			else
			{
				result = result+json.toString();
			}
		}
	    result=result+"]";
		System.out.println("[ \n"+result+"\n ]");
		out.println(""+result+"");
		out.println("</body></html>");
		CreateFileJSON g =new CreateFileJSON();
		g.openFile();
		g.addRecords(result);
		g.closeFile();
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