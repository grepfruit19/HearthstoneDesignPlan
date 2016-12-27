package commands;

//Invoker class for commands.
//Lets call them actions because why not.
public class ActionQueue{
  private actionQueue<Action> = new Queue();

  void enqueueAction(Action action){
    actionQueue.add(action);
  }
}
