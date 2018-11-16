
public class ControlerBasique implements Controller {
	
	Game game;
//	ControleurGame gameControl;
	ViewCommande view ;
	
	public ControlerBasique(){
		game = new SimpleGame(10);
//		gameControl = new ControleurGame(this);
		view = new ViewCommande(this);
	}
	
	public void setController(Controller control){
		view.setController(control);
	}
	
	public void runGame() {
		// TODO Auto-generated method stub
		game.lunch();
	}

	public void pauseGame() {
		// TODO Auto-generated method stub
		//game.setIsRunning(false);
		game.stop();
	}

	public void restartGame() {
		// TODO Auto-generated method stub
		game.setIsRunning(true);
		game.lunch();
	}

	public void stopGame() {
		// TODO Auto-generated method stub
		game.stop();
	}
	
}
