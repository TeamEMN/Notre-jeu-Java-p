package Graphique;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import Champs.Poids;
import LesActionsSpecials.Attaque;
import Mecanismes.Aimant;
import ModelePhysique.Force;
import ModelePhysique.Physique;
import Ponctuelles.Electromagnetisme;
import ToutCeQuiPeutVivre.Vivant;

public class Panel extends JPanel {
	private Vivant _Perso;
	private Physique _Modele;
	
	public Panel(){
		_Perso = initialisationPerso();
		_Modele = initialisationModele();
	}
	
	public void paintComponent(Graphics g){
		g.fillRect(_Perso.getXSG(), _Perso.getYSG(), _Perso.getLongueur(), _Perso.getLargeur());
	} 
	
	public Vivant initialisationPerso() {
		Attaque Feu = new Attaque("magie",10,5,"feu");
		Attaque[] ListeAttaque = {Feu}; 
		Vivant Perso = new Vivant(ListeAttaque,"mage");
		return Perso;
	}
	
	public Physique initialisationModele(){
		Aimant Aim = new Aimant(1000,10,10,100,100);
		Electromagnetisme EM = new Electromagnetisme(_Perso,Aim);
		ArrayList<Force> ListeForce = new ArrayList<Force>();
		ListeForce.add(0,EM);
		Physique Modele = new Physique(ListeForce,1);
		Modele.Newton(_Perso);
		return Modele;
	}
	
	
	public void go() {
		int i = 0;
		while (i < 30){
			_Modele.Integration(_Perso);
			try {
				Thread.sleep(40);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println(_Perso.getYSG());
			this.repaint();
			i++;
		}
	
	}
}