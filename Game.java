public class Game{
  Player one;
  Player two;

  Game(Client one, Client two){
    this.one = new Player(this);
    this.two = new Player(this);
  }

//TODO: Figure out win/lose handling.
  public void playerLost(){

  }
}
