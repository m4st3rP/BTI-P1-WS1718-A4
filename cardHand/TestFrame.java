package cardHand;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * TestFrame for A4x1 - see task
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2016/11/16
 */
public class TestFrame {
    
    /**
     * ...
     */
    public static void main( final String... unused ){
        /*
        System.out.printf( "TI1-P1 (WS17/18):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        printlnCards( CK );
        Hand hand = new Hand( CK );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( CK, C7, CT, C2, CQ, C5 );
        hand.add( C7, CT, C2, CQ, C5 );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( SQ );
        Card[] temp = { SQ };
        Hand hand2 = new Hand( temp );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand2.getHandCards() ),
            hand2.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( CK, C7, CT, C2, CQ, C5, SQ );
        hand.add( hand2 );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( DJ );
        hand.setHand( DJ );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( DJ, HQ, SK );
        hand.setHand( DJ, HQ, SK );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        printlnCards( CK, SQ, HJ );
        hand = new Hand();
        hand.setHand( CK, SQ, HJ );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( hand.getHandCards() ),
            hand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        */
    }//method()
    
    
    
    private static void printlnCards( final Card... cards ){
        System.out.println( Arrays.toString( cards ) );
    }//method()
    
}//class
