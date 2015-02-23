// We will import this library so we can use its random generator
import java.util.Random;

public class Deck {
	
	private Card[] cards;
	private static final int Size = 52;
	private int numberOfCardsLeft = Size ;
	private int sizeOfCardValues = CardValue.values().length;
	private int sizeOfCardSuit = CardSuit.values().length;
	
	// The constructor will create a deck of 52 cards of 13 different values and 4 suits each.
	public Deck() {
		
		cards = new Card[Size];
		for (int i=0; i<sizeOfCardSuit; i++)
		{
			for (int j=0; j<sizeOfCardValues; j++)
			{	
				// The (i*sizeOfCardValues + J) will create an index that will generate 13 after the first series
				// of loops (for the next bunch of cards) then it will create 26 and so on...till it reaches 51.
				cards[(i*sizeOfCardValues + j)] = new Card(CardValue.values()[j], CardSuit.values()[i]);	
			}
		}	
	}
	// The draw method will generate a random card to be picked out of the deck of cards,
	// then that card won't be drawn again for the entire game 
	public Card draw() {
		
		Random randomNumber = new Random();
		int randomNum;
		randomNum = randomNumber.nextInt(numberOfCardsLeft);
		Card temp;
		temp = cards[randomNum];
		cards [randomNum] = cards[numberOfCardsLeft - 1];
		cards[numberOfCardsLeft - 1] = temp;
		numberOfCardsLeft--;
		return cards[numberOfCardsLeft];		
	}
}
