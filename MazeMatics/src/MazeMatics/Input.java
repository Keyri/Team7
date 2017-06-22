package MazeMatics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener 
{
		//Provides easier access to key states
		static boolean up = false;
		static boolean down = false;
		static boolean left = false;
		static boolean right = false;
		static boolean run = false;
		
		@Override
		public void keyTyped(KeyEvent e) 
		{
			//Not Used
		}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			//Walk Controls
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				left = true;
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				right = true;
			if (e.getKeyCode() == KeyEvent.VK_UP)
				up = true;
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				down = true;
			
			//Run
			if (e.getKeyCode() == KeyEvent.VK_SHIFT)
				run = true;
			
			//debug output
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode())); //Debug key message
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			//Walk release
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				left = false;
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				right = false;
			if (e.getKeyCode() == KeyEvent.VK_UP)
				up = false;
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				down = false;
			
			//Run release
			if (e.getKeyCode() == KeyEvent.VK_SHIFT)
				run = false;
		}
	}