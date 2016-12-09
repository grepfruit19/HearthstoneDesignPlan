
public class Hero extends AbstractCharacter implements Character{
  Player player;
  Weapon weapon;
  boolean attacked=false;

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
  }

  void equipWeapon(Weapon weapon){
    this.weapon = weapon
  }

  void unequipWeapon(){
    this.weapon=null;
  }

}
