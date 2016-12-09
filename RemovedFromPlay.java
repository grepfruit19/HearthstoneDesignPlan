//Some cards are removed from play, such as from Tracking,
//Or when a card is burned (milled).

public class RemovedFromPlay{
  List<Card> removed;

  public void removeFromPlay(Card card){
    removed.add(card);
  }
}
