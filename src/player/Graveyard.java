package player;

//This class contains any minion that has died by loss of health points.
//This differs from discard or milling a card, if you're looking for that
//find RemovedFromPlay

public class Graveyard{

  //This contains all of the minions that have died during a game.
  List<Minion> contents;
  Player player; //The player who owns this Graveyard.

  public Graveyard(Player input){
    this.player = input;
    this.contents = new ArrayList<Minion>();
  }
}
