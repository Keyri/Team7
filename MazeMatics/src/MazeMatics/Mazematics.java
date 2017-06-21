package MazeMatics;


import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Mazematics extends JPanel 
{	
	static Game game = new Game();;
	static Window window = new Window();;
	
	public Mazematics() 
	{			
		
	}
		
	public static void main(String[] args) throws InterruptedException 
	{
		while (true) 
		{ 
			game.move(); //Update position
			window.repaint(); //Repaint
			Thread.sleep(10); //Wait
		}
	}
}
