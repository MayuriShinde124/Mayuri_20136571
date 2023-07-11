package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("sname");
		int phone =Integer.parseInt(request.getParameter("sphone"));
		int marks =Integer.parseInt(request.getParameter("smarks"));
		String branch=request.getParameter("sbranch");
		response.setContentType("text/html");
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igtexam","root","root");
		    PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");
		    
		    pstmt.setInt(1,id);
		    pstmt.setString(2, name);
		    pstmt.setInt(3, phone);
		    pstmt.setInt(4, marks);
		    pstmt.setString(5, branch);
		    pstmt.execute();
		
		    RequestDispatcher re=request.getRequestDispatcher("Index.html");
		    re.forward(request, response);
		    PrintWriter out =response.getWriter();
		
			
		}
		catch(Exception e)
		{
			 RequestDispatcher re=request.getRequestDispatcher("Registration.html");
			    re.forward(request, response);
		}
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
