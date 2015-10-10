package ToutCeQuiEstObjet;

public class Objet {
	// Variables privées
	private String _nom;
	private int _prix;
	private int _masse;
	private String _urlImage;
	
	// Constructeur
	public Objet(String nom, int prix, int masse, String url) {
		this._nom = nom;
		this._prix = prix;
		this._masse = masse;
		this._urlImage = url;
	}
	
	// Getters
	public String getNom() {
		return this._nom;
	}
	
	public int getPrix() {
		return this._prix;
	}
	
	public int getMasse() {
		return this._masse;
	}
	
	public String getUrlImage() {
		return this._urlImage;
	}
	
	// Setters
	public void setNom(String n) {
		this._nom = n;
	}
	
	public void setPrix(int p) {
		this._prix = p;
	}
	
	public void setMasse(int m) {
		this._masse = m;
	}
	
	public void setUrlImage(String u) {
		this._urlImage = u;
	}
	
}
