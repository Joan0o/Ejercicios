/**
 *
 * @author Administrador
 */
package blackjack;


/** Represents one card from a standard "bridge" pack of (52) cards.
 */
public class Card{
  
   final int suit;  // A Java 5 "enum" would be a good choice instead of int!
   final int rank;

   Card ( int suit, int rank ){

      this.suit = suit;
      this.rank = rank;
   }

   /** Calculates the value of the card.
    *  @return the rank of the card, with Ace = 1, picture cards = 10.
    */   
   public int value (){
      int val = rank;
      if ( rank > 10 )
         val = 10;
      return val;
   }

   /** Uses ASCII to show the rank (A,2,3,4,5,6,7,8,9,10,J,Q,K) and suit.
    *  Note that if using console output it would be better to use letters
    *  for the suits (C, D, H, and S) rather than symbols, as they wouldn't
    *  show up properly on all platforms.
    */
   public String toString(){
      StringBuilder sb = new StringBuilder( 2 );
      switch ( rank )
      {
         case  1: sb.append( 'A' );  break;
         case 11: sb.append( 'J' );  break;
         case 12: sb.append( 'Q' );  break;
         case 13: sb.append( 'K' );  break;
         default: sb.append( rank ); break;
      }

      switch ( suit )
      {
         case 1: sb.append( '\u2663' );  break;  // Club
         case 2: sb.append( '\u2666' );  break;  // Diamond
         case 3: sb.append( '\u2665' );  break;  // Heart
         case 4: sb.append( '\u2660' );  break;  // Spade
      }
      return sb.toString();
   }
}
