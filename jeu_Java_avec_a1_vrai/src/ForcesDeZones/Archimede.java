package ForcesDeZones;
import Force.ForceDeZone;
import ToutCeQuiPeutVivre.Vivant;
import Lieux.Zone;

public class Archimede extends ForceDeZone {
	
	public Archimede(Vivant vivant, Zone zone, int intensiteY){
		super(vivant, 0, intensiteY, zone);
	}

}
