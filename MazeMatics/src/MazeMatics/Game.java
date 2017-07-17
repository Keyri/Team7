package MazeMatics;
import java.awt.Color;
//import java.awt.Rectangle;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel 
{	
	static boolean isPaused = false; //Halts movement and actions if set to true
	
	CharacterController player = new CharacterController();
	
	//Create Rooms here: new Room(name, sizeX, sizeY, PosX, PosY, color)
	static Room[] rooms = 
	{
		new Room("Entrance", 75, 75, 50, 325, Color.white), //Root room 0
		new Room("NorthHallway1", 50, 150, 0, 0, Color.white), //1
		new Room("SouthHallway1", 50, 150, 0, 0, Color.white), //2
		new Room("EastHallway1", 150, 50, 0, 0, Color.white), //3
		new Room("NorthRoom1", 150, 100, 0, 0, Color.white), //4
		new Room("SouthRoom1", 150, 100, 0, 0, Color.white), //5
		new Room("EastRoom1", 100, 150, 0, 0, Color.white), //6
		new Room("EastHallway2", 150, 50, 0, 0, Color.white), //7
		new Room("DeadEnd1", 50, 150, 0, 0, Color.white), //8
		new Room("DeadEnd2", 75, 50, 0, 0, Color.white), //9
		new Room("EastHallwayLong", 400, 50, 0, 0, Color.white), //10
		new Room("QuestionRoomBig", 200, 200, 0, 0, Color.white), //11
		new Room("SouthHallwayLong", 50, 400, 0, 0, Color.white), //12
		new Room("EastHallway3", 200, 50, 0, 0, Color.white), //13
		new Room("SouthHallwayLong2", 50, 400, 0, 0, Color.white), //14
		new Room("EastHallway4", 300, 50, 0, 0, Color.white), //15
		new Room("EastHallway5", 100, 50, 0, 0, Color.white), //16
		new Room("EastHallway6", 100, 50, 0, 0, Color.white), //17
		new Room("SouthHallway2", 50, 150, 0, 0, Color.white), //18
		new Room("EastHallway7", 300, 50, 0, 0, Color.white), //19
	};
	
	public Game() 
	{			
		//Constructor
		//Linking rooms example
		rooms[1].linkRoom(rooms[0], linkSide.TOP, 1f);
		rooms[2].linkRoom(rooms[0], linkSide.BOTTOM, 1f);
		rooms[3].linkRoom(rooms[0], linkSide.RIGHT, 1f);
		rooms[4].linkRoom(rooms[1], linkSide.TOP, 1f);
		rooms[5].linkRoom(rooms[2], linkSide.BOTTOM, 1f);
		rooms[6].linkRoom(rooms[3], linkSide.RIGHT, 1f);
		rooms[7].linkRoom(rooms[4], linkSide.RIGHT, 1f);
		rooms[8].linkRoom(rooms[7], linkSide.BOTTOM, 1f);
		rooms[9].linkRoom(rooms[8], linkSide.LEFT, 1f);
		rooms[10].linkRoom(rooms[5], linkSide.RIGHT, 1f);
		rooms[11].linkRoom(rooms[10], linkSide.RIGHT, 1f);
		rooms[12].linkRoom(rooms[10], linkSide.TOP, 1.5f); //Offset
		rooms[13].linkRoom(rooms[12], linkSide.LEFT, 1.8f); //Offset
		rooms[14].linkRoom(rooms[11], linkSide.TOP, 1f);
		rooms[15].linkRoom(rooms[14], linkSide.LEFT, 0f); //Offset
		rooms[16].linkRoom(rooms[14], linkSide.LEFT, 1f);
		rooms[17].linkRoom(rooms[14], linkSide.RIGHT, 1f);
		rooms[18].linkRoom(rooms[17], linkSide.TOP, 2f); //Offset
		rooms[19].linkRoom(rooms[11], linkSide.RIGHT, 1f);
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
	//public Rectangle getBounds() {
		//return new Rectangle(75, 75, 50, 325);
//}
}
