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
		new Room("UnrevealedRoom", 200, 200, 800, 450, Color.black),
		new Room("RevealedRoom1", 100, 150, 800, 150, Color.white),
		new Room("RevealedRoom2", 100, 150, 400, 150, Color.lightGray),
		new Room("RevealedRoom3", 150, 200, 400, 450, Color.gray),
		new Room("Hallway", 200, 50, 50, 450, Color.lightGray)
	};
	
	public Game() 
	{			
		//Constructor
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
