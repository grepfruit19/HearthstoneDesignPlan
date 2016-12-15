package player;

public class Hand{
  Player player; //Player who owns this.
  List<Card> hand;

  Hand(Player player){
    this.player = player;
  }

//Adds a card to the hand, if not, burn the card.
  addCard(Card card){
    if (hand.size()<10){
      hand.add(card);
    } else{
      burn(card);
    }
  }

//Discards a card without playing it.
  discardCard(int index){
    //Handled by Player.
    this.player.removeFromPlay(card);
  }

//Index corresponds to the card position in the hand.
//This one is a card that does not require a target.
  playCard(int index){ hand.get(index).playCard(); }
//This one is for cards that target a Character.
  playCard(int index, Character target){ hand.get(index).playCard(target); }
//This one is for cards that target minions, but not characters.
  playCard(int index, Minion target){ hand.get(index).playCard(target); }

//If hand is full, a drawn card is burned.
  burn(Card card){
    //Let player handle this.
    this.player.removeFromPlay(card);
  }
}
