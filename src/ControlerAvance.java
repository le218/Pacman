
public class ControlerAvance implements Controller{
	
	Game game;
	ControleurGame gameControl;
	ViewCommande view;
	
	public ControlerAvance() {
		// TODO Auto-generated constructor stub
		game = new SimpleGame(10);
		gameControl =  new ControleurGame(this);
		view = new ViewCommande(this);
		view.getBouton_pause().setEnabled(false);
		view.getBouton_restart().setEnabled(false);
		view.getBouton_step().setEnabled(false);
		
	}
	
	public void setController(Controller control){
		view.setController(control);
	}
	
	public void runGame() {
		// TODO Auto-generated method stub
		game.lunch();
		view.getBouton_run().setEnabled(false);
		view.getBouton_pause().setEnabled(true);
		view.getBouton_step().setEnabled(true);
	}

	public void pauseGame() {
		// TODO Auto-generated method stub
		game.stop();
		view.getBouton_pause().setEnabled(false);
		view.getBouton_restart().setEnabled(true);
		view.getBouton_step().setEnabled(false);
	}

	public void restartGame() {
		// TODO Auto-generated method stub
		game.setIsRunning(true);
		game.lunch();
		view.getBouton_pause().setEnabled(true);
		view.getBouton_step().setEnabled(true);
		view.getBouton_restart().setEnabled(false);

	}

	public void stopGame() {
		// TODO Auto-generated method stub
		game.stop();
	}
}

