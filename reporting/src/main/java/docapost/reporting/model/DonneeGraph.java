package docapost.reporting.model;


public class DonneeGraph {

	private int idDonneeGraph;
	private String typeDonneeGraph;
	private String typeAttribut;
	

	public DonneeGraph(int idDonneeGraph, String typeDonneeGraph,
			String typeAttribut) {
		this.idDonneeGraph = idDonneeGraph;
		this.typeDonneeGraph = typeDonneeGraph;
		this.typeAttribut = typeAttribut;
	}

	public String getTypeAttribut() {
		return typeAttribut;
	}

	public void setTypeAttribut(String typeAttribut) {
		this.typeAttribut = typeAttribut;
	}

	public int getIdDonneeGraph() {
		return idDonneeGraph;
	}

	public void setIdDonneeGraph(int idDonneeGraph) {
		this.idDonneeGraph = idDonneeGraph;
	}

	public String getTypeDonneeGraph() {
		return typeDonneeGraph;
	}

	public void setTypeDonneeGraph(String typeDonneeGraph) {
		this.typeDonneeGraph = typeDonneeGraph;
	}


}
