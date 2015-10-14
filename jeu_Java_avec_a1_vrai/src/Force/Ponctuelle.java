package Force;
import ToutCeQuiPeutVivre.Vivant;
import Mecanismes.Mecanisme;
import ModelePhysique.Force;

public class Ponctuelle extends Force {
	private Mecanisme _mecanisme;
	
	public Ponctuelle(Vivant vivant, int intensiteX, int intensiteY, Mecanisme mecanisme) {
		super(vivant,intensiteX,intensiteY);
		_mecanisme = mecanisme;
		
	}

	public Mecanisme getMecanisme() {
		return _mecanisme;
	}

	public void setMecanisme(Mecanisme _mecanisme) {
		this._mecanisme = _mecanisme;
	}
}
