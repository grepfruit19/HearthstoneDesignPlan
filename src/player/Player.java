package gamestate;

//This class corresponds to a player and all the entities that
//they control.

//TODO: Set up command pattern to handle queued actions.
/*
Maybe Player creates command objects and sends them to the command queue
Command queue handles them one at a time.
*/

public Class Player{
  public Game game;
  public Hand hand;
  public Deck deck;
  public Board board;
  public Hero hero;
  public HeroClass heroClass;
  public HeroPower heroPower;
  public ManaPool manaPool;
  public RemovedFromPlay removedFromPlay;

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
}
