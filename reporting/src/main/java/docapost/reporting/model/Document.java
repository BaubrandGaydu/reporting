package docapost.reporting.model;

import java.sql.Date;
import java.sql.Time;

public class Document {

	int idDocument;
	String typeDocument;
	Date date;
	Time heure;
	String modeArrivee;
	float montant;
	Site siteDocument;
	
	public Document(int idDocument, String typeDocument, Date date, Time heure,
			String modeArrivee, float montant, Site siteDocument) {
		this.idDocument = idDocument;
		this.typeDocument = typeDocument;
		this.date = date;
		this.heure = heure;
		this.modeArrivee = modeArrivee;
		this.montant = montant;
		this.siteDocument= siteDocument;
	}
	
	public Site getSiteDocument() {
		return siteDocument;
	}

	public void setSiteDocument(Site siteDocument) {
		this.siteDocument = siteDocument;
	}

	public int getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getHeure() {
		return heure;
	}
	public void setHeure(Time heure) {
		this.heure = heure;
	}
	public String getModeArrivee() {
		return modeArrivee;
	}
	public void setModeArrivee(String modeArrivee) {
		this.modeArrivee = modeArrivee;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
}
