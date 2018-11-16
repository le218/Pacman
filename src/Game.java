import java.awt.List;
import java.util.ArrayList;


public abstract class Game implements Runnable, Observer {
	private int nbreTour;	// nombre de tour 
	private int nbreMaxTour; // nombre maximum de tour
	private boolean isRunning; // determine si le jeux est terminé ou pas 
	private Thread thread;
	private ArrayList<Observateur> observateurs;
	
	//initialisation du nombre max de tour à la creation du jeux 
	public Game(int nbreMaxTour){
		this.nbreMaxTour = nbreMaxTour;
		this.isRunning = true;
		observateurs = new ArrayList<>();
	}
	
	//initialisation de la parite
	public void init (){
		this.nbreTour = 0;
		initializeGame();
	}
	
	public abstract void initializeGame();
	
	public void step(){
		if((nbreMaxTour == nbreTour) || isTerminate())
			gameOver();
		else{
			nbreTour++;
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			
			takeTurn();
		}
			
	}
	
	public abstract void takeTurn(); 
	public abstract void gameOver();
	public abstract boolean isTerminate();
	
	public void run(){
		while((isRunning) && (nbreTour < nbreMaxTour) && !isTerminate()){
			step();
		}
	}
	
	public void stop(){
		this.isRunning = false;
	}
	
	public int getNbreTour(){
		return this.nbreTour;
	}
	
	public int getNbreTourMax(){
		return nbreMaxTour;
	}
	
	public boolean getIsRunning(){
		return isRunning;
	}
	
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	public void lunch(){
		thread = new Thread(this);
		thread.start();
		
	}
	
	public void registerObserver(Observateur observateur){
//		System.out.println("here we add new Oberser");
		this.observateurs.add(observateur);
	}
	
	public void removeObserver(Observateur observateur){
//		System.out.println("here we remove a new oberser");
		this.observateurs.remove(observateur);
	}
	
	public void notifyObserver(){
//		System.out.println("here we notify observer");
		for(int i=0; i<observateurs.size(); i++){
			Observateur observateur = observateurs.get(i);
			//observateur.actualiser(this);
		}
	}
}