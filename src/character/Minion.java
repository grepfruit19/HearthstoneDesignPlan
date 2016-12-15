package character;

//Minions are cards that can be played and persist on the board.

public Class Minion extends Card implements Character{

  int attack;
  int health;

  void die(){
    //Should being removed from the board be a Minion method or a
    //board method? Probably board.
  }

  int attack(Character target){

  }

  int getHit(int damage){
    this.health = this.health - damage;
    if (this.health<=0){ this.die(); }
  }

}
