import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Character c = new Character();
		Map m = new Map();
	
		int x,y;
		
		System.out.println("Enter X Dimension : " );
		x = sc.nextInt();
		System.out.println("Enter Y Dimension: ");
		y = sc.nextInt();
		
		System.out.println("Size of the Map is "+ x + "*" + y);
		
		
		m.currentPosition();
		m.WinningPosition();
		
		m.HowFar();
		
		char dir;
		
		System.out.println("Lets see what good guy will do: ");
	
		boolean BeWinner = true;
		while(BeWinner)
		{
				System.out.println("Next Direction ");
				dir = sc.next().charAt(0);	
				m.nextStep(dir);
				m.HowFar();
		}
		
		System.out.println("Lets see what Bad guy will do: ");
		
		boolean BeFirstWinner = true;
		while(BeFirstWinner)
		{
				System.out.println("Next Direction ");
				dir = sc.next().charAt(0);	
				m.nextStep(dir);
				m.HowFar();
		}
	}

}
