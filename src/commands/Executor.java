package commands;

//Receiver in command pattern.

public class Executor{

  //Add methods to handle individual actions.

  public void attack(Character attacker, Character defender){
    attacker.getHit(defender.getAttack());
    defender.getHit(attacker.getAttack());
  }

}
