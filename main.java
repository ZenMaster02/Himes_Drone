/*
 * Zen Himes
 * Date: 1/14/22
 * Program Name Module1Assignment
 * Purpose: Simulation of drone movement in x,y,z location
 */
import java.util.*;
public class main {
	public static void main (String[] args) {
		boolean cont= true; //sets the while loop the continue
		Drone userDrone = new Drone("Student_Drone"); //names the drone
		do { //repeats until choice 8 is made
			int userChoice; //initializes user choice
			userChoice=menu(); //prints out the menu and asks for a number and returns it
			switch(userChoice) { //depending on the user choice different Drone methods will be called
			case 1: { //moves the drone up
				userDrone.moveUp();
				System.out.println("The drone moved up");
				break;
			}
			case 2: { //moves the drone down
				userDrone.moveDown();
				System.out.println("The drone moved down");
				break;
			}
			case 3: { //moves the drone forwards
				userDrone.moveForward();
				System.out.println("The drone moved forward");
				break;
			}
			case 4: { //moves the drone backwards
				userDrone.moveBackward();
				System.out.println("The drone moved backward");
				break;
			}
			case 5: { //changes orientation to the left
				userDrone.turnLeft();
				System.out.println("The drone turned left");
				break;
			}
			case 6: { //changes orientation to the right
				userDrone.turnRight();
				System.out.println("The drone turned right");
				break;
			}
			case 7: { //displays coordinates
				userDrone.dispCoor();
				break;
			}
			case 8: {//exits the loop
				System.out.println("Goodbye");
				cont=false;
				break;
			}
			default:{
				System.out.println("Try a valid number"); //in case the user enters a number not 1-8
				break;
			}
		} 
		
		}while(cont);
		System.exit(0);//ends the program
	}
	public static int menu() { //prints out the menu
		int selection;
		Scanner input = new Scanner(System.in); //sets up a scanner
		
		System.out.println("Which direction would you like to move the drone");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");
		
		selection = input.nextInt(); //gets the next number input
		return selection;
	}	
}

