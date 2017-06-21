package MazeMatics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel 
{	
	CharacterController player = new CharacterController();
	
	public Game() 
	{			
		//player = new CharacterController();
	}
	
	CharacterController getPlayer()
	{
		return player;
	}
	
	void move()
	{
		player.move();
		//More moves here
	}
}
