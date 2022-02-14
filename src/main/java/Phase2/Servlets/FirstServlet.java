package Phase2.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.getWriter().append("Served at: ").append(request.getContextPath());
		// write the code to get the data from the db
		RequestDispatcher rd;
		String UserName= request.getParameter("UserName"); 
		String password= request.getParameter("Password"); 
		if("admin".equalsIgnoreCase(UserName) && "admin@123".equals(password)) {
			 rd = getServletContext().getRequestDispatcher("/Welcome.html");
			System.out.println("Valid User");
			rd.forward(request, response);
		}else {
			 rd = getServletContext().getRequestDispatcher("/LoginError.html");
			System.out.println("Invalid User");
			rd.forward(request, response);
		}

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		response.getWriter().append("Response from doPost() method.");
	}

}

