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

/**
 * Servlet implementation class TrainSearch
 */
@WebServlet("/TrainSearch")
public class TrainSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"Search\" method=\"POST\"><br>");
		out.print(" <label>Source Station:</label>");
		out.print("<Input type=\"textbox\"><br>");
		
		out.print("<label>Destination Station:</label>");
		out.print("<Input type=\"textbox\"><br>");
		
		out.print("<label>Date:</label>");
		out.print("<input type=\"Date\"><br>");
		
		
		out.print("<input type=\"Submit\">");
		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		TrainService trainService=new TrainService();
		List<Train> trains = null;
		try {
			trains = trainService.getTrains();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println("<label>Train Names</label>");
	    for(Train train :trains) {
	    	out.println(train.getNumber()+"-"+train.getName());
	    }
		out.close();
		
	}

}
