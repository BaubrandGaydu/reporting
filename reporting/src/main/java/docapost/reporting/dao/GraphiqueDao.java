package docapost.reporting.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import docapost.reporting.model.Document;
import docapost.reporting.model.DonneeGraph;
import docapost.reporting.model.Graphique;
import docapost.reporting.model.PeriodeGraph;
import docapost.reporting.model.Site;

public class GraphiqueDao {

	
	public List<DonneeGraph> getDonneesGraphique(int idGraph){
		List<DonneeGraph> lst= new ArrayList<DonneeGraph>();
		try {
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT donneegraph.iddonneegraph, donneegraph.typedonnee, donneegraph.typeattribut "
							+ "FROM graphliendonneegraph INNER JOIN donneegraph "
							+ "ON graphliendonneegraph.iddonneegraph=donneegraph.iddonneegraph "
							+ "WHERE idgraph = ?");
			stmt.setInt(1, idGraph);
			ResultSet results=stmt.executeQuery();
		
			if (results.next()) {
				lst.add(new DonneeGraph(results.getInt("iddonneegraph"),
						results.getString("typedonnee"),
						results.getString("typeattribut")));
			}
			
			results.close();
			stmt.close();
			connection.close();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	
	public PeriodeGraph getPeriodeGraphique(int idGraph){
		PeriodeGraph periode=null;
		try {
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT periodegraph.idperiodegraph, periodegraph.typeperiode,periodegraph.duree "
							+ "FROM graphique INNER JOIN periodegraph "
							+ "ON graphique.idperiodegraph=periodegraph.idperiodegraph "
							+ "WHERE idgraph = ?");
			stmt.setInt(1, idGraph);
			ResultSet results=stmt.executeQuery();
		
			if (results.next()) {
				periode= new PeriodeGraph(results.getInt("idperiodegraph"),
						results.getString("typeperiode"),
						results.getInt("duree"));
			}
			
			results.close();
			stmt.close();
			connection.close();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return periode;
	}
	
	public Graphique getGraphique(int id){
		Graphique graph= null;
		List<DonneeGraph> listeDonnees=getDonneesGraphique(id);
		PeriodeGraph periode=getPeriodeGraphique(id);
		try {
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT typedegraph,libellegraph FROM graphique WHERE idgraph = ?");
			stmt.setInt(1, id);
			ResultSet results=stmt.executeQuery();
		
			if (results.next()) {
				graph = new Graphique(id,
						results.getString("typedegraph"),
						results.getString("libellegraph"),
						listeDonnees,
						periode);
			}
			
			results.close();
			stmt.close();
			connection.close();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return graph;
	}
	public Graphique getGraphique(String libellegraph){
		Graphique graph= null;
		
		try {
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT idgraph, typedegraph FROM graphique WHERE libellegraph = ?");
			stmt.setString(1, libellegraph);
			ResultSet results=stmt.executeQuery();
		
			if (results.next()) {
				List<DonneeGraph> listeDonnees=getDonneesGraphique(results.getInt("idgraph"));
				PeriodeGraph periode=getPeriodeGraphique(results.getInt("idgraph"));
				graph = new Graphique(results.getInt("idgraph"),
						results.getString("typedegraph"),
						libellegraph,
						listeDonnees,
						periode);
			}
			
			results.close();
			stmt.close();
			connection.close();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return graph;
	}
	public List<Graphique> getListeGraphiques(){
		List<Graphique> lst= new ArrayList<Graphique>();
		try{
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT idgraph FROM graphique");
			ResultSet results=stmt.executeQuery();
		
			while (results.next()) {
				lst.add(getGraphique(results.getInt("idgraph")));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

	public Document getDocument(int idDocument){
		Document doc= null;
		try{
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT document.typedocument, document.date, document.heure, document.modearrivee, document.montant, document.validite, site.idsite,site.nomsite "
							+ "FROM document INNER JOIN site"
							+ "ON document.idsite=site.idsite"
							+ "WHERE document.iddocument=?");
			stmt.setInt(1, idDocument);
			ResultSet results=stmt.executeQuery();
		
			if (results.next()) {
				doc=new Document(idDocument,
						results.getString("typedocument"), 
						results.getDate("date"),
						results.getTime("heure"),
						results.getString("modearrivee"),
						results.getFloat("montant"),
						new Site(results.getInt("idsite"),results.getString("nomsite")));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	
	public List<Document> getListeDocumentParType(String type){
		List<Document> lst= new ArrayList<Document>();
		try{
			Connection connection = DataSourceProvider.getDataSourceProvider()
					.getConnection();

			PreparedStatement stmt = connection
					.prepareStatement("SELECT iddocument FROM document WHERE type='?'");
			stmt.setString(1, type);
			ResultSet results=stmt.executeQuery();
		
			while (results.next()) {
				lst.add(getDocument(results.getInt("iddocument")));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
}
