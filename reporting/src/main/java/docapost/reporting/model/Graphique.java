package docapost.reporting.model;

import java.util.List;

public class Graphique {

	private int idGraphique;
	private String typeGraphique;
	private String libelleGraphique;
	private List<DonneeGraph> donnees;
	private PeriodeGraph periode;
	
	public Graphique(int id, String type, String libelle, List<DonneeGraph> donneesGraph, PeriodeGraph periodeGraph){
		idGraphique=id;
		typeGraphique=type;
		libelleGraphique=libelle;
		donnees=donneesGraph;
		periode=periodeGraph;
	}

	public int getIdGraphique() {
		return idGraphique;
	}

	public void setIdGraphique(int idGraphique) {
		this.idGraphique = idGraphique;
	}

	public String getTypeGraphique() {
		return typeGraphique;
	}

	public void setTypeGraphique(String typeGraphique) {
		this.typeGraphique = typeGraphique;
	}

	public String getLibelleGraphique() {
		return libelleGraphique;
	}

	public void setLibelleGraphique(String libelleGraphique) {
		this.libelleGraphique = libelleGraphique;
	}

	public List<DonneeGraph> getDonnees() {
		return donnees;
	}

	public void setDonnees(List<DonneeGraph> donnees) {
		this.donnees = donnees;
	}

	public PeriodeGraph getPeriode() {
		return periode;
	}

	public void setPeriode(PeriodeGraph periode) {
		this.periode = periode;
	}
}
