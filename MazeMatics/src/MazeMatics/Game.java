package MazeMatics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel 
{	
	CharacterController player = new CharacterController();
	
	public Game() 
	{			

	}
	
	CharacterController getPlayer()
	{
		//Returns player referenced by this object
		return player;
	}
	
	void move()
	{
		player.move();
		//More moves here
	}
}
