//Myriam Diabagate | Project 1 | 10/5/23
//This class called Project1 prompts a user to run the program. It then uses a while loop to prompt the user to add more basketball players until they enter 0. The class uses instances of Height and Player to create a Player object for each basketball player and then stores each of those player objects in an Array list called myArrayList. After that the program traverses the array using a for loop to locate the basketball player whose age is below or equal to the average height of all the players but is also the tallest amongst that group. 

package intermediateprogramming.Project1;
import java.util.Scanner;
import java.util.ArrayList; 

public class Project1 {

	public static void main(String[] args) {
		
		//create an arrayList to store players
		ArrayList <Player> myArrayList = new ArrayList<Player>();
		
		// initialize scanner
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		
		//introduce the tasks for the program, prompt user for a number to start the loop
		System.out.println("Let's add some players to this team! This will require you to add a name, A height in feet and inches, and an age for each player");
	    System.out.println("Enter any number to start program | Enter 0 to exit or if finished adding players");
	    
	    
	    int sentinel = 0;
	    int userInput;
	    int total = 0;
	    int average;
	    
	    //Using a while loop with sentinel value to continue prompting user until they have no more players
	    while (true) {
	    	//collect the user's number input
	    	userInput = scanner.nextInt();
	    	
	    	// is the user has entered the sentinel value to end the loop
	    	if (userInput == sentinel) {
	    		//calculate average age
	    		average = total / myArrayList.size();
	    		
	    		//initialize variable that will track the highest age
	    		int tallestHeight = Integer.MIN_VALUE;
	    		
	    		//initialize the variable that will hold the player who meets all requirements
	    		Player idealPlayer = null;
	    		
	    		//tell user the program is done running and print out their results
	    		System.out.println("You have exited the program.");
	    		
	    		//Print out the average age for all the players
	    		System.out.println("The average age for all players is: " + average);
	    		
	    		//use for loop to traverse arrayList
	    		for (Player player: myArrayList) {
	    			
	    			//use getter method to extract the age value from each player object
	    			int age = player.getAge();
	    			
	    			
	    			//if the age is less than or equal to the average 
	    			if (player.getAge() <= average){
	    				//nested if for second condition that they must have the highest age amongst those who met the first condition
	    				if (player.height.toInches() > tallestHeight)
	    				
	    				//set values for the highest age and the player object that currently meets the conditions
	    				tallestHeight = player.height.toInches();
	    				idealPlayer = player;    				
	    			}		
	    		}
	    		
	    		//loop has reached the end of the loop. Print final results
	    		System.out.println("This player is the tallest player who's age is below or equal to the average age of all your players: ");
	    		System.out.println(idealPlayer);
	    		break;
	    	}
	    	
	    	
	    	
	    	//In order to make the program more coherent for the user, I will promy for name first
	    	System.out.println("What is this player's name");
	    	String name = scanner.next();
	    	
	    	//Creating an instance of my first class: Height
	    	//Next I prep the user to enter the correct information then i collect the data with scanner
	    	System.out.println("What is player " + name + "'s height. Fist enter Feet and then inches. \n Example for a player who is five foot 7:\n Feet: 5 \n Inches: 7" );

	    	//prompt for feet
	    	System.out.println("Feet: ");
	    	int feet = scanner.nextInt();
	    	
	    	//prompt for inches
	       	System.out.println("Inches: ");
	    	int inches = scanner.nextInt();
	    	
	    	//now I create an instance of my Height class using data collected from user
	    	Height height = new Height(feet, inches);
	    	
	    	
	    	
	    	
	    	
	    	
	    	//Creating an instance of Player
	    	//finish collecting data by prompting for age
	    	System.out.println("What is player " + name + "'s age?");
	    	int age = scanner.nextInt();
	    	
	    	//create Player object
	    	Player player = new Player(name, height, age);
	    	
	    	
	    	//Add player to arrayList
	    	myArrayList.add(player);
	    	
	    	//Add age to a total
	    	total += age;
	    	
	    //Prompt user for continuation or end of program
	    	System.out.println("Enter a number or 0 if finished adding players to exit the program");
	    }
	    //close out the scanner
	    scanner.close();


	}

}
