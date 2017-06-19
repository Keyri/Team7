import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Mazematics extends JPanel 
{
	public Mazematics() 
	{		
		setFocusable(true);
	}
	
	private void move() //Updated ball and racquet position
	{
		//ball.move();
		//racquet.move();
	}

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g); //Cleans screen
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //Smoothes edges
				RenderingHints.VALUE_ANTIALIAS_ON);
		CharacterController.draw(g2d); //Repaints ball

		g2d.setColor(Color.BLACK); //set score color
		g2d.setFont(new Font("Verdana", Font.BOLD, 30)); //Set font of score
		g2d.drawString("Start Game", 10, 30); //Get score value and draw
		g2d.drawString("Instructions", 10, 70); //Get score value and draw
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("MazeMatics"); //Create new JFrame
		Mazematics mazematics = new Mazematics(); //Instantiate Game class
		frame.add(mazematics);
		frame.setSize(1280, 800); //Set Window size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) { 
			mazematics.move(); //Update position
			mazematics.repaint(); //Repaint
			Thread.sleep(10); //Wait
		}

	}

}
