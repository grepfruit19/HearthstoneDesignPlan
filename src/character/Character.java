package character;

public interface Character{

  //When health <= 0
  void die();

  default void attack(Character target){
    Executor executor = player.getExecutor();
    player.queueAction(new Attack(executor, this, target));
  }

  default getHit(int damage){
    this.health = this.health - damage;
    if (checkDead()){
      this.die();
    }
  }

  default boolean checkDead(){ if (this.health <= 0){ this.die(); } }

  Player getPlayer();
  int getHealth();
  int getAttack();

}
