package MazeMatics;


import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Mazematics extends JPanel 
{	
	static Game game = new Game();
	static Window window = new Window();
	
	public Mazematics() 
	{			
		//Constructor
	}
		
	public static void main(String[] args) throws InterruptedException 
	{
		//Main loop
		while (true)
		{ 
			game.update(); //Game loop
			Input.clean(); //Reset input pressed and released states
			window.repaint(); //Repaints window
			System.out.println(game.player.mask.x);
			System.out.println(game.player.mask.y);
			Thread.sleep(20); //Slows game down
		}
	}
}
