package ForcesDeZones;
import Force.ForceDeZone;
import ToutCeQuiPeutVivre.Vivant;
import Lieux.Zone;

public class Vent extends ForceDeZone {
	
	public Vent(Vivant vivant, Zone zone, int intensiteX, int intensiteY){
		super(vivant, intensiteX, intensiteY, zone);
	}

}
