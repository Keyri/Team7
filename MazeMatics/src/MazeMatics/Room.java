package MazeMatics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Room 
{
	private String name;
	private int sizeX;
	private int sizeY;
	private int posX;
	private int posY;
	Color color;
	
	Room(String name, int sizeX, int sizeY, int posX, int posY, Color color)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	int getPosX()
	{
		return posX;
	}
	
	int getPosY()
	{
		return posY;
	}
	
	int getSizeX()
	{
		return sizeX;
	}
	
	int getSizeY()
	{
		return sizeY;
	}
	
	int[] bounds() //Not Yet Implemented
	{
		//TODO: Calculate bounds here for collision
		int[] bounds = {0, 0};
		return bounds;
	}
	
	void draw(Graphics2D g)	
	{
		//Draw Room
		g.setColor(color);
		g.fillRect(posX, posY, sizeX, sizeY); //room
		
		//Draw Border Outline
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(5)); //border thickness
		g.drawRect(posX, posY, sizeX, sizeY); //border
	}
}
