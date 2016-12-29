package commands;

//Invoker class for commands.
//Each player has their own action queue. 
public class ActionQueue{
  //Could use a List for history, but let's use queue for now.
  private actionQueue<Action> = new Queue();

  //Simple implementation for now.
  void nextAction(Action action){
    actionQueue.add(action);
    if (actionQueue.peek()!=null){
      actionQueue.poll().execute();
    }
  }
}
