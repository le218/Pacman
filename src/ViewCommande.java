import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javafx.geometry.HorizontalDirection;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
	
public class ViewCommande extends JFrame{
	ControleurGame controlGame;
	Controller controlleur;
	 
	JButton bouton_restart;
	JButton bouton_run;
	JButton bouton_step;
	JButton bouton_pause;
	JSlider slider;
	JLabel labelJeux;
	
	public ViewCommande(Controller controlleur){
		super();
		this.controlleur = controlleur;
		controlGame = new ControleurGame(controlleur);
		setTitle("Commandes");
		setSize(700, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel());
		setVisible(true);
	}
	
	public JPanel panel(){
		bouton_restart = new JButton(new ImageIcon("Icones/icon_restart.png"));
		bouton_run =  new JButton(new ImageIcon("Icones/icon_run.png"));
		bouton_step = new JButton(new ImageIcon("Icones/icon_step.png")); 
		bouton_pause = new JButton(new ImageIcon("Icones/icon_pause.png"));
		
		JPanel pannelGlobal = new JPanel(new GridLayout(2,1));
		
		JPanel panelBouton = new JPanel(new GridLayout(1,4));
		panelBouton.add(bouton_restart);
		panelBouton.add(bouton_run);
		panelBouton.add(bouton_step);
		panelBouton.add(bouton_pause);
		
		JPanel panel = new JPanel();
		slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		labelJeux = new JLabel();
		labelJeux.setText("Turn:8");	
		panel.add(slider);
		panel.add(labelJeux);
		
		pannelGlobal.add(panelBouton);
		pannelGlobal.add(panel);
		
		bouton_pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controlGame.pauseGame();;
			}
		});
		
		bouton_restart.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controlGame.restart();
			}
		});
		
		bouton_run.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controlGame.start();
			}
		});
		
		bouton_step.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("cest un pas");
			}
		});
		return pannelGlobal;
	}

	public Controller getController() {
		return controlleur;
	}

	public void setController(Controller controlleur) {
		this.controlleur = controlleur;
	}

	public JButton getBouton_restart() {
		return bouton_restart;
	}

	public void setBouton_restart(JButton bouton_restart) {
		this.bouton_restart = bouton_restart;
	}

	public JButton getBouton_run() {
		return bouton_run;
	}

	public void setBouton_run(JButton bouton_run) {
		this.bouton_run = bouton_run;
	}

	public JButton getBouton_step() {
		return bouton_step;
	}

	public void setBouton_step(JButton bouton_step) {
		this.bouton_step = bouton_step;
	}

	public JButton getBouton_pause() {
		return bouton_pause;
	}

	public void setBouton_pause(JButton bouton_pause) {
		this.bouton_pause = bouton_pause;
	}

	public JSlider getSlider() {
		return slider;
	}

	public void setSlider(JSlider slider) {
		this.slider = slider;
	}

	public JLabel getLabelJeux() {
		return labelJeux;
	}

	public void setLabelJeux(JLabel labelJeux) {
		this.labelJeux = labelJeux;
	}
}
