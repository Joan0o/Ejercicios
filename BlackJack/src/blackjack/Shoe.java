package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Shoe{
  
   private static final int NUM_DECKS = 4;
   private static final int RESHUFFLE_POINT = (int) (0.05 * (NUM_DECKS * 52) );

   private ArrayList<Card> deck;

   public Shoe (){  
     shuffleCards();
   }

   public ArrayList<Card> drawCards (int numCardsToDeal){
     
      ArrayList<Card> cards = new ArrayList<>( numCardsToDeal );

      for ( int i = 0; i < numCardsToDeal; ++i ){
         shuffleCards();
         cards.add( deck.remove(i) );
      }
      return cards;
   }

   private void shuffleCards (){
      deck = new ArrayList<>( NUM_DECKS * 52 );

      for ( int numDecks = 0; numDecks < NUM_DECKS; ++numDecks )
         for ( int suit = 1; suit <= 4; ++suit )
            for ( int rank = 1; rank <= 13; ++rank )
               deck.add( new Card( suit, rank ) );

      Collections.shuffle( deck );
   }
}
