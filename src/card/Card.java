package card;

/*
The abstract class Card encompasses all cards, including
minions and spells.
*/

public abstract class Card{
  public int manaCost;
  public String cardText;
  public HeroClass heroClass;

  //When card is played.
  abstract void play();

  abstract discardCard();
}
