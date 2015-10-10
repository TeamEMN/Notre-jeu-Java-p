package Force;
import ToutCeQuiPeutVivre.Vivant;
import ModelePhysique.Force;
import Lieux.Zone;

public class ForceDeZone extends Force {
	private Zone _zone;
	
	public ForceDeZone(Vivant vivant, int intensiteX, int intensiteY, Zone zone) {
		super(vivant,intensiteX,intensiteY);
		_zone = zone;
	}
}
