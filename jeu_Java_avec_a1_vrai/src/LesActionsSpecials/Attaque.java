package LesActionsSpecials;




public class Attaque{
	
	//Variable
	
	
	
	/*
	 * Defini le type de l'attaque, peut etre de type eau terre feu ou air 
	 */
	private String _type;
	
	/*
	 * Determine les chances de succes (en pourcentage) de l'attaque
	 */
	private int _precision;
	
	/*
	 * Determine les degats infligés par l'attaque
	 */
	private int _puissance;
	private String _nom;
	private int _coutMana;


	//------------------------------------------------------------------------------------------------------
	
	
	//Getteurs:
	

	public String getType() {
		
		return _type;
	}


	public int getPuissance() {
		
		return _puissance;
	}


	public int getPrecision() {
	
		return _precision;
	}
	

	public String getNom(){
		return _nom;
	}

	
	//--------------------------------------------------------------------------------------------------------
	
	//Setteurs:
	

	public void setType(String t) {
		
		_type=t;
	}

	public void setPuissance(int x) {
	
		_puissance=x;
	}

	public void setPrecision(int x) {
	
		_precision=x;
	}

	public void setNom(String s){
		_nom=s;
	}

	//-------------------------------------------------------------------------------------------------------
	
	//Constructeur:
	
	public Attaque(String t, int pui, int prec, String nom){
		_type=t;
		_precision=prec;
		_puissance=pui;
		_nom=nom;
	}




	
	//-------------------------------------------------------------------------------------------------------
	
	//Methode
	/*
	 * retourne un boolean determinant si l'attaque a reussie ou echouée
	 * TEST:Ok
	 */
	public Boolean reussir(){
		Boolean aRetourner;
		int jetDeDes = (int) (Math.random()*100);
		if (jetDeDes<=this.getPrecision()){
			aRetourner=true;
		}
		else {
			aRetourner = false;
		}
				return aRetourner;
	}
	
}
