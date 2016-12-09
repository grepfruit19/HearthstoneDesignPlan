
public Class Player{
  public Game game;
  public Hand hand;
  public Deck deck;
  public Board board;
  public Hero hero;
  public HeroClass heroClass;
  public ManaPool manaPool;

  Player(Game game, GameStart input){
    this.game = game;
    this.deck = input.deck;
    this.heroClass = input.heroClass;
    this.Hero = new Hero(this);
  }

//TODO: handle game loss
  public void endGame(){
    game.playerLost();
  }
}
