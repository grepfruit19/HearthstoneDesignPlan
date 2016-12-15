//Handles mana count, including full, empty, overloaded mana crystals.

public class ManaPool implements TurnStartInterface{
  Player player;
  int thisTurnOverload=0;
  int nextTurnOverload=0;
  int emptyCrystals=0;
  int fullCrystals=0;

  public ManaPool(Player input){
    this.player=Player;
  }

  void onTurnStart(){
    this.thisTurnOverload=this.nextTurnOverload;
    this.nextTurnOverload=0;
    if (this.emptyCrystals<10){ this.emptyCrystals++; }
    //TODO: Simplified full crystals. Handle overload later.
    this.fullCrystals=this.emptyCrystals-this.thisTurnOverload;
  }
}
