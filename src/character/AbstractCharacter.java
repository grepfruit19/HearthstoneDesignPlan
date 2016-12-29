package character;

public class AbstractCharacter implements Character{

  Player player; //The player that owns this character.
  int health;
  int attack;
  boolean attacked=false;

  AbstractCharacter(Player player){
    this.player = player;
  }

  public abstract void die();

//Deal damage to something.
  public void attack(Character target){
    
  }

//Take damage from something.
  public void getHit(int damage){
    this.health = this.health - damage;
  }
}
