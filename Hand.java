public class Hand{
  Player player;
  List<Card> hand;

  Hand(Player player){
    this.player = player;
  }

  addCard(Card card){
    if (hand.size()<10){
      hand.add(card);
    } else{
      burn(card);
    }
  }

  discardCard(int index){
    //Let the card handle the discard.
    hand.remove(index).discardCard();
  }

/**
Play a card from the hand.
Three implementations indicate the types of cards.
TODO: Implement friendly vs enemy targeting. 
*/
  playCard(int index){
    hand.get(index).playCard();
  }

  playCard(int index, Character target){
    hand.get(index).playCard(target);
  }

  playCard(int index, Minion target){
    hand.get(index).playCard(target);
  }

//If hand is full, a drawn card is burned.
  burn(Card card){
    //Let player handle this.
    this.player.removeFromPlay(card);
  }
}
