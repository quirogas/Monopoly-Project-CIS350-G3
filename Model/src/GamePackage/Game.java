package GamePackage;

import BoardPackage.Board;
import CardPackage.Deck;

import java.util.ArrayList;

public class Game {
   private Bank bank;
   private ArrayList<Player> players;
   private Die dieOne;
   private Die dieTwo;
   private Board board;
   private Deck comunityChestDeck, chanceDeck;
   private int numPairs;

    public Game() {
        dieOne = new Die();
        dieTwo = new Die();
        board = new Board();
        comunityChestDeck = new Deck("community.txt");
        chanceDeck = new Deck("chance.txt");
        numPairs = 0;
        bank = new Bank(board.getProperties());
    }

    public void roll(){
        dieOne.roll();
        dieTwo.roll();
    }

    public void addPlayer(){
        //ask for player name and token
        //set wallet to initial 1500

        //addPlayer to player list
    }

    public void removePlayer(){
        //remove player from player list
    }

    public void nextTurn(){
        //move on to the next player and make sure no one has won.
    }

    public void buyProperty(){
        //get property from bank,
        // give property from bank
    }

    public void sellPorperty(){
        //allow the player to sell a property from their list
    }

    public void mortgageProperty(){
        //Display the list of properties the player has.
    }

    public void auctionProperty(){
        // check for highest bidder

        //give property to highest biddder
    }

    public void drawCard(){
        //draw a card from the specific chest

        //give card to player
    }

    public void useCard(){
        //display list of cards

    }

    public void collectFee(){
        //collect the given fee from player / bank

        //pay the collected fee to player/ bank

    }public void start(){
        // run the game logic until someone stops it
    }


}
