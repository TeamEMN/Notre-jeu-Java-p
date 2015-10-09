package ToutCeQuiEstObjet;

public abstract class FabriquePotion {
	// Potions simples
	public static Consommable creePotionHp(String nom, int prix, String url, int val){
		return new Consommable(nom, prix, 100, url, val, 0, 0, 0, 0);
	}
	
	public static Consommable creePotionMana(String nom, int prix, String url, int val){
		return new Consommable(nom, prix, 100, url, 0, val, 0, 0, 0);
	}
	
	public static Consommable creePotionAttaque(String nom, int prix, String url, double val){
		return new Consommable(nom, prix, 100, url, 0, 0, val, 0, 0);
	}
	
	public static Consommable creePotionDefense(String nom, int prix, String url, double val){
		return new Consommable(nom, prix, 100, url, 0, 0, 0, val, 0);
	}
	
	public static Consommable creePotionVitesse(String nom, int prix, String url, double val){
		return new Consommable(nom, prix, 100, url, 0, 0, 0, 0, val);
	}
	
	// Potions Hp-autre
	public static Consommable creePotionHpMana(String nom, int prix, String url, int valHp, int valMana){
		return new Consommable(nom, prix, 100, url, valHp, valMana, 0, 0, 0);
	}
	
	public static Consommable creePotionHpAttaque(String nom, int prix, String url, int valHp, double valAttaque){
		return new Consommable(nom, prix, 100, url, valHp, 0, valAttaque, 0, 0);
	}
	
	public static Consommable creePotionHpDefense(String nom, int prix, String url, int valHp, double valDefense){
		return new Consommable(nom, prix, 100, url, valHp, 0, 0, valDefense, 0);
	}
	
	public static Consommable creePotionHpVitesse(String nom, int prix, String url, int valHp, double valVitesse){
		return new Consommable(nom, prix, 100, url, valHp, 0, 0, 0, valVitesse);
	}
	
	// Potions Mana-autre
	public static Consommable creePotionManaAttaque(String nom, int prix, String url, int valMana, double valAttaque){
		return new Consommable(nom, prix, 100, url, 0, valMana, valAttaque, 0, 0);
	}
	
	public static Consommable creePotionManaDefense(String nom, int prix, String url, int valMana, double valDefense){
		return new Consommable(nom, prix, 100, url, 0, valMana, 0, valDefense, 0);
	}
	
	public static Consommable creePotionManaVitesse(String nom, int prix, String url, int valMana, double valVitesse){
		return new Consommable(nom, prix, 100, url, 0, valMana, 0, 0, valVitesse);
	}
	
	// Potions Attaque-autre
	public static Consommable creePotionAttaqueDefense(String nom, int prix, String url, double valAttaque, double valDefense){
		return new Consommable(nom, prix, 100, url, 0, 0, valAttaque, valDefense, 0);
	}
	
	public static Consommable creePotionAttaqueVitesse(String nom, int prix, String url, double valAttaque, double valVitesse){
		return new Consommable(nom, prix, 100, url, 0, 0, valAttaque, 0, valVitesse);
	}
	
	// Potions Defense-autre
	public static Consommable creePotionDefenseVitesse(String nom, int prix, String url, double valDefense, double valVitesse){
		return new Consommable(nom, prix, 100, url, 0, 0, 0, valDefense, valVitesse);
	}
	
}
