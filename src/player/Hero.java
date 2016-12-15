package player;

//This class handles the Hero character slot. Note that this does
//not include the
public class Hero extends AbstractCharacter implements Character,TurnStartInterface{
  Player player;
  Weapon weapon=null;
  int attackCount=0;

  Hero(Player player){
    this.player = player;
  }

  void die(){
    player.endGame();
  }

@Override
  int attack(Character target){
    if (this.weapon!=null){
      weapon.decrementDurability();
    }
    //TODO: I don't like the idea of using a boolean for windfury check.
    if (this.windFury==false){}
  }

  void equipWeapon(Weapon weapon){
    this.weapon = weapon
  }

  void unequipWeapon(){
    this.weapon=null;
  }

//Handles what needs to be done on a new turn.
  void onTurnStart(){

  }

}
