package character;

//Minions are cards that can be played and persist on the board.

public abstract class Minion extends Card implements Character{
  Player player;
  int attack;
  int health;

  void die(){
    //Should being removed from the board be a Minion method or a
    //board method? Probably board.
  }

  int attack(Character target){
    
  }

  abstract int getHit(int damage){

  }

}
