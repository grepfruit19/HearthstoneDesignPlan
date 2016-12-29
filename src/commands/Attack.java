package commands;

//This class is an "attack" action

public class Attack implements Action{

  private Executor executor;
  private Character attacker;
  private Character defender;

  public Attack (Executor executor, Character attacker, Character defender){
    this.executor = executor;
    this.attacker = attacker;
    this.defender = defender;
  }

  public void execute(){
    executor.attack(attacker, defender);
  }

}
