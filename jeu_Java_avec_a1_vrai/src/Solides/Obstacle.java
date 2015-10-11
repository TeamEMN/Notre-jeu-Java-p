package Solides;
// Pour coder nos obstacles graces aux rectangles 

public class Obstacle extends Rectangles {
	private Rectangles _ListeRectangles[];
	private String _url;

	public Obstacle(Rectangles ListeRectangles[], String url) {
		super(creerXSD(ListeRectangles)-creerXSG(ListeRectangles), creerYIG(ListeRectangles)-creerYSG(ListeRectangles), creerXSG(ListeRectangles), creerYSG(ListeRectangles));
		_url = url;
		_ListeRectangles = ListeRectangles;
	}
	
	public static int creerXSG(Rectangles ListeRectangles[]){
		int XSG = ListeRectangles[0].getXSG();
		for (int i = 1; i < ListeRectangles.length ; i++){
			if (ListeRectangles[i].getXSG() < XSG){
				XSG = ListeRectangles[i].getXSG();
			}
		}
		return XSG;
	}
	
	public static int creerYSG(Rectangles ListeRectangles[]){
		int YSG = ListeRectangles[0].getYSG();
		for (int i = 1; i < ListeRectangles.length ; i++){
			if (ListeRectangles[i].getYSG() < YSG){
				YSG = ListeRectangles[i].getYSG();
			}
		}
		return YSG;
	}
	
	public static int creerXSD(Rectangles ListeRectangles[]){
		int XSD = ListeRectangles[0].getXSG() + ListeRectangles[0].getLongueur();
		for (int i = 1; i < ListeRectangles.length ; i++){
			if (ListeRectangles[i].getXSG() + ListeRectangles[i].getLongueur() > XSD){
				XSD = ListeRectangles[i].getXSG() + ListeRectangles[i].getLongueur();
			}
		}
		return XSD;
	}
	
	public static int creerYIG(Rectangles ListeRectangles[]){
		int YIG = ListeRectangles[0].getYSG() + ListeRectangles[0].getLargeur();
		for (int i = 1; i < ListeRectangles.length ; i++){
			if (ListeRectangles[i].getYSG() + ListeRectangles[i].getLargeur() > YIG){
				YIG = ListeRectangles[i].getYSG() + ListeRectangles[i].getLargeur();
			}
		}
		return YIG;
	}

	public Rectangles[] getListeRectangles() {
		return _ListeRectangles;
	}

	public void setListeRectangles(Rectangles _ListeRectangles[]) {
		this._ListeRectangles = _ListeRectangles;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String _url) {
		this._url = _url;
	}
	
}

// TO DO : Mur, Plateforme, Hitbox
// Provençal : Un obstacle est une liste de rectangles, il va donc falloir modifier tout ça. C'est déjà prêt sur mon PC, il ne me manque qu'à push
// Alexis : J'ai rajouté des trucs pour test Graphique, tu peux tout virer ;)