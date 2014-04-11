package docapost.reporting.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import docapost.reporting.metier.GraphiqueManager;
import docapost.reporting.model.Graphique;


public class DetailGraphiqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String libelleGraph = req.getParameter("libelle");
		Graphique graph = GraphiqueManager.getInstance().getGraphique(libelleGraph);
		
		Gson gson = new Gson();
		String graphJson = gson.toJson(graph);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.append(graphJson);
		out.append(libelleGraph);

	}

}
