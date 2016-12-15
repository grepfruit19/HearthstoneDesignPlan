package character;

public class AbstractCharacter implements Character{

  Player player; //The player that owns this character.
  int health;
  int attack;
  boolean attacked=false;

  AbstractCharacter(Player player){
    this.player = player;
  }

  abstract void die();

//Deal damage to something.
  int attack(Character target){
    if (target.player!=player){
      this.getHit(target.attack);
      target.getHit(this.attack);
    } else{
      System.out.println("Error: Cannot attack friendly characters");
    }
  }

//Take damage from something.
  int getHit(int damage){
    this.health = this.health - damage;
  }
}
