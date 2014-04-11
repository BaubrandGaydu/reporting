package docapost.reporting.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import docapost.reporting.metier.GraphiqueManager;
import docapost.reporting.model.Graphique;


public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AccueilServlet() {
        super();
       
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Graphique> listeGraphique=GraphiqueManager.getInstance().getListeGraphique();
		request.setAttribute("listeGraphique", listeGraphique);
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/pages/accueil.jsp");
		view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
