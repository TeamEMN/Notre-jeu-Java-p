package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class FenetreDeLancement extends JFrame{
	private static final long serialVersionUID = 1L;
	private JLabel affichage;
	private JTextArea texte;

	
	public FenetreDeLancement() {
		// TODO Auto-generated constructor stub
	
		super("Titre du jeu youpidou!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container principal = this.getContentPane();
		principal.setLayout(new BorderLayout());
		JButton boutonLancement = new JButton(new ImageIcon("images"+File.separator+"Burning_Sky_by_myst111.jpg"));
		principal.add(boutonLancement);
		this.pack();
		this.setSize(966, 678);
	
	}



	public static void main(String[] args) {
	
		FenetreDeLancement nouvelleFen= new FenetreDeLancement();
		nouvelleFen.setVisible(true);
	}


}
