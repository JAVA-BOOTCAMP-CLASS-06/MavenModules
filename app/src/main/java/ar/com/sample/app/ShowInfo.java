package ar.com.sample.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.projects.bo.DataBO;
import ar.com.projects.bo.impl.DataBOImpl;

@WebServlet (description = "Carga los datos que va a mostar el jsp", urlPatterns = "/mostrarInfo")
public class ShowInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


    /**
     * Default constructor. 
     */
    public ShowInfo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBO bo = new DataBOImpl();
		
		PrintWriter pw = response.getWriter();
		
		bo.processData().stream().forEach(p -> pw.println(p.getNombre() + " - " + p.getDni()));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
