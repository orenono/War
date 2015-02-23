
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {
		// We will create a new deck for each player; In this game there are only two players
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		Card player1CurrentCard;
		Card player2CurrentCard;
		
		int player1Score = 0, player2Score = 0;
		
		for(int i=0; i<HANDS; i++)
		{
			player1CurrentCard = player1.draw();
			player2CurrentCard = player2.draw();
			// This will print the number of rounds, the cards that were drawn, and the winner of this round.
			System.out.println("Round " +  (i+1) + ":");
			System.out.println("Player 1 has " + player1CurrentCard.toString());
			System.out.println("Player 2 has " + player2CurrentCard.toString());
			
			// If player 1 has won this round, a score of 1 will be added to his total of wins counter
			if (player1CurrentCard.winner(player2CurrentCard))
			{
				player1Score++;
				System.out.println("Player 1 has won this round!");
			}
			// If player 2 has won this round, a score of 1 will be added to his total of wins counter
			else
			{
				player2Score++;
				System.out.println("Player 2 has won this round!");
			}
			
		}
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		if (player1Score == player2Score)
		{
			System.out.println(": OH MY, WE HAVE A TIE!!!");
		}
		else if (player1Score > player2Score)
		{
			System.out.println(": PLAYER ONE HAS WON THE GAME!!! Good job player one!");
		}
		else
		{
			System.out.println(": PLAYER TWO HAS WON THE GAME!!! Good job player two!");
		}
		System.out.println("Wow... now THAT was an intense game!");
	}
}
