package war;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {

    @Test
    void battleGreaterThan() {
        Card p1Card = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(1, result);
    }

    @Test
    void battleLessThan() {
        Card p1Card = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(-1, result);
    }

    @Test
    void battleEqual() {
        Card p1Card = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(0, result);
    }

    @Test
    void warCompareLessThan() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(0);
        Card selectionPlayer2 = p2Cards.get(2);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(-1, result);
    }

    @Test
    void warCompareGreaterThan() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(2);
        Card selectionPlayer2 = p2Cards.get(0);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(1, result);
    }

    @Test
    void warCompareEqualTo() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(1);
        Card selectionPlayer2 = p2Cards.get(1);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(0, result);
    }

    @Test
    void warSelectGood() {
        ArrayList<Card> pCards = new ArrayList<Card>();
        Card pCard1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        pCards.add(pCard1);
        Card pCard2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        pCards.add(pCard2);
        Card pCard3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        pCards.add(pCard3);

        int selectedCard = 1;
        Card flippedCard;
        flippedCard = switch(selectedCard)
                {
                    case 1 -> pCards.get(0);
                    case 2 -> pCards.get(1);
                    case 3 -> pCards.get(2);
                    default -> pCards.get(3);
                };

        Card result = pCards.get(1);
        assertEquals(new Card(Card.Rank.SIX, Card.Suit.CLUBS), result);
    }

    @Test
    void warSelectBad() {
        ArrayList<Card> pCards = new ArrayList<Card>();
        Card pCard1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        pCards.add(pCard1);
        Card pCard2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        pCards.add(pCard2);
        Card pCard3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        pCards.add(pCard3);

        int selectedCard = 1;
        Card flippedCard;
        flippedCard = switch(selectedCard)
                {
                    case 1 -> pCards.get(0);
                    case 2 -> pCards.get(1);
                    case 3 -> pCards.get(2);
                    default -> pCards.get(3);
                };

        Card result = new Card();
        assertEquals(new Card(Card.Rank.TWO, Card.Suit.HEARTS), result);
    }
}