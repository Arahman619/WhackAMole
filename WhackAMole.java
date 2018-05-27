
public class WhackAMole {

    int score, molesLeft, attemptsLeft;
    char moleGrid [] [] = new char[10] [10];

    WhackAMole(int numAttempts, int gridDimension) {

	/*Constructor for the game, specifies total number of whacks allowed, and the grid dimension. 
	 * After reading through the assignment, make sure to initialize the moleGrid with the appropriate character.*/
	
	attemptsLeft = 50;
	molesLeft = 10;
	score = 0;
	for (int j = 0; j <10; j++) {
	    for (int i = 0; i < 10; i++) {
		System.out.println("Array complete! " +i +" " +j);
	    }
	}
	

    }

    boolean place(int x, int y) {
	//Given a location, place a mole at that location. Return true if you can. 
	//(Also update number of moles left.)



	return true;
    }

    void whack(int x, int y) {
	/*Given a location, take a whack at that location. 
	 * If that location contains a mole, the score, number of attemptsLeft, and molesLeft is updated. 
	 * If that location does not contain a mole, only attemptsLeft is updated*/


    }

    void printGridToUser() {
	/*Print the grid without showing where the moles are. 
	 * For every spot that has recorded a “whacked mole,” print out a W, or * otherwise.*/


    }

    void printGrid() {
	/* Print the grid completely. This is effectively dumping the 2d array on the screen. 
	 * The places where the moles are should be printed as an ‘M’. 
	 * The places where the moles have been whacked should be printed as a ‘W’. 
	 * The places that don’t have a mole should be printed as *. */



    }

    public static void main(String[] args) {
	/**In order to play this game you need to create a main method. 
Begin by creating a 10 by 10 grid where you randomly place the moles. Place a total of 10 moles.
Now allow the user (remember how to use Scanner?) to enter the x and y coordinates of where they would like to take a whack. 
Tell them they have a maximum of 50 attempts to get all the moles. 
At any point in the game, they can input coordinates of -1, -1 in order to indicate that they are giving up. 
If the user gives up they get to see the entire grid.  
The game ends if the user is able to uncover all the moles or if the user runs out of attempts.*/
	
	

	System.out.println("All is good.");
	
	WhackAMole game = new WhackAMole(50, 10);
	System.out.println("\nTotal Score = " +game.score);
	System.out.println("Atempts Left = " +game.attemptsLeft);



    }

}
