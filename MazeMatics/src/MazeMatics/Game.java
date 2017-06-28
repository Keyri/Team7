package MazeMatics;
import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel 
{	
	static boolean isPaused = false; //Halts movement and actions if set to true
	
	CharacterController player = new CharacterController();
	
	//Create Rooms here: new Room(name, sizeX, sizeY, PosX, PosY, color)
	static Room[] rooms = 
	{
		new Room("UnrevealedRoom", 200, 200, 800, 450, Color.black),
		new Room("RevealedRoom1", 100, 150, 800, 150, Color.white),
		new Room("RevealedRoom2", 100, 150, 400, 150, Color.lightGray),
		new Room("RevealedRoom3", 150, 200, 400, 450, Color.gray),
		new Room("Hallway", 200, 50, 50, 450, Color.lightGray),
		new Room("OverloadedConstructor", 250, 100, 50, 550, Color.cyan, Color.red, 20)
	};
	
	public Game() 
	{			
		//Constructor
		//Linking rooms example
		rooms[2].linkRoom(rooms[1], linkSide.RIGHT, 1f);
		rooms[4].linkRoom(rooms[2], linkSide.RIGHT, 1);
		rooms[0].linkRoom(rooms[1], linkSide.LEFT, 1);
		rooms[3].linkRoom(rooms[0], linkSide.TOP, 1);
		rooms[5].linkRoom(rooms[3], linkSide.BOTTOM, 1);
	}
	
	CharacterController getPlayer()
	{
		//Returns player referenced by this object
		return player;
	}
	
	void update() //Main game loop
	{	
		//Pause Menu
		if(Input.menuPressed)
			isPaused = !isPaused;

		//Runs actions if not paused
		if(!isPaused)
		{
			player.move();
			//More moves and actions here
		}		
	}
}
