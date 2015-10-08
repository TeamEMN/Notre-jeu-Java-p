package ToutCeQuiPeutVivre;

import java.util.Scanner;

import LesActionsSpecials.Attaque;


public class Vivant{
//variable
	private int _hp;
	private int _mana;
	private int _manaMax;
	private int _attaque;
	private int _defense;
	private Attaque[] _listeAttaque;
	private int _modAttaque;
	private int _modDefense;
	private int _hpMax;
	private String _type;
	private int _vitesse;
	private int _modVitesse;
	//private inventaire monInventaire;
	
	
	
	//Constructeur (tout est ok)
	
	public Vivant(int hp, int lv, int attaque, int defense, 
					Attaque[] listeAttaque,	int modAttaque, 
					int modDefense, int hpMax, String type, int vitesse,String nom){
		_hp=hp;
		_lv=lv;
		_attaque=attaque;
		_defense=defense;
		_listeAttaque=listeAttaque;
		_modAttaque=modAttaque;
		_modDefense=modDefense;
		_hpMax=hpMax;
		_type=type;
		_vitesse=vitesse;
		_nom=nom;
	}
	public Vivant(Attaque[] listeAtt, String type){
		_hp=100;
		_lv=100;
		_attaque=200;
		_defense=150;
		_listeAttaque=listeAtt;
		_modAttaque=2;
		_modDefense=2;
		_hpMax=100;
		_type=type;
		_vitesse=100;
		_nom="trucbidule";
	}
	//getteur (tout es ok)

	public int getHp() {
		// TODO Auto-generated method stub
		return _hp;
	}

	
	public String getNom(){
		return _nom;
	}

	public int getLv() {
		// TODO Auto-generated method stub
		return _lv;
	}


	public int getAttaque() {
		// TODO Auto-generated method stub
		return _attaque;
	}


	public int getDefense() {
		// TODO Auto-generated method stub
		return _defense;
	}

	
	public Attaque[] getListeAttaque() {
		// TODO Auto-generated method stub
		return _listeAttaque;
	}


	public int getHpMax() {
		// TODO Auto-generated method stub
		return _hpMax;
	}
	
	
	public String getType(){
	return _type;
	}
	
	public int getVitesse(){
		return _vitesse;
	}
	//-----------------------------------------------------------------------
	
	//Setteur (tout est ok)
	
	

	public void setHp(int x) {
		// TODO Auto-generated method stub
		_hp=x;
	}


	public void setNom(String s){
		_nom=s;
	}
	
	
	public void setLv(int x) {
		// TODO Auto-generated method stub
		_lv=x;
	}


		public void setAttaque(int x) {
		// TODO Auto-generated method stub
		_attaque=x;
	}


	public void setDefense(int x) {
		// TODO Auto-generated method stub
		_defense=x;
	}


	public void setListeAttaque(Attaque[] l) {
		// TODO Auto-generated method stub
		_listeAttaque=l;
	}
	

	public void setHpMax(int x) {
		// TODO Auto-generated method stub
		_hpMax=x;
	}
	
	
	public void setType(String s){
		_type=s;
	}
	
	
	public void setVitesse(int v){
		_vitesse = v;
	}
	//---------------------------------------------------------------------------------------------
	
	//Methode!

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
		System.out.println("Quelle attaque "+this.getNom()+" doit'il utiliser?");
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
	 * determine si l'attaque est efficace contre le pokemon attaqué
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
	/*
	 * Methode permettant a un miramon de tenter d'en attaquer un second (m) avec une attaque (a)
	 * en cas desucces lesdegats sont calculé en fonction de l'attaque de this, la defense de m
	 * le type de l'attaque et le type de m
	 * Test:ok
	 */
	public void attaquerAvecDialogue(Vivant m, Attaque a) {
		int efficacite = 2;
		if (a.reussir()){
			System.out.println(this.getNom()+" utilise l'attaque "+a.getNom());
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
	 * reduit les hp du miramon de x
	 * TEST:OK
	 */
	public void perdreHp(int x) {
		// TODO Auto-generated method stub
		this.setHp(this.getHp()-x);
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
 * check si le miramon est ko (pv inferieur ou egaux à 0)
 * TEST:Ok
 */
	public Boolean estKo(){
		return this.getHp()<=0;
	}
	
	
	




}
