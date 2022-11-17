import java.util.Scanner;
class GameIntro{
	String intro;
	
	String intro() {
		System.out.println("      Welcome to the Guesser Game!      ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Description of Game : ");
		System.out.println();
		System.out.println("Guesser guesses the one number and all the players guess the" );
		System.out.println("guesser guessed number if the players guessed correct number");
		System.out.println("then he won the game! ");
		System.out.println("------------------------------------------------------");
		return intro;
	}
}
class User{
     String user;
	 
     String user() {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Player please enter your Name: ");	 
         user = sc.nextLine();
         System.out.println("------------------------------------------------------");
         for(int i=0; i<3; i++) {
        	 if(user.toString() != user.toLowerCase()) {
        		 System.out.println("Please enter the name in lower case: ");
        		 user=sc.nextLine();
        		 System.out.println("---------------------------------------------------");
        	 }
         }
         return user;
     }
}
class EnteringToGame{
	int num;
	
	int num() {
		System.out.println("Enter 0 to start the game :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<1; i--) {
			if(num!=0) {
				System.out.println("Please Enter the correct number to start the game :");
				num = sc.nextInt();
				System.out.println("---------------------------------------------------------");
			}
		}
		System.out.println("Game was started ");
		System.out.println("-----------------------------------------------------------------------");
		return num;
	}
	
}

class Guesser{
	int guessNum;
	
	int guessNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the one number between 1 to 100 :");
		guessNum = sc.nextInt();
		for(int i=0; i<1; i--) {
			if(guessNum<1 || guessNum>100) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Please guess the number between 1 to 100 :");
				guessNum = sc.nextInt();
			}
		}
		return guessNum;
	}
}

class Player1{
	int playerNum;
	
	int playerNum() {
		System.out.println("-------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 guess the number: ");
		playerNum = sc.nextInt();
		return playerNum;
	}
}
class Player2{
	int playerNum;
	
	int playerNum() {
		System.out.println("-------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2 guess the number: ");
		playerNum = sc.nextInt();
		return playerNum;
	}
}
class Player3{
	int playerNum;
	
	int playerNum() {
		System.out.println("-------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Player3 guess the number: ");
		playerNum = sc.nextInt();
		return playerNum;
	}
}

class Umpire{
	String strFromGameIntro;
	String strFromUser;
	int numFromEnteringToGame;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectStrFromGameIntro() {
		GameIntro n = new GameIntro();
		strFromGameIntro = n.intro();
	}
	
	void collectStrFromUser() {
		User u = new User();
		strFromUser = u.user();
	}	
	
	void collectNumFromEnteringToGame() {
		EnteringToGame e = new EnteringToGame();
		numFromEnteringToGame = e.num();
	}
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers() {
		Player1 p1 = new Player1();
		numFromPlayer1 = p1.playerNum();
		
		Player2 p2 = new Player2();
		numFromPlayer2 = p2.playerNum();
		
		Player3 p3 = new Player3();
		numFromPlayer3 = p3.playerNum();
	}
	
	void compare() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 & numFromGuesser == numFromPlayer3) {
				System.out.println("--------------------------------------------------------");
				System.out.println("All players won the game! ");
			}
			else if (numFromGuesser == numFromPlayer2) {
				System.out.println("--------------------------------------------------------");
				System.out.println("Player1 & Player2 won the game! ");
			}
			else if (numFromGuesser == numFromPlayer3) {
				System.out.println("--------------------------------------------------------");
				System.out.println("Player1 and Player3 won the game! ");
			}
			else {
				System.out.println("---------------------------------------------------------");
				System.out.println("Player1 won the game! ");
			}
		}
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("---------------------------------------------------------");
				System.out.println("Player2 and Player3 won the game! ");
			}
			else {
				System.out.println("----------------------------------------------------------");
				System.out.println("Player2 won the game! ");
			}
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Player3 won the game! ");
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Players lost the game try again! ");
		}
	}
	
	
	
}
public class Guesser_Game {

	public static void main(String[] args) {
		 Umpire up = new Umpire();
   	     up.collectStrFromGameIntro();
   	     up.collectStrFromUser();
   	     up.collectNumFromEnteringToGame();
   	     up.collectNumFromGuesser();
   	     up.collectNumFromPlayers();
   	     up.compare();

	}

}
