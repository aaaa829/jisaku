package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.nanika;


@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		String num = request.getParameter("button");
		int[] nums = new int[9];
		String type = "";
		int count = Integer.parseInt(request.getParameter("count")) ;
		if(count == 0 ) {
			count = 1 ;
		}
		for(int i = 1;i < nums.length+1;i++) {nums[i] = i ;}
		
		for(int i =0;i< nums.length;i++ ) {
			if(nums[i] == Integer.parseInt(num)) {
				type = "text";
			}
		}
		nanika n = new nanika(count);
		application.setAttribute("n", n);
	}

}
