package Solides;

//TEST : OK
//Pour créer les blocs "élémentaires" des structures

public class Rectangles {

	
	// Déclaration des variables
	
	private int _longueur;
	private int _largeur;
	private int _xSG; // coordonnée x du point de depart du rectangle (point supérieur gauche)
	private int _ySG; // coordonnée y du point de depart du rectangle (point supérieur gauche)
	
	// Constructeur
	
	public Rectangles( int longueur, int largeur, int xSG, int ySG ){
		
		_longueur = longueur;
		_largeur = largeur;
		_xSG = xSG;
		_ySG = ySG;
	}
	
	// Méthodes
	
		// Getteurs
	
	public int getLongueur(){
		
		return(this._longueur);	
	}

	public int getLargeur(){
		
		return(this._largeur);
	}
	
	public int getXSG(){
		
		return(this._xSG);
	}
	
	public int getYSG(){
		
		return(this._ySG);
	}
}
