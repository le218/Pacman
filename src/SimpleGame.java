
public class SimpleGame extends Game{
	
	public SimpleGame(int nbreMax){
		super(nbreMax);
	}

	public void initializeGame(){
		System.out.println("execution de inialize Game");
	}
	
	public void takeTurn(){
		System.out.println("execution de takeTurn "+super.getNbreTour());
	}
	
	public void gameOver(){
		System.out.println("execution de gameOVer");
	}
	
	public boolean isTerminate(){
		return false;
	}
}
