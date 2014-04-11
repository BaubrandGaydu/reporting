package docapost.reporting.model;

public class PeriodeGraph {

	private int idPeriodeGraph;
	private String typePeriode;
	private int dureePeriode;
	
	public PeriodeGraph(int id, String type, int duree){
		idPeriodeGraph=id;
		typePeriode=type;
		dureePeriode=duree;
	}

	public int getIdPeriodeGraph() {
		return idPeriodeGraph;
	}

	public void setIdPeriodeGraph(int idPeriodeGraph) {
		this.idPeriodeGraph = idPeriodeGraph;
	}

	public String getTypePeriode() {
		return typePeriode;
	}

	public void setTypePeriode(String typePeriode) {
		this.typePeriode = typePeriode;
	}

	public int getDureePeriode() {
		return dureePeriode;
	}

	public void setDureePeriode(int dureePeriode) {
		this.dureePeriode = dureePeriode;
	}
}
