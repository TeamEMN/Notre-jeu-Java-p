package Mecanismes;
import Mecanismes.Mecanisme;

public class Aimant extends Mecanisme{
	private int _q; //coefficient d'attirance
	
	public Aimant(int q, int longueur, int largeur, int xSG, int ySG) {
		super(longueur, largeur, xSG, ySG);
		_q = q;
		
	}

	public int getQ() {
		return _q;
	}

	public void setQ(int _q) {
		this._q = _q;
	}
	

}
