package MazeMatics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener 
{
	//Set key bindings here
	static int bindingMenu = KeyEvent.VK_ESCAPE;
	static int bindingUp = KeyEvent.VK_UP;
	static int bindingDown = KeyEvent.VK_DOWN;
	static int bindingLeft = KeyEvent.VK_LEFT;
	static int bindingRight = KeyEvent.VK_RIGHT;
	static int bindingRun = KeyEvent.VK_SHIFT;
	
	//Provides easier access to key states
	static boolean menu = false;
	static boolean menuPressed = false;
	static boolean menuReleased = false;
	
	static boolean up = false;
	static boolean upPressed = false;
	static boolean upReleased = false;
		
	static boolean down = false;
	static boolean downPressed = false;
	static boolean downReleased = false;
	
	static boolean left = false;
	static boolean leftPressed = false;
	static boolean leftReleased = false;
	
	static boolean right = false;
	static boolean rightPressed = false;
	static boolean rightReleased = false;
	
	static boolean run = false;
	static boolean runPressed = false;
	static boolean runReleased = false;
	
	//Internally used to get pressed event once per frame
	private static boolean isMenuReleased = true;
	private static boolean isUpReleased = true;
	private static boolean isDownReleased = true;
	private static boolean isLeftReleased = true;
	private static boolean isRightReleased = true;
	private static boolean isRunReleased = true;
		
	@Override
	public void keyTyped(KeyEvent e) 
	{
		//Not Used
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		//Menu
		if (e.getKeyCode() == bindingMenu)
		{
			menu = true;
			if(isMenuReleased)
			{
				menuPressed = true;
				isMenuReleased = false;
			}
		}
		
		//Up
		if (e.getKeyCode() == bindingUp)
		{
			up = true;
			if(isUpReleased)
			{
				upPressed = true; //Returns true one frame only
				isUpReleased = false;
			}
		}
		
		//Down
		if (e.getKeyCode() == bindingDown)
		{
			down = true;
			if(isDownReleased)
			{
				downPressed = true; //Returns true one frame only
				isDownReleased = false;
			}
		}
		
		//Left
		if (e.getKeyCode() == bindingLeft)
		{
			left = true;
			if(isLeftReleased)
			{
				leftPressed = true; //Returns true one frame only
				isLeftReleased = false;
			}
		}
		
		//Right
		if (e.getKeyCode() == bindingRight)
		{
			right = true;
			if(isRightReleased)
			{
				rightPressed = true; //Returns true one frame only
				isRightReleased = false;
			}
		}
			
		//Run
		if (e.getKeyCode() == bindingRun)
		{
			run = true;	
			if(isRunReleased)
			{
				runPressed = true; //Returns true one frame only
				isRunReleased = false;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		//Release Menu
		if (e.getKeyCode() == bindingMenu)
		{
			menu = false;
			isMenuReleased = true;
			menuReleased = true;
		}
		
		//Release Up
		if (e.getKeyCode() == bindingUp)
		{
			up = false;
			isUpReleased = true;
			upReleased = true;
		}
		
		//Release Down
		if (e.getKeyCode() == bindingDown)
		{
			down = false;
			isDownReleased = true;
			downReleased = true;
		}
		
		//Release Left
		if (e.getKeyCode() == bindingLeft)
		{
			left = false;
			isLeftReleased = true;
			leftReleased = true;
		}
		
		//Release Right
		if (e.getKeyCode() == bindingRight)
		{
			right = false;
			isRightReleased = true;
			rightReleased = true;
		}
			
		//Release Run
		if (e.getKeyCode() == bindingRun)
		{
			run = false;
			isRunReleased = true;
			runReleased = true;
		}
	}
	
	//Resets pressed and released states
	public static void clean()
	{
		menuPressed = false;
		menuReleased = false;
		upPressed = false;
		upReleased = false;
		downPressed = false;
		downReleased = false;
		leftPressed = false;
		leftReleased = false;
		rightPressed = false;
		rightReleased = false;
		runPressed = false;
		runReleased = false;
	}
}