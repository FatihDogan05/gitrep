package com.dummy;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
/**
 * Servlet implementation class Dummy
 */
@WebServlet("/Dummy")
public class Dummy extends HttpServlet  {	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Dummy() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpResponse#sslSession()
     */
    public Optional<javax.net.ssl.SSLSession> sslSession()  { 
         // TODO Auto-generated method stub
			return null;
    }

	/**
     * @see HttpResponse#uri()
     */
    public URI uri()  { 
         // TODO Auto-generated method stub
			return null;
    }

	/**
     * @see HttpResponse#version()
     */
    public HttpClient.Version version()  { 
         // TODO Auto-generated method stub
			return null;
    }

	/**
     * @see HttpResponse#headers()
     */
    public HttpHeaders headers()  { 
         // TODO Auto-generated method stub
			return null;
    }

	/**
     * @see HttpResponse#request()
     */
    public HttpRequest request()  { 
         // TODO Auto-generated method stub
			return null;
    }


	/**
     * @see HttpResponse#statusCode()
     */
    public int statusCode()  { 
         // TODO Auto-generated method stub
			return 0;
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletdoGet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:  Cevap verdi ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
