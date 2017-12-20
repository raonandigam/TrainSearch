package com.nisum.trainReservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TrainSearch")
public class TrainSearch extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public TrainSearch() {
        super();  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");		
		out.println("Railway");
		out.println("</title>");
		out.println("<link rel='stylesheet' type='text/css' href='Train.css' />");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");	
		out.println("<form action=\"Search\" method=\"POST\"><br><br>");	
		out.println("<table>");
		out.println("<tr>");
		out.println(" <th><label>Source Station:</label></th>");
		out.println("<th><Input type=\"textbox\" name=\"Source\"></th><br><br>");
		
		out.println("<th><label>Destination Station:</label></th>");
		out.println("<th><Input type=\"textbox\" name=\"Destination\">"
				+ "</th><br><br><br>");
		
		out.println("<th><label>Date:</label></th>");
		out.println("<th><input type=\"Date\"></th><br><br>");
		
		
		out.println("<th><input type=\"Submit\"></th>");
		out.println("</tr>");
		out.println("</table>");
		
		out.println("</center>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		TrainService trainService=new TrainService();
		List<Train> trains = null;
		try {
			trains = trainService.getTrainsBySource(request.getParameter("Source"),request.getParameter("Destination"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<label>Train Names</label>");
	    for(Train train :trains) {
	    	out.println(train.getNumber()+"-"+train.getName()+"-"+train.getSource()+"-"+train.getDestination());
	    }
		out.close();
		
	}

}
