import java.awt.Graphics2D;

public class CharacterController 
{
	Input input = new Input();
	
	int movementSpeed = 5;
	
	//Size of character
	static int sizeX = 10;
	static int sizeY = 30;
	
	//current position
	static int posX = 600;
	static int posY = 200;
	
	//Current acceleration
	int accX = 0;
	int accY = 0;
	
	static void draw(Graphics2D g)	
	{
		g.fillOval(posX, posY, sizeX, sizeY);
	}
	
	String move()
	{
		if(input.up)
			accY = -movementSpeed;
		if(input.down)
			accY = movementSpeed;
		if(input.left)
			accX = -movementSpeed;
		if(input.right)
			accX = movementSpeed;
		
		posX += accX;
		posY += accY;
		return posX + ", " + posY;	
	}
	
	String moveAbs (int x, int y)
	{
		posX = x;
		posY = y;
		return x + ", " + y;	
	}
}
