package Solides;

//TEST : OK
//Pour cr�er les blocs "�l�mentaires" des structures

public class Rectangles {

	
	// D�claration des variables
	
	private int _longueur;
	private int _largeur;
	private int _xSG; // coordonn�e x du point de depart du rectangle (point sup�rieur gauche)
	private int _ySG; // coordonn�e y du point de depart du rectangle (point sup�rieur gauche)
	
	// Constructeur
	
	public Rectangles( int longueur, int largeur, int xSG, int ySG ){
		
		_longueur = longueur;
		_largeur = largeur;
		_xSG = xSG;
		_ySG = ySG;
	}
	
	// M�thodes
	
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
