public class Deck{
  Player player;
  List<Card> deck;

  public Deck(Player player, List<Card> deck){
    this.player = player;
    this.deck = deck;
    shuffleDeck(); //Deck will come in ordered. 
  }

  public void shuffleDeck(){
    //Implement shuffling algorithm here.
  }

  public Card drawCard(){

  }
}
