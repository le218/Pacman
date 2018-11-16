
public interface Observer {
	
	public void registerObserver(Observateur observateur);
	public void removeObserver(Observateur observateur);
	public void notifyObserver();

}
