package MazeMatics;


import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Mazematics extends JPanel 
{	
	static Game game = new Game();;
	static Window window = new Window();;
	
	public Mazematics() 
	{			
		//Constructor
	}
		
	public static void main(String[] args) throws InterruptedException 
	{
		while (true) 
		{ 
			game.move(); //Update positions
			window.repaint(); //Repaint
			Thread.sleep(20); //Slows game down
		}
	}
}
