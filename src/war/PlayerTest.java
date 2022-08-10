package war;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    void playCardGood() {
        //Player player = new Player();
        //Hand hand = new Hand();
        CardPlayArea playArea = new CardPlayArea();

        Card card1 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        Card card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        playArea.addCardToTop(card1);
        playArea.addCardToTop(card2);

        Card result = card2;
        assertEquals(new Card(Card.Rank.SEVEN, Card.Suit.CLUBS), result);

    }

    @Test
    void playWarCardsBad() {
        CardPlayArea playArea = new CardPlayArea();

        Card card1 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        Card card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        playArea.addCardToTop(card1);
        playArea.addCardToTop(card2);

        Card result = card1;
        assertEquals(new Card(Card.Rank.SIX, Card.Suit.CLUBS), result);
    }


}