package MazeMatics;
import java.awt.Color;
import java.awt.Graphics2D;

public class CharacterController 
{
	int movementSpeed = 1;
	
	//Size of character
	static int sizeX = 10;
	static int sizeY = 30;
	
	//current position
	static int posX = 600;
	static int posY = 200;
	
	//Current acceleration
	int accX = 0;
	int accY = 0;
	
	CharacterController()
	{
		//Constructor
	}
	
	static void draw(Graphics2D g)	
	{
		g.setColor(Color.blue);
		g.fillOval(posX, posY, sizeX, sizeY);
	}
	
	void processInput()
	{
		//Add acceleration from key down
		if(Input.up)
			accY = -movementSpeed;
		if(Input.down)
			accY = movementSpeed;
		if(Input.left)
			accX = -movementSpeed;
		if(Input.right)
			accX = movementSpeed;
		
		//Run
		if(Input.run)
			movementSpeed = 2;
		
		//Remove acceleration on key release
		if(!Input.up && !Input.down)
			accY = 0;
		if(!Input.left && !Input.right)
			accX = 0;
		
		//Stop Running
		if(!Input.run)
			movementSpeed = 1;
	}
	
	String move()
	{	
		processInput();
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
