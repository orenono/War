
public class Card {
	
	private CardValue cValue;
	private CardSuit cSuit;
	
	public Card(CardValue v, CardSuit s)
	{	
		cValue = v;
		cSuit = s;
	}
	
	public String toString() {
		return cValue.toString() + " of " + cSuit.toString();			
	}
	public CardValue getCValue()
	{
		return cValue;
	}
	public CardSuit getCSuit()
	{
		return cSuit;
	}
	

	public boolean winner(Card c) {
		// If player one's card is higher than player two's card. Player 1 wins the round
		if( cValue.compareTo(c.cValue) > 0)
			return true;
		// If both players' cards are of equal value, we'll choose a winner by whoever has the higher suit.
		else if( cValue.compareTo(c.cValue) == 0)
		{
			if(cSuit.compareTo(c.cSuit) > 0)
				return true;
			else if ( cSuit.compareTo(c.cSuit) < 0)
				return false;
			// As there are no instructions on who wins the round in-case both cards are exactly the same
			// I have decided player 1 will win the round in this specific scenario
			else
				return true;
		}
		// If player one's card is lower than player two's card. Player 2 wins the round
		else
			return false;			
	}
	
}
