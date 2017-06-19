import java.awt.Graphics2D;

public class CharacterController 
{
	int movementSpeed = 5;
	static int sizeX = 10;
	static int sizeY = 30;
	static int posX = 600;
	static int posY = 200;
	
	static void draw(Graphics2D g)	
	{
		g.fillOval(posX, posY, sizeX, sizeY);
	}
	
	String move(int x, int y)
	{
		posX += x;
		posY += y;
		return x + ", " + y;	
	}
	
	String moveAbs (int x, int y)
	{
		posX = x;
		posY = y;
		return x + ", " + y;	
	}
}
