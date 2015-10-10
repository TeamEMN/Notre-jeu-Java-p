package Force;
import ToutCeQuiPeutVivre.Vivant;
import ModelePhysique.Force;
import Mecanismes.Mecanisme;

public class Ponctuelle extends Force {
	private Mecanisme _mecanisme; //rajouter une classe Mecanisme
	
	public Ponctuelle(Vivant vivant, int intensiteX, int intensiteY, Mecanisme mecanisme) {
		super(vivant,intensiteX,intensiteY);
		_mecanisme = mecanisme;
		
	}
}
