/*
 * Zen Himes
 * Date: 1/14/22
 * Program Name Module1Assignment
 * Purpose: Simulation of drone movement in x,y,z location
 */
public class Drone {
	private int x = 0;//Initial location
	private int y = 0;
	private int z = 0;
	private int orientation= 1;//orientation number (1=N 2=E 3=S 4=W)
	private String name; //name of the specific drone
	public Drone() { //if a drone is created without any parameters, it will use the initial location 
		this.name= "default";
	} 
	public Drone(String droneName) { //if the drone is created with a name, it will use that name when displaying coordinates
		this.name = droneName;
	}
	public Drone(String droneName, int initX, int initY, int initZ) { 
		//if the drone is created with a name and coordinates, it will use those coordinates and name 
		//except if the y coordinate is negative, then it will start at 0
		this.name = droneName;
		this.x= initX;
		if(initY>=0) {
			this.y=initY;
		}
		this.z= initZ;
	}
	public Drone(int initX, int initY, int initZ) { 
		//if the drone is created with coordinates, it will use those coordinates 
		//except if the y coordinate is negative, then it will start at 0
		this.x= initX;
		if(initY>=0) {
			this.y=initY;
		}
		this.z= initZ;
	}
	
	public void moveUp() { //moving up means increasing the y position
		this.y++;
	}
	public void moveDown() { //moving down means decreasing the y position except if its at 0, because on an assumed flat land, it cannot go underground
		if(this.y==0) {
			
		}
		else {
			this.y--;
		}
	}
	public void moveForward() { //depending on the orientation, x or z increases or decreases. north correlates to positive x and east correlates to positive z. Vice versa for south and west
		switch(this.orientation) {
		case 1: this.x++; break;
		case 2: this.z++; break;
		case 3: this.x--; break;
		case 4: this.z--; break;
		default: System.out.println("error"); break;
		}
	}
	public void moveBackward() { //going backwards flips the signs of the correlations from moveForward() North becomes negative x and East becomes negative z
		switch(this.orientation) {
		case 1: this.x--; break;
		case 2: this.z--; break;
		case 3: this.x++; break;
		case 4: this.z++; break;
		default: System.out.println("error"); break;
		}
	}
	public void turnRight() { //an addition to the orientation number equals a clockwise or right turn around the compass. If its west(4) it loops back to north(1)
		if (this.orientation==4) {
			orientation=1;
		}
		else {
			orientation++;
		}
	}
	public void turnLeft() { //a subtraction to the orientation equals a counterclockwise or left turn around the compass. If its north(1) turns left it faces west(4)
		if (this.orientation==1) {
			this.orientation=4;
		}
		else {
			this.orientation--;
		}
	}
	
	public void dispCoor() //displays coordinates
	{
		System.out.println(this.name+" [x_pos="+ x +", y_pos=" + y + ", z_pos="+ z+ ", orientation="+ orientationToName(orientation)+"]");
	}
	
	public String orientationToName(int oriNum) {//translate orientation numbers into cardinal directions
		switch(oriNum) {
		case 1: return "North";
		case 2: return "East";
		case 3: return "South";
		case 4: return "West";
		default: return "invalid orientation number";
		}
	}
}
