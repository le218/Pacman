
public class Test {

	public static void main(String[] args) throws Exception
	{
		//Game game1 = new SimpleGame(10);
		//game1.lunch();
		ViewGame view = new ViewGame();
		ControleurGame controlGame = new ControleurGame(new ControlerAvance());	
	}

}