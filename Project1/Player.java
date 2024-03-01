//Myriam Diabagate | Project 1 | 10/5/23
//This class called Player contains 3 variables. It contains a constructor which creates a Player object that takes 3 arguments. It has 3 getter methods that correspond with the three variables. It also has an overriden version of toString which returns a string representation of a player.

package intermediateprogramming.Project1;

public class Player {
	//initialize 3 class variables
	String name;
	Height height;
	int age;
	
	//Create no arg constructor
	public Player() {
		
	}
	
	//Create arg constructor
	public Player(String name, Height height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
		
	}

	//create getters for each variable
	public String getName() {
		return name;
	}

	public Height getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}
	
	//overriding method toString to return a string description of the player object
	@Override
	public String toString() {
		return "players name: " + name + "\n Players Height: " + height.toString() + " \n Players age: " + age;
	}
	
	//use main to test functionality of player objects
	public static void main(String[] args) {
		Height height = new Height(4,30);
		Player player = new Player("john", height, 17);
		
		System.out.println(player.toString());

	}

}
