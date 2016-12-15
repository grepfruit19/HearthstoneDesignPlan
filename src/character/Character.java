package character;

public interface Character{

  //When health <= 0
  void die();

  int attack(Character target);

  int getHit(int damage);

  //I feel like there is a design pattern to handle attack and getHit
  //Perhaps the Command pattern.

}
