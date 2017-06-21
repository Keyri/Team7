import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener 
{
		boolean up = false;
		boolean down = false;
		boolean left = false;
		boolean right = false;
		
		@Override
		public void keyTyped(KeyEvent e) 
		{

		}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				left = true;
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				right = true;
			if (e.getKeyCode() == KeyEvent.VK_UP)
				up = true;
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				down = true;
			
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode())); //Debug key message
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				left = false;
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				right = false;
			if (e.getKeyCode() == KeyEvent.VK_UP)
				up = false;
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				down = false;
		}
	}