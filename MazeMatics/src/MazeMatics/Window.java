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
	
	//Rendering
	@Override
	public void paint(Graphics g) //Each item renders on top of the previous item
	{
		super.paint(g); //Cleans screen
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Anti-aliasing
		
		//Title and start
		g2d.setColor(Color.BLACK); //set font color
		g2d.setFont(new Font("Verdana", Font.BOLD, 40)); //Set Font and size
		g2d.drawString("MazeMatics", 500, 50);
		g2d.drawString("Press Enter to Start Game", 350, 750); //Temp text draw
		
		//Instructions
		g2d.setFont(new Font("Verdana", Font.PLAIN, 25)); //Set Font and size
		g2d.drawString("Navigate through a maze and solve math problems to", 300, 350);
		g2d.drawString("proceed through doors until you reach the Math Wizard", 300, 400);
		
		//Controls
		g2d.setFont(new Font("Verdana", Font.BOLD, 30)); //Set Font and size
		g2d.drawString("Controls", 10, 50); //Temp controls draw
		g2d.setFont(new Font("Verdana", Font.PLAIN, 20));
		g2d.drawString("Pause: Escape", 10, 75);
		g2d.drawString("Up: Up arrow", 10, 100);
		g2d.drawString("Down: Down arrow", 10, 125);
		g2d.drawString("Left: Left arrow", 10, 150);
		g2d.drawString("Right: Right arrow", 10, 175);
		g2d.drawString("Run: Shift", 10, 200);	
		
		//Rooms: Loops through each room and draws room
		for(Room room:Game.rooms)
			room.draw(g2d); //draws Rooms
		//Character
		CharacterController.draw(g2d); //draws Character
	}
}
