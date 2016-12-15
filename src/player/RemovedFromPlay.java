//Some cards are removed from play, such as from Tracking,
//Or when a card is burned (milled).

public class RemovedFromPlay{
  Player player;
  List<Card> removed;

  RemovedFromPlay(Player player){
    this.player = player;
    removed = new LinkedList<>();
  }

  public void removeFromPlay(Card card){
    removed.add(card);
  }
}
