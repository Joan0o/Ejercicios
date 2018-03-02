package blackjack;

import java.util.ArrayList;

public class Hand{
  
   private final ArrayList<Card> cards = new ArrayList<>();
   private final Shoe shoe;
   
   public Hand ( Shoe shoe ){
     
      this.shoe = shoe;

      // Deal two cards to initialize the hand:
      cards.addAll(shoe.drawCards(2));
   }

   /** Calculates the value of the hand.  Picture cards are worth 10 and an
    *  Ace is worth 1 or 11.
    * @return 
    */
   public int value (){
      int total = 0;
      boolean hasAce = false;
      for ( Card card : cards )
      {
         int val = card.value();
         if  ( val == 1 )  hasAce = true;
         total += val;
      }
      
      while ( total < (21 - 10) && hasAce )
         total += 10;
      return total;
   }

   /** Add one card to the hand from the shoe.
    */
   public void hit () {  cards.addAll( shoe.drawCards(1) ); }

   /** During the play only the first card of the dealer's hand should be shown.
    */
   public Card firstCard() { return cards.get( 0 );  }

   public String toString (){
      StringBuilder sb = new StringBuilder();
      for ( Card card : cards )
      {
         sb.append( card );
         sb.append( "   " );
      }
      return sb.toString();
   }
}