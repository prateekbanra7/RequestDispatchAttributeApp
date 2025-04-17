package in.abc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("sachin", "cricketer");
		request.setAttribute("sundi", "kuchai");
		request.setAttribute("HO", "kolhan");
		
		RequestDispatcher rd = request.getRequestDispatcher("/test2");
		rd.forward(request, response);
		
	}

}
