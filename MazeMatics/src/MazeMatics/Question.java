package MazeMatics;

import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.Component;

public class Question {
	public static String[] question = {" ","12 x 6 =", "85 x 9 =", "20 x 4 x 7 =", "33 x 11 x 3 =", "620 x 5 =", "550 x 380 =","2,040 x 360 =", "7,000 x 20 x 10 =", 
			"Bruce traveled 600 miles each day of a 10 day trip. How far did he go during the entire trip?", "30 children each sold 20 items for the school fund-raiser. Each child earned $100 for the school. How much money did the school collect?", 
			"22/2", "36/4", "546/3", "768/16", "840/14", "Kristy helped the kindergarten teacher put a total of 192 crayos into 8 boxes. How many crayons did they put into each box?", "The scout troop has to finish a 12-mile hike in 3 hours. How many miles an hour will they have to walk?",
			"At her slumber party, Shelly had 4 friends and 25 pieces of candy. If she kept 5 pieces and divided the rest among her friends, how many pieces did each friend get?", "Kenny's book has 147 pages. He wants to read the same number of pages each day and finish reading the book in 7 days. How many pages should he read each day?",
			"Brian and 2 friends are going to share 27 marbles. How many will each person get?", "Change into fraction: 0.6 =", "Change into fraction: 0.751 =", "Change into decimal: 3/10 =", "Change into decimal: 89/100 =", "Find the greatest common factor for 56 and 72", 
			"Find the greatest common factor for 45 and 81", "Find the least common multiple for 11 and 4", "Find the least common multiple for 5 and 3", "Compare: Make the statement true 0.4 ___ 2/3", "Compare: Make the statement true 1.25 ___ 3/2"};
	
	public static String[] answers = {" ", "72", "765", "560", "1089", "3100", "209000", "734400", "1400000", "6000 miles", "$ 2000", "11", "9", "182", "48", "60", "24", "4", "5", "21", "9", "6/10", "751/1000", "0.3", "0.89", "8", "9", "44", "15", "<", "<"};
	static int questionNumber;
	
	//This function picks a random number to be used in the position check method 
		public static int Random() {
			final Random rand = new Random();
			int number = rand.nextInt(30) + 1;
			return number;
		}
		
		//This checks to see if the player is in any of these positions
		public static void PositionCheck() {
			int questionOne = 0;
			int questionTwo = 0;
			int questionThree = 0;
			String output = "";
			//If they are in any of these positions it pops up with a randomized question
			if (questionOne != 1)
			{
				if (CharacterController.getPosX() == 600 && CharacterController.getPosY() == 200)
				{
					Component frame = null;
					 output = question[Question.Random()];
					JOptionPane.showMessageDialog(frame,  output);
					questionOne = 1;// This stops the spot from generating another question
					
				}
			}
			
			if (questionTwo != 1)
			{
				if (CharacterController.getPosX() == 600 && CharacterController.getPosY() == 600)
				{
					Component frame = null;
					output = question[Question.Random()];
					JOptionPane.showMessageDialog(frame, output);
					questionTwo = 1;
				}
			}
			
			if (questionThree != 1)
			{
				if (CharacterController.getPosX() == 800 && CharacterController.getPosY() == 800)
				{
					Component frame = null;
					output = question[Question.Random()];
					JOptionPane.showMessageDialog(frame, output);
					questionThree = 1;
				}
			}
		}
	}

