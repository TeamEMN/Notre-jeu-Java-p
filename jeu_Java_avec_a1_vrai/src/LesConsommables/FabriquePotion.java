package LesConsommables;

public abstract class FabriquePotion {
	// Potions simples
	public static Potion creePotionHp(String nom, int prix, String url, int val){
		return new Potion(nom, prix, url, val, 0, 0, 0, 0);
	}
	
	public static Potion creePotionMana(String nom, int prix, String url, int val){
		return new Potion(nom, prix, url, 0, val, 0, 0, 0);
	}
	
	public static Potion creePotionAttaque(String nom, int prix, String url, double val){
		return new Potion(nom, prix, url, 0, 0, val, 0, 0);
	}
	
	public static Potion creePotionDefense(String nom, int prix, String url, double val){
		return new Potion(nom, prix, url, 0, 0, 0, val, 0);
	}
	
	public static Potion creePotionVitesse(String nom, int prix, String url, double val){
		return new Potion(nom, prix, url, 0, 0, 0, 0, val);
	}
	
	// Potions Hp-autre
	public static Potion creePotionHpMana(String nom, int prix, String url, int valHp, int valMana){
		return new Potion(nom, prix, url, valHp, valMana, 0, 0, 0);
	}
	
	public static Potion creePotionHpAttaque(String nom, int prix, String url, int valHp, double valAttaque){
		return new Potion(nom, prix, url, valHp, 0, valAttaque, 0, 0);
	}
	
	public static Potion creePotionHpDefense(String nom, int prix, String url, int valHp, double valDefense){
		return new Potion(nom, prix, url, valHp, 0, 0, valDefense, 0);
	}
	
	public static Potion creePotionHpVitesse(String nom, int prix, String url, int valHp, double valVitesse){
		return new Potion(nom, prix, url, valHp, 0, 0, 0, valVitesse);
	}
	
	// Potions Mana-autre
	public static Potion creePotionManaAttaque(String nom, int prix, String url, int valMana, double valAttaque){
		return new Potion(nom, prix, url, 0, valMana, valAttaque, 0, 0);
	}
	
	public static Potion creePotionManaDefense(String nom, int prix, String url, int valMana, double valDefense){
		return new Potion(nom, prix, url, 0, valMana, 0, valDefense, 0);
	}
	
	public static Potion creePotionManaVitesse(String nom, int prix, String url, int valMana, double valVitesse){
		return new Potion(nom, prix, url, 0, valMana, 0, 0, valVitesse);
	}
	
	// Potions Attaque-autre
	public static Potion creePotionAttaqueDefense(String nom, int prix, String url, double valAttaque, double valDefense){
		return new Potion(nom, prix, url, 0, 0, valAttaque, valDefense, 0);
	}
	
	public static Potion creePotionAttaqueVitesse(String nom, int prix, String url, double valAttaque, double valVitesse){
		return new Potion(nom, prix, url, 0, 0, valAttaque, 0, valVitesse);
	}
	
	// Potions Defense-autre
	public static Potion creePotionDefenseVitesse(String nom, int prix, String url, double valDefense, double valVitesse){
		return new Potion(nom, prix, url, 0, 0, 0, valDefense, valVitesse);
	}
	
}
