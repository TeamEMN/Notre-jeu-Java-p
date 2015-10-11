package Graphique;
import java.awt.Graphics;
import javax.swing.JPanel;
import Solides.Obstacle;

public class Panel extends JPanel {
	private Obstacle _Obs;
	
	public Panel(Obstacle Obs){
		_Obs = Obs;
	}
	
	public void paintComponent(Graphics g){
		System.out.println("Je suis exécutée !"); 
		g.fillRect(_Obs.getXSG(), _Obs.getYSG(), _Obs.getLongueur(), _Obs.getLargeur());
	}               
}