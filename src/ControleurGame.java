
public class ControleurGame {
	
	Controller control;
	
	ControleurGame (Controller control){
		this.control = control;
	}
	
	public void setController(Controller control){
		control.setController(control);
	}
	
	public void start(){
		control.runGame();
	}
	
	public void stop(){
		control.stopGame();
	}
	
	public void restart(){
		control.restartGame();
	}
	
	public void pauseGame(){
		control.pauseGame();
	}
}