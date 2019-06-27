import java.util.Random;
import java.util.Scanner;
public class RockPaper {
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	private int user;
	private double x;
	
	public RockPaper(int user, double x) {
		this.user = user;
		this.x = x;
	}
	
	public RockPaper() {
		
	}
	public void welcomeUser() {
		System.out.println("Welcome to Jeff's Rock paper Scissors game!");
		System.out.println("First let me teach you the rules of this super fun game");
		System.out.println("1 = Rock, 2 = Paper, & 3 = Scissors");
		System.out.println("Please input a number between 1-3 to specify your choice:\t");
		user = input.nextInt();
	}
	
	public void displaySystemChoice() {
		System.out.println("Here is my choice : ");
		x = rand.nextInt(3);
		x += 1;
		System.out.println(x);
		
		//system choice is rock
		if
		(x==1 && user ==1)
		System.out.println("We're tied, Let's Play again!!!??!!");
		
		if
		(x==1 && user == 2)
		System.out.println("* * * *Bravo, well played. You have achieved a glorious victory!!!!!!!!* * *");
		
		if
		(x==1 && user == 3)
		System.out.println("Great job, but not great enough... I win!");
		
		
		//System chooses paper
		if
		(x==2 && user ==1)
		System.out.println("Great job, but not great enough... I win!");
		
		if
		(x==2 && user == 2)
		System.out.println("We're tied, Let's Play again!!!??!!");
		
		if
		(x==2 && user == 3)
		System.out.println("* * * Oh No not scissors! You are a true champion... I admit defeat!* * * ");
		
		//System chooses scissors
		if
		(x==3 && user == 1)
		System.out.println("* * * With your rock you have defeated me, excellent choice!* * * ");
		
		if
		(x==3 && user ==2)
		System.out.println("You've chosen paper, good choice. But not good enough, i am victourious yet again!");
		
		if
		(x==3 && user ==3)
		System.out.println("Tie! Let's give it another shot");
	}
		
	
	
		  	  
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 RockPaper choice = new RockPaper();
		 choice.welcomeUser();
		 choice.displaySystemChoice();
		
		 
		 

	}

}
