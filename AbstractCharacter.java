public class AbstractCharacter implements Character{

  int health;
  int attack;
  boolean attacked=false;

  abstract void die();

//Deal damage to something.
  int attack(Character target){
    this.getHit(target.attack);
    target.getHit(this.attack);
  }

//Take damage from something.
  int getHit(int damage){
    this.health = this.health - damage;
  }
}
