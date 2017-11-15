package cardHand;

import cards.Card;

/**
 * A class that creates a hand object that can hold cards.
 * 
 * @author Philipp Schwarz
 *
 */
public class Hand {
  private Card[] cardsInHand;

  /**
   * Constructor of a hand object.
   * 
   * @param cards The cards with whom the hand object will be initialized.
   */
  public Hand(Card... cards) {
    cardsInHand = cards;
  }

  /**
   * Adds cards to the current hand.
   * 
   * @param card The cards that will be added to the current hand.
   */
  public void add(Card... card) {
    int newArrayLength = this.cardsInHand.length + card.length;

    // Create new temporary hand
    Card[] newCardsInHand = new Card[newArrayLength];
    // Add every card from old hand into new hand
    for (int i = 0; i < this.cardsInHand.length; i++) {
      newCardsInHand[i] = this.cardsInHand[i];
    }
    // Add every card from new cards to temporary hand
    for (int j = this.cardsInHand.length; j < newCardsInHand.length; j++) {
      newCardsInHand[j] = card[j - this.cardsInHand.length];
    }
    this.cardsInHand = newCardsInHand;
  }

  /**
   * Adds another hand to the current hand.
   * 
   * @param hand The cards of another hand object that will be added.
   */
  public void add(Hand hand) {
    int newArrayLength = this.cardsInHand.length + hand.cardsInHand.length;

    // Create new temporary hand
    Card[] newCardsInHand = new Card[newArrayLength];
    // Add every card from old hand into new hand
    for (int i = 0; i < this.cardsInHand.length; i++) {
      newCardsInHand[i] = this.cardsInHand[i];
    }
    // Add every card from handed over hand (pun intended) to temporary hand
    for (int j = this.cardsInHand.length; j < newCardsInHand.length; j++) {
      newCardsInHand[j] = hand.cardsInHand[j - this.cardsInHand.length];
    }
    this.cardsInHand = newCardsInHand;
  }

  /**
   * @return Boolean if cards on hand have the same colour.
   */
  public boolean isSuited() {
    boolean isSuited = true;

    // Compare each card with the following ones.
    for (int i = 0; i < cardsInHand.length - 1; i++) {
      for (int j = i + 1; j < cardsInHand.length; j++) {
        if (cardsInHand[i].getSuit() != cardsInHand[j].getSuit()) {
          isSuited = false;
        }
      }
    }
    return isSuited;
  }

  /**
   * 
   * @return Current hand.
   */
  public Card[] getHandCards() {
    return this.cardsInHand;
  }

  /**
   * Replaces the hand with the cards in the parameter.
   * 
   * @param cards The cards that will replace the current hand.
   */
  public void setHand(Card... cards) {
    this.cardsInHand = cards;
  }

}
