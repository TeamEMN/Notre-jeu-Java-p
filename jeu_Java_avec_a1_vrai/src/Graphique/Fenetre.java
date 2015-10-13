package Graphique;
import javax.swing.JFrame;

import Solides.Obstacle;
import Solides.Rectangles;

public class Fenetre extends JFrame {
	public Fenetre(){
		this.setTitle("Holala quel jeu");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setVisible(true);
		Panel Pan = new Panel();
		this.setContentPane(Pan);
		
		Pan.go();
		
		}
	}