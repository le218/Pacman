import javax.swing.JFrame;


public class ViewGame extends JFrame{
	
	public ViewGame() throws Exception{
			super();
//			this.controlleur = controlleur;
//			controlGame = new ControleurGame(controlleur);
			setTitle("Commandes");
			setSize(900, 900);
			setLocationRelativeTo(null);
			PanelPacmanGame pane = new PanelPacmanGame(new Maze("layouts/bigCorners.lay"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(pane);
			setVisible(true);
		
	}
	
}
