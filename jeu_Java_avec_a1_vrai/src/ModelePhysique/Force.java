package ModelePhysique;

import ToutCeQuiPeutVivre.Vivant;

public class Force {
	private Vivant _vivant;
	private int _intensiteX;
	private int _intensiteY;
	
	public Force(Vivant vivant,int intensiteX,int intensiteY) {
		this._vivant = vivant;
		this._intensiteX = intensiteX;
		this._intensiteY = intensiteY;
	}
		
	public Vivant getVivant() {
		return this._vivant;
	}
	
	public int getIntensiteX() {
		return this._intensiteX;
	}
	
	public int getIntensiteY() {
		return this._intensiteY;
	}
	
	public void setVivant(Vivant vivant) {
		this._vivant = vivant;
	}
	
	public void setIntensiteX(int intensiteX) {
		this._intensiteX = intensiteX;
	}
	
	public void setIntensiteY(int intensiteY) {
		this._intensiteY = intensiteY;
	}

}
