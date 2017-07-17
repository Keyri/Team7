package MazeMatics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D.Float;

public class CharacterController 
{
	int movementSpeed = 1;
	
	//Size of character
	static int sizeX = 10;
	static int sizeY = 30;
	
	//current position
	static int posX = 90;
	static int posY = 350;
	
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
				
		if(wallCollision()){
			accX = - 1;
			accY = - 1;
	}
		
		//if(collision()){
			//accX = - 1;
			//accY = - 1;
		//}
	}
	
	//Move relative to current position
	String move()
	{	
		processInput();
		posX += accX;
		posY += accY;
		return posX + ", " + posY;	
	}
	
	//Instantly move to target position
	String teleport(int x, int y)
	{
		posX = x;
		posY = y;
		return x + ", " + y;	
	}
	
	Float mask = new Rectangle.Float(sizeX, sizeY, posX, posY);

	protected boolean wallCollision() {
	     for (Room room : Game.rooms) {
	          if (Room.intersects(this.mask))
	               return true;
	     }
	     return false;
	}
	
/*public Rectangle getBounds() {
				return new Rectangle(sizeX, sizeY, posX, posY);
			}
			private Boolean collision() {
				boolean collide = false;
				for (Room Room : Game.rooms){
					if(Game.getBounds().intersects(getBounds())){
						collide = true;
					}
			}
				return collide;
		 }*/
}
