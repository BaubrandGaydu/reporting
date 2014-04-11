package docapost.reporting.model;

public class Site {

	private int idSite;
	private String nomSite;
	private Region regionSite;
	
	public Site(int idSite, String nomSite, Region regionSite) {
		this.idSite = idSite;
		this.nomSite = nomSite;
		this.regionSite = regionSite;
	}
	
	public Site(int idSite, String nomSite) {
		this.idSite = idSite;
		this.nomSite = nomSite;
		this.regionSite=null;
	}
	
	public int getIdSite() {
		return idSite;
	}
	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}
	public String getNomSite() {
		return nomSite;
	}
	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}
	public Region getRegionSite() {
		return regionSite;
	}
	public void setRegionSite(Region regionSite) {
		this.regionSite = regionSite;
	}

	
}
