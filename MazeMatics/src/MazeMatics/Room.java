package MazeMatics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Room 
{
	String name;
	int sizeX;
	int sizeY;
	int posX;
	int posY;
	
	Color color = Color.black;;
	Color borderColor = Color.black;
	int borderThickness = 5;
	
	//Constructor
	Room(String name, int sizeX, int sizeY, int posX, int posY, Color color)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	//Overloaded Constructor
	Room(String name, int sizeX, int sizeY)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	//Overloaded Constructor
	Room(String name, int sizeX, int sizeY, int posX, int posY)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
	}
	
	//Overloaded Constructor
	Room(String name, int sizeX, int sizeY, int posX, int posY, Color color, Color borderColor, int borderThickness)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
		this.color = color;
		this.borderColor = borderColor;
		this.borderThickness = borderThickness;
	}	
	
	int[] bounds() //Not Yet Implemented
	{
		//TODO: Calculate bounds here for collision
		int[] bounds = {0, 0};
		return bounds;
	}
	
	void linkRoom(Room linkedRoom, String connectionPoint, float offset)
	{
		//connection offset should be 0.2f - 1
		if(connectionPoint.toUpperCase() == "RIGHT")
		{
			posY = (int) (linkedRoom.posY * offset);
			posX = linkedRoom.posX + linkedRoom.sizeX;
		}
	}
		
	void draw(Graphics2D g)	
	{
		//Draw Room
		g.setColor(color);
		g.fillRect(posX, posY, sizeX, sizeY); //room
		
		//Draw Border Outline
		g.setColor(borderColor);
		g.setStroke(new BasicStroke(borderThickness)); //border thickness
		g.drawRect(posX, posY, sizeX, sizeY); //border
	}
}
