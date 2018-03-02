package blackjack;

/** TwentyOne.java - A program that allows the user to play the card game 21
 *  against the computer "dealer".
 *
 * Written 3/2006 by Wayne Pollock, Tampa Florida USA.
 */

import java.util.*;
import javax.swing.JOptionPane;

class BlackJack{
  
   private static final String title = "BlackJack";
   private static int STAND_PAT_POINT = 17;

   private static final Shoe shoe = new Shoe();

   public static void main ( String [] args ){
      int rc = 0;  // The return code from the showConfirmDialog

      do{  
        playGame();
         rc = JOptionPane.showConfirmDialog( null, "Play Again?",
            title, JOptionPane.YES_NO_OPTION );
      } while ( rc == JOptionPane.YES_OPTION );
   }

   private static void playGame (){
      int rc = 0;  // The return code from the showConfirmDialog
      Hand dealersHand = new Hand( shoe ),
           playersHand = new Hand( shoe );

      StringBuilder initMsg = new StringBuilder( "Dealer shows : " );
      initMsg.append( dealersHand.firstCard() );
      initMsg.append( "\n\nPlayer's Hand: " );

      while ( playersHand.value() < 21 )
      {
         StringBuilder msg = new StringBuilder( initMsg );
         msg.append( playersHand.toString() );
         msg.append( "\n\nDo you want another card?" );

         rc = JOptionPane.showConfirmDialog( null, msg, title,
            JOptionPane.YES_NO_CANCEL_OPTION );

         if ( rc != JOptionPane.YES_OPTION )
            break;
         playersHand.hit();
      }

      if ( rc == JOptionPane.CANCEL_OPTION )
         return;

      // Determine who won, and display appropriate message:
      String msg = null;

      if ( playersHand.value() > 21 )
      {
         msg = "Sorry, you lost!\n\n";
      } else
      {
         while ( dealersHand.value() < STAND_PAT_POINT )
            dealersHand.hit();
   
         if ( dealersHand.value() > 21 ||
              playersHand.value() > dealersHand.value() )
            msg = "Congratulations, you won!\n\n";
         else
            msg = "Sorry, you lost!\n\n";
      }

      msg += "Dealers Hand: " + dealersHand.toString() + "\n\n" +
             "Players Hand: " + playersHand.toString();

      JOptionPane.showMessageDialog( null, msg, title,
         JOptionPane.PLAIN_MESSAGE );
   }
}