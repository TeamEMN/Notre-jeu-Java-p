package ToutCeQuiEstObjet;

public class Objet {
	// privates
	private String _nom;
	private int _prix;
	private int _poids;
	private String _urlImage;
	
	// constructeur
	public Objet(String nom, int prix, int poids, String url) {
		this._nom = nom;
		this._prix = prix;
		this._poids = poids;
		this._urlImage = url;
	}

	// gets
	public String getNom() {
		return this._nom;
	}

	public int getPrix() {
		return this._prix;
	}

	public int getPoids() {
		return this._poids;
	}

	public String getUrlImage() {
		return this._urlImage;
	}

	// sets
	public void setNom(String n) {
		this._nom = n;
	}

	public void setPrix(int p) {
		this._prix = p;
	}

	public void setPoids(int p) {
		this._poids = p;
	}

	public void setUrlImage(String u) {
		this._urlImage = u;
	}
	
}
