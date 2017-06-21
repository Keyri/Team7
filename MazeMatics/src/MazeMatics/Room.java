package MazeMatics;

import java.awt.Color;
import java.awt.Graphics2D;

public class Room 
{
	private String name;
	private int sizeX;
	private int sizeY;
	private int posX;
	private int posY;
	private Color color;
	
	Room(String name, int sizeX, int sizeY, int posX, int posY, Color color)
	{
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	
	void draw(Graphics2D g)	
	{
		g.setColor(color);
		g.fillRect(posX, posY, sizeX, sizeY);
	}
}
