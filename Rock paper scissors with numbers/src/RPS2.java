import java.util.Random; 
import java.util.Scanner;

public class RPS2
{

public static void main( String[] args)
{
	Scanner Scan = new Scanner(System.in);
	Random myRand = new Random();

int R = 1; //R = Rock
int P = 2; //P = Paper
int S = 3; //S = Scissors
int u; // User's Choice
int c; // Computer's Choice


System.out.println("Get ready to Play Rock, Paper, Scissors:\n");
System.out.println("Rock = 1, Paper = 2, and Scissors = 3");
System.out.println("Choose your weapon!");
System.out.println("1. Rock");
System.out.println("2. Paper");
System.out.println("3. Scissors");
u = Scan.nextInt();
c = myRand.nextInt(3);

System.out.println("c = " + c + " u = " + u);

if ( u==c )
{
System.out.println("Tie Game!");
System.out.println("Play Again.");
}
else if ( (u==R && c==S) || (u==S && c==P) || (u==P && c== R) )
{
System.out.println("You Win!");
System.out.println("Play Again.");
}
else if ((c==R && u==S) || (c==S && u==P) ||(c==P && u==R) )
{
System.out.println("You've Lost!");
System.out.println("Play Again.");
	}
else 
	System.out.println("Invalid input.");



}//end main method
}//end Program