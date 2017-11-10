package cardHand;

import cards.Card;

public class Hand {

  public Hand(Card... cards) {
    // TODO evtl. nicht referenzieren sondern kopieren?
    Card[] cardsInHand = cards;
  }

  public void add(Card... card) {}

  public void add(Hand hand) {}

  /**
   * @return Boolean if cards on hand have the same colour.
   */
  public boolean isSuited() {
    boolean isSuited;
    // Card[] cardsInHand = Hand.cardsInHand;

    // TODO Evtl später unnötig wenn funktion steht
    if (cardsInHand.length < 2) {
      isSuited = true;
    }
    return isSuited;
  }

  public Card[] getHandCards() {

    // TODO Platzhalter
    Card[] cards = new Card[1];
    return cards;
  }

  public void setHand(Card... cards) {}

}
