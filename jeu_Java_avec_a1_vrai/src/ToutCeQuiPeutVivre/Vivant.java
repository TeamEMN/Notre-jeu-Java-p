package ToutCeQuiPeutVivre;

import java.util.ArrayList;
import java.util.Scanner;

import LesActionsSpecials.Attaque;


public class Vivant{
//variable
	
	//statistiques de base du personnage
	private int _hp;
	private int _hpMax;
	private int _mana;
	private int _manaMax;
	private int _attaque;
	private int _defense;
	private int _vitesse;
	private Attaque[] _listeAttaque;
	
	//statistiques li�es a des alterations d'etat (potion, sort, competence...) 
	private int _modAttaque;
	private int _modDefense;
	private int _modVitesse;
	
	//statistique accord� par l'equipement
	private int _attaqueEquipement;
	private int _defenseEquipement;
	private int _vitesseEquipement;
	private int _manaMaxEquipement;
	private int _hpMaxEquipement;
	
	
	private String _type;
	
	// donn�e specifique � la gestion du mouvement du personnage.
	private int _masse; // Alexis : ajout d'une masse pour l'utilisation de Physique.Newton(vivant)
	private int _vitesseX;
	private int _vitesseY;
	private int _accelerationX;
	private int _accelerationY;
	
	//private inventaire monInventaire;
	
	
	
	//Constructeur (tout est ok)
	
	public Vivant(int hpMax,int manaMax, int attaque, int defense, 
					Attaque[] listeAttaque,	int modAttaque, 
					int modDefense,int modVitesse,int attaqueEquipement, int defenseEquipement,
					int vitesseEquipement, int manaMaxEquipement, int hpMaxEquipement,
					String type, int vitesse, 
					int vitesseX,int vitesseY, int accelerationX, int accelerationY, int masse){
		
		
		_attaqueEquipement=attaqueEquipement;
		_defenseEquipement=defenseEquipement;
		_vitesseEquipement=vitesseEquipement;
		_manaMaxEquipement=manaMaxEquipement;
		_hpMaxEquipement=hpMaxEquipement;
		
		_hp=hpMax;
		_mana=manaMax;
		_manaMax=manaMax;
		_attaque=attaque;
		_defense=defense;
		_listeAttaque=listeAttaque;
		_modAttaque=modAttaque;
		_modDefense=modDefense;
		_modVitesse=modVitesse;
		_hpMax=hpMax;
		_type=type;
		_vitesse=vitesse;
		_vitesseX=vitesseX;
		_vitesseY=vitesseY;
		_accelerationX=accelerationX;
		_accelerationY=accelerationY;
		_masse=masse; //Alexis : ajout de masse dans le constructeur par défaut
		
	}
	
	//contructeur permettant de generer un VIvant test facilement
	public Vivant(Attaque[] listeAtt, String type){
		_attaqueEquipement=0;
		_defenseEquipement=0;
		_vitesseEquipement=0;
		_manaMaxEquipement=0;
		_hpMaxEquipement=0;
		
		_hp=100;
		_mana=100;
		_manaMax=100;
		_attaque=40;
		_defense=40;
		_listeAttaque=listeAtt;
		_modAttaque=0;
		_modDefense=0;
		_modVitesse=0;
		_hpMax=100;
		_type=type;
		_vitesse=50;
		_vitesseX=0;
		_vitesseY=0;
		_accelerationX=0;
		_accelerationY=0;
		_masse=20; //Alexis : ajout de masse dans le constructeur test 
	}
	//getteur (tout es ok car autogenere)
	
	public int getMasse() { //Alexis : getteur pour _masse
		return _masse;
	}
	public int getHp() {
		return _hp;
	}
	public int getHpMax() {
		return _hpMax;
	}
	public int getMana() {
		return _mana;
	}
	public int getManaMax() {
		return _manaMax;
	}
	public int getAttaque() {
		return _attaque;
	}
	public int getDefense() {
		return _defense;
	}
	public int getVitesse() {
		return _vitesse;
	}
	public Attaque[] getListeAttaque() {
		return _listeAttaque;
	}
	public int getModAttaque() {
		return _modAttaque;
	}
	public int getModDefense() {
		return _modDefense;
	}
	public int getModVitesse() {
		return _modVitesse;
	}
	public int getAttaqueEquipement() {
		return _attaqueEquipement;
	}
	public int getDefenseEquipement() {
		return _defenseEquipement;
	}
	public int getVitesseEquipement() {
		return _vitesseEquipement;
	}
	public int getManaMaxEquipement() {
		return _manaMaxEquipement;
	}
	public int getHpMaxEquipement() {
		return _hpMaxEquipement;
	}
	public String getType() {
		return _type;
	}
	public int getVitesseX() {
		return _vitesseX;
	}
	public int getVitesseY() {
		return _vitesseY;
	}
	public int getAccelerationX() {
		return _accelerationX;
	}
	public int getAccelerationY() {
		return _accelerationY;
	}
	
	//Setteur (idem)
	public void setMasse(int _masse) { //Alexis : Setteur pour masse
		this._masse = _masse;
	}
	public void setHp(int _hp) {
		this._hp = _hp;
	}
	public void setHpMax(int _hpMax) {
		this._hpMax = _hpMax;
	}
	public void setMana(int _mana) {
		this._mana = _mana;
	}
	public void setManaMax(int _manaMax) {
		this._manaMax = _manaMax;
	}
	public void setAttaque(int _attaque) {
		this._attaque = _attaque;
	}
	public void setDefense(int _defense) {
		this._defense = _defense;
	}
	public void setVitesse(int _vitesse) {
		this._vitesse = _vitesse;
	}
	public void setListeAttaque(Attaque[] _listeAttaque) {
		this._listeAttaque = _listeAttaque;
	}
	public void setModAttaque(int _modAttaque) {
		this._modAttaque = _modAttaque;
	}
	public void setModDefense(int _modDefense) {
		this._modDefense = _modDefense;
	}
	public void setModVitesse(int _modVitesse) {
		this._modVitesse = _modVitesse;
	}
	public void setAttaqueEquipement(int _attaqueEquipement) {
		this._attaqueEquipement = _attaqueEquipement;
	}
	public void setDefenseEquipement(int _defenseEquipement) {
		this._defenseEquipement = _defenseEquipement;
	}
	public void setVitesseEquipement(int _vitesseEquipement) {
		this._vitesseEquipement = _vitesseEquipement;
	}
	public void setManaMaxEquipement(int _manaMaxEquipement) {
		this._manaMaxEquipement = _manaMaxEquipement;
	}
	public void setHpMaxEquipement(int _hpMaxEquipement) {
		this._hpMaxEquipement = _hpMaxEquipement;
	}
	public void setType(String _type) {
		this._type = _type;
	}
	public void setVitesseX(int _vitesseX) {
		this._vitesseX = _vitesseX;
	}
	public void setVitesseY(int _vitesseY) {
		this._vitesseY = _vitesseY;
	}
	public void setAccelerationX(int _accelerationX) {
		this._accelerationX = _accelerationX;
	}
	public void setAccelerationY(int _accelerationY) {
		this._accelerationY = _accelerationY;
	}
	
	//---------------------------------------------------------------------------------------------
	
	//Methode! 
	
	/*
	 * celle que vous devez utiliser!!!
	 * 
	 */
	
	//retire x hp a this, si x est negatif, leve une exception!!
	//Test: ok
	public void perdreHp(int x){
		if(x>=0){
			this.setHp(this.getHp()-x);
		}
		else {
			throw new IllegalArgumentException("x doit etre positif!");
		}
	}
	//rend x hp a this, si x est negatif, leve une exception!!
	//Test:ok	
	public void recupererHp(int x){
			if(x>=0&&x<=this.getHpMax()-this.getHp()){
				this.setHp(this.getHp()+x);
			}
			else if (x>this.getHpMax()-this.getHp()){
				this.setHp(this.getHpMax());
			}
			else {
				throw new IllegalArgumentException("x doit etre positif!");
			}
		}
	/*
	 * donne a _modAttaque une valeur egal � x*attaqueGlobal + le _modAttaque precedent
	 * Test:ok
	 */
	public void modifModAttaque(double x){
		this.setModAttaque((int)(this.getModAttaque()+
				x*(this.getAttaque()+this.getAttaqueEquipement())));
		
	}
	/*
	 * reset le modAttaque � 0
	 * Test:ok
	 */
	public void resetModAttaque(){
		this.setModAttaque(0);
	}
	/*
	 * donne a _modDefense une valeur egal � x*defenseGlobal + le _modDefense precedent
	 * Test:ok
	 */
	public void modifModDefense(double x){
		this.setModDefense((int)(this.getModDefense()+
				x*(this.getDefense()+this.getDefenseEquipement())));
		
	}
	/*
	 * reset le modDefense � 0
	 * Test:ok
	 */
	public void resetModDefense(){
		this.setModDefense(0);
	}
	/*
	 * donne a _modVitesse une valeur egal � x*vitesseGlobal + le _modVitesse precedent
	 * Test:ok
	 */
	public void modifModVitesse(double x){
		this.setModVitesse((int)(this.getModVitesse()+
				x*(this.getVitesse()+this.getVitesseEquipement())));
		
	}
	/*
	 * reset le modVitesse � 0
	 * Test:ok
	 */
	public void resetModVitesse(){
		this.setModVitesse(0);
	}
	
	//retire x mana a this, si x est negatif, leve une exception!!
	//Test: ok
	public void perdreMana(int x){
		if(x>=0&&x<this.getMana()){
			this.setMana(this.getMana()-x);
		}
		else if(x>this.getMana()){
			throw new IllegalArgumentException("pas assez de mana!");
		}
		else {
			throw new IllegalArgumentException("x doit etre positif!");
		}
	}
	//rend x mana a this, si x est negatif, leve une exception!!
	//Test:ok
	public void recupererMana(int x){
			if(x>=0&&x<=this.getManaMax()-this.getMana()){
				this.setMana(this.getMana()+x);
			}
			else if (x>this.getManaMax()-this.getMana()){
				this.setMana(this.getManaMax());
			}
			else {
				throw new IllegalArgumentException("x doit etre positif!");
			}
		}
	
	
	/*
	 * determine si l'attaque est efficace contre le pokemon attaqu�
	 * TEST: Ok
	 */
	public boolean estEfficace(Attaque a){
		Boolean aRetourner = false;
		String[] tableElements = {"eau", "plante", "feu", "eau"};
		int i=0;
		while(!this.getType().equals(tableElements[i])){
			i++;
		}
		if(a.getType().equals(tableElements[i+1])){
			aRetourner = true;
		}
		return aRetourner;
		}
	
	/*
	 * determine si l'Attaque est particulierement inefficace contre ce miramon.
	 * TEST: Ok
	 */
	public boolean NEstPasEfficace(Attaque a){
		Boolean aRetourner = false;
		String[] tableElements = {"eau", "feu", "plante", "eau"};
		int i=0;
		while(!this.getType().equals(tableElements[i])){
			i++;
		}
		if(a.getType().equals(tableElements[i+1])){
			aRetourner = true;
		}
		return aRetourner;
		}
	
	public void Attaquer(Vivant m, Attaque a) {
		int efficacite = 2;
		if (a.reussir()){
			if (m.estEfficace(a)){
				efficacite=4;
			}
			else if(m.NEstPasEfficace(a)){
				efficacite=1;
			}
			int degatInflige = (int) (efficacite*a.getPuissance()*this.getAttaque()/m.getDefense());
			m.perdreHp(degatInflige);
			
		}
		
		
	}
	
	public void LvUp() {
		// TODO Auto-generated method stub
		
	}


	
	/*
	 * retourne un String de la forme hpActuel/hpmax
	 * TEST:OK
	 */
	public String toStringPvActuel(){
		String aRetourner=this.getHp()+"/"+this.getHpMax()+"HP";
		return aRetourner;
	}
	
	/*
	 * check si le miramon est ko (pv inferieur ou egaux � 0)
	 * TEST:Ok
	 */
		public Boolean estKo(){
			return this.getHp()<=0;
		}

	
	/*
	 * fin des methodes utiles
	 */

	/*
	 * methode retournant la liste des attaques du miramon sous forme de string
	 * attaque1 attaque2 ...
	 * Test: ok
	 */
	public String toStringListeAttaqueDispo(){
		String listeAttaque = "";
		for(int i=0;i<this.getListeAttaque().length;i++){
			listeAttaque = listeAttaque+this.getListeAttaque()[i].getNom()+" | ";
		}
		return listeAttaque;
		
	}
	/*
	 * return le nom de l'attaque choisie par l'utilisateur en verifiant que 
	 * cette derniere soit bien connue du miramon
	 * test: ok
	 * 
	 */
	public String ChoixAttaqueParUser(){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Quelle attaque "+this.getNom()+" doit'il utiliser?");
		System.out.println("attaque disponible : " +this.toStringListeAttaqueDispo());
		String attaqueChoisie = sc.nextLine();
		int compteur = 0;
		for (int i=0; i<this.getListeAttaque().length;i++){
			if (attaqueChoisie.equals(this.getListeAttaque()[i].getNom())){
				compteur++;
			}
		}
		while(compteur == 0){
			System.out.println("Tapez le nom d'une de vos attaques!");
			attaqueChoisie = sc.nextLine();
			for (int i=0; i<this.getListeAttaque().length;i++){
				if (attaqueChoisie.equals(this.getListeAttaque()[i].getNom())){
					compteur++;
				}
			}
		}
		String aRetourner = ""+attaqueChoisie;
		return aRetourner;
	}
	
	/*
	 * retourne une attaque de this dont le nom est s
	 * Test: a tester
	 */
	public Attaque attaqueSelect(String s){
		Attaque aRetourner = null;
		for(int i=0;i<this.getListeAttaque().length;i++){
			if(this.getListeAttaque()[i].getNom().equals(s)){
				aRetourner=this.getListeAttaque()[i];
			}
		}
		return aRetourner;
	}


	/*
	 * Methode permettant a un miramon de tenter d'en attaquer un second (m) avec une attaque (a)
	 * en cas desucces lesdegats sont calcul� en fonction de l'attaque de this, la defense de m
	 * le type de l'attaque et le type de m
	 * Test:ok
	 */
	public void attaquerAvecDialogue(Vivant m, Attaque a) {
		int efficacite = 2;
		if (a.reussir()){
			//System.out.println(this.getNom()+" utilise l'attaque "+a.getNom());
			if (m.estEfficace(a)){
				System.out.println("C'est super efficace!");
				efficacite=4;
			}
			else if(m.NEstPasEfficace(a)){
				System.out.println("Ce n'est pas tres efficace...");
				efficacite=1;
			}
			int degatInflige = (int) (efficacite*a.getPuissance()*this.getAttaque()/m.getDefense());
			m.perdreHp(degatInflige);
			
		}
		else System.out.println("Mais echoue...");
		
		
	}


	public static void main(String[] args) {
		Vivant grr = new Vivant(null, "feu");
		grr.perdreMana(50);
		grr.recupererMana(-2);
		System.out.println(grr.getMana());
	}
	




}
