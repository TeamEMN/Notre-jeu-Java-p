package Mecanismes;
import Mecanismes.Mecanisme;

public class Ressort extends Mecanisme{
	private int _k; //raideur du ressort
	private int _l0; //longueur à vide du ressort
	
	public Ressort(int k, int l0, int longueur, int largeur, int xSG, int ySG) {
		super(longueur,largeur,xSG,ySG);
		_k = k;
		_l0 = l0;
	}

	public int getK() {
		return _k;
	}

	public void setK(int _k) {
		this._k = _k;
	}
	
	public int getL0() {
		return _l0;
	}

	public void setL0(int _l0) {
		this._l0 = _l0;
	}

}
