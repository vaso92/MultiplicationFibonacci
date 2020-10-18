package com.multiplicationfibonacci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplicationfibonacii.FibonacciMultiplicator;

/**
 * Servlet implementation class MultiplicationFibonacciServlet
 */
@WebServlet("/MultiplicationFibonacciServlet")
public class MultiplicationFibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationFibonacciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		FibonacciMultiplicator multiplicator = new FibonacciMultiplicator();
		multiplicator.getFibonacciMultiplicationTable(4);
		out.println(HTML_START + "<h2>Hi There!</h2><br/>" + multiplicator.getFibonacciMultiplicationTable(4).getResult() + HTML_END);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
