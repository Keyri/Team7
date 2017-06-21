package MazeMatics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JPanel 
{
	public Window() 
	{			
		KeyListener input = new Input();
		addKeyListener(input);
		setFocusable(true);
		
		JFrame frame = new JFrame("MazeMatics"); //Create new JFrame
		frame.add(this);
		frame.setSize(1280, 800); //Set Window size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g); //Cleans screen
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Anti-aliasing
		CharacterController.draw(g2d); //Repaints ball

		g2d.setColor(Color.BLACK); //set score color
		g2d.setFont(new Font("Verdana", Font.BOLD, 30)); //Set font of score
		g2d.drawString("Press Enter to \nStart Game(TEMP)", 200, 30); //Get score value and draw
		g2d.drawString("Instructions:\nWalk around solving math issues and saving the universe(TEMP)", 10, 300); //Get score value and draw
		g2d.drawString("Controls(TEMP)", 10, 450); //Get score value and draw
	}
}
