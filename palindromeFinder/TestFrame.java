package palindromeFinder;

import java.util.Scanner;

/**
 * A4x3: Palindrom - see task
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2016/11/16
 */
public class TestFrame {
    
    /**
     * Diese Methode testet Ihre Loesung zu A3x4.
     * Diese Methode darf nicht geaendert werden.
     */
    public static void main( final String... unused ){
        System.out.printf( "TI1-P1 (WS17/18):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
                
        /*
        final String givenText = "Werner sagte: \"Es stellen sich neben dem Reliefpfeiler auf: Otto neben Otto und Ede neben Ede.\"";
        PalindromeFinder pf = new PalindromeFinder( givenText );
        System.out.printf( "Der folgende Text\n" );
        System.out.printf( "    %s\n",  givenText );
        System.out.printf( "    ____________________~~~~______~~~~~~~___~~~~~~~~~~~~~~~____^^^^^^^^^^^^^^^^^___~~~~~~~~~~~~~~_\n" );
        System.out.printf( "\n" );
        System.out.printf( "liefert:\n" );
        System.out.printf( "    %s\n",  pf.getText() );
        System.out.printf( "und\n" );
        System.out.printf( "    " );
        printTestResult( pf.getLongestPalindrome() );
        System.out.printf( "\n\n\n" );
        
        
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe einen Text ein\n" );
            System.out.printf( "und tippe danach die Return-Teste um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final String theText = workAroundForSeriousUserInterface.nextLine();
            pf.setText( theText );
            System.out.printf( "Der folgene Text\n" );
            if( null != theText ){
                System.out.printf( "    %s\n",  pf.getText() );
            }else{
                System.out.printf( "    null\n" );
            }//if
            System.out.printf( "liefert:\n" );
            printTestResult( pf.getLongestPalindrome() );
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
        */
    }//method()
    
    
    private static void printTestResult( final String testResult ){
        if( null != testResult ){
            System.out.printf( "\"%s\" -> length=%d\n",  testResult, testResult.length() );
        }else{
            System.out.printf( "null\n" );
        }//if
    }//method()
    
}//class
