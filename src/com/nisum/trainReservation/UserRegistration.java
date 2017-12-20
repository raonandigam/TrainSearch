package com.nisum.trainReservation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserRegistration() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.print("</head>");
		out.println("<body>");
		out.println("<label>Firstname</label>");
		out.println("<input type=\"text\" name=firstname><br><br>");
		out.println("<label>Lastrname</label>");
		out.println("<input type=\"text\" name=lastname><br><br>");
		out.println("<label>Mobilenumber</label>");
		out.println("<input type=\"text\" name=phone><br><br>");
		out.println("<label>Emailid</label>");
		out.println("<input type=\"text\" name=email><br><br>");
		out.println("<label>Password</label>");
		out.println("<input type=\"text\" name=password><br><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		UserService userService = new UserService(firstName, lastName, phone, email, password);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>User Created Successfully!</h1>");

	}

}
