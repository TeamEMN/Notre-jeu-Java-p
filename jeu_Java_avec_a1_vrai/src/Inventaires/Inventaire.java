package Inventaires;
//import ToutCeQuiEstObjet.Objet;

public class Inventaire {
	// Variables privées
	private int[] _toutesLesArmes;	// Liste telle que _toutesLesArmes[i] = quantité d'armes n°i possédées - du coup il faut connaître le nombre total d'objets de chaque type du jeu et les organiser...
	private int[] _toutesLesArmures;
	private int[] _tousLesCasques;
	private int[] _toutesLesChaussures;
	private int[] _tousLesTalismans;
	private int[] _toutesLesClefs;
	private int[] _toutesLesMonnaies;
	private int[] _toutesLesPotions;
	
	// Constructeur
	public Inventaire(int nbArmes, int nbArmures, int nbCasques, int nbChaussures, int nbTalismans,
						int nbClefs, int nbMonnaies, int nbPotions) {
		this._toutesLesArmes = new int[nbArmes];
		this._toutesLesArmures = new int[nbArmures];
		this._tousLesCasques = new int[nbCasques];
		this._toutesLesChaussures = new int[nbChaussures];
		this._tousLesTalismans = new int[nbTalismans];
		this._toutesLesClefs = new int[nbClefs];
		this._toutesLesMonnaies = new int[nbMonnaies];
		this._toutesLesPotions = new int[nbPotions];
	}

	// Getters
	public int[] getToutesLesArmes() {
		return _toutesLesArmes;
	}
	
	public int[] getToutesLesArmures() {
		return _toutesLesArmures;
	}
	
	public int[] getTousLesCasques() {
		return _tousLesCasques;
	}
	
	public int[] getToutesLesChaussures() {
		return _toutesLesChaussures;
	}
	
	public int[] getTousLesTalismans() {
		return _tousLesTalismans;
	}
	
	public int[] getToutesLesClefs() {
		return _toutesLesClefs;
	}
	
	public int[] getToutesLesMonnaies() {
		return _toutesLesMonnaies;
	}
	
	public int[] getToutesLesPotions() {
		return _toutesLesPotions;
	}
	
	// Setters
	public void setToutesLesArmes(int[] _toutesLesArmes) {
		this._toutesLesArmes = _toutesLesArmes;
	}
	
	public void setToutesLesArmures(int[] _toutesLesArmures) {
		this._toutesLesArmures = _toutesLesArmures;
	}
	
	public void setTousLesCasques(int[] _tousLesCasques) {
		this._tousLesCasques = _tousLesCasques;
	}
	
	public void setToutesLesChaussures(int[] _toutesLesChaussures) {
		this._toutesLesChaussures = _toutesLesChaussures;
	}
	
	public void setTousLesTalismans(int[] _tousLesTalismans) {
		this._tousLesTalismans = _tousLesTalismans;
	}
	
	public void setToutesLesClefs(int[] _toutesLesClefs) {
		this._toutesLesClefs = _toutesLesClefs;
	}
	
	public void setToutesLesMonnaies(int[] _toutesLesMonnaies) {
		this._toutesLesMonnaies = _toutesLesMonnaies;
	}
	
	public void setToutesLesPotions(int[] _toutesLesPotions) {
		this._toutesLesPotions = _toutesLesPotions;
	}
	
}
