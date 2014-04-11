package docapost.reporting.metier;

import java.util.List;

import docapost.reporting.dao.GraphiqueDao;
import docapost.reporting.model.Graphique;

public class GraphiqueManager {

	private static GraphiqueManager instance;
	private GraphiqueDao graphiqueDao;
	
	private GraphiqueManager(){
		graphiqueDao=new GraphiqueDao();
	}
	
	public static GraphiqueManager getInstance(){
		if(instance==null){
			instance=new GraphiqueManager();
		}
		return instance;
	}
	
	public Graphique getGraphique(int idGraph){
		return graphiqueDao.getGraphique(idGraph);
	}
	
	public List<Graphique> getListeGraphique(){
		return graphiqueDao.getListeGraphiques();
	}
	public Graphique getGraphique(String libellegraph){
		return graphiqueDao.getGraphique(libellegraph);
	}
	
}
