package MazeMatics;
import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel 
{	
	CharacterController player = new CharacterController();
	
	//Create Rooms here: new Room(name, sizeX, sizeY, PosX, PosY, color)
	static Room[] rooms = 
	{
		new Room("testRoom1", 100, 50, 600, 600, Color.black),
		new Room("testRoom2", 100, 150, 400, 150, Color.lightGray),
		new Room("testRoom3", 150, 200, 400, 450, Color.gray)
	};

	
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
