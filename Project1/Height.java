//Myriam Diabagate | Project 1 | 10/5/23
//This class called Height contains a constructor which creates a Height object. It also contains two methods the first "toInches" takes in a height in feet and inches and returns it in inches only. The second "toString" overrides the toString method and returns a string representation of the height in feet and inches.

package intermediateprogramming.Project1;

public class Height {
	//initializing feet and inches
	int feet;
	int inches;
	
	//create no arg constructor
	public Height() {
		
	}
	
	//create arg constructor
	public Height(int feet, int inches) {	
		this.feet = feet;
		this.inches = inches;		
	}
	
	//create method toInches which returns the height in a number value of inches
	public Integer toInches() {
		
		int heightInInches = feet * 12 + inches;
		return heightInInches;
	}
	
	//override to string to return a string representation of the height
	@Override
	public String toString() {
		int heightInInches = feet * 12 + inches;
		feet = heightInInches / 12;
		inches = heightInInches % 12;
		return feet + "'" + " , " + inches + "''";
	}

	//use main to test an instance of Height 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Height height = new Height(4, 20);
		
		System.out.println(height.toString());

	}

}
