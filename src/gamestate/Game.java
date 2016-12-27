package gamestate;

public class Game{
  Player one;
  Player two;
  int currentTurn=0;

  //TODO: Create a Timer class?

  Game(Client one, Client two){
    this.one = new Player(this);
    this.two = new Player(this);
  }

  public void startGame(){
    //True = playerOne, false = playerTwo.
    this.one.showMulligan(true);
    this.two.showMulligan(false);
    this.two.addCoin();
    startTurn(1);
  }

  public void startTurn(int playerTurn){
    this.currentTurn = playerTurn;
    if (this.currentTurn=1){
      //Let Player handle this.
      one.startTurn();
    } else{ two.startTurn(); }
    //TODO: Maybe I should worry about stack size. Long games could have really
    //large stacks.
  }

//TODO: Figure out win/lose handling.
  public void playerLost(Player lost){
    if (this.one==lost){
      if (this.two.getHealth()<=0){ //draw
        //handle loss for both players.
      } else{
        //handle loss for player one.
      }
    } else { //Player two sent loss signal.
      if (this.one.getHealth()<=0){ //draw
        //handle loss for both players.
      } else {
        //handle loss for player two.
      }
    }
  }
}
