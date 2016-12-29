package gamestate;

//This class corresponds to a player and all the entities that
//they control.

public Class Player{
  private Game game;

  private Hand hand;
  private Deck deck;
  private Board board;
  private RemovedFromPlay removedFromPlay;

  private Hero hero;
  private HeroClass heroClass;
  private HeroPower heroPower;
  private ManaPool manaPool;

  //Command pattern members
  private ActionQueue actionQueue;
  private Executor executor;

  Player(Game game, GameStart input){
    this.game = game;
    this.deck = input.deck;
    this.heroClass = input.heroClass;
    this.Hero = new Hero(this);
    this.removedFromPlay = new RemovedFromPlay(this);
    this.manaPool = new ManaPool(this);
  }

//TODO: handle game loss
  public void endGame(){
    game.playerLost(this);
  }

  public void drawCard(){
    Card drawn = this.deck.drawCard();
    this.hand.addCard(drawn);
  }

  public void addCoin(){
    this.hand.addCard(new Coin());
  }

//Return a card to the deck.
  public void reshuffle(Card card){
    //Let Deck handle it.
    this.deck.reshuffle(card);
  }

  public void showMulligan(boolean playerOne){
    if (playerOne){
      //Draw 3 cards
      //Have player select what cards to keep
      //Return the rest
    } else{
      /*Draw 4 cards, have the player select what cards to keep
      Return the rest.
      */
    }
  }

  public void removeFromPlay(Card card){
    this.removedFromPlay.addCard(card);
  }

  public void queueAction(Action action){
    this.actionQueue.nextAction(action);
  }

  //=====Get methods ===========
  public Executor getExecutor(){ return this.executor; }

  //=====End Get methods========

}
