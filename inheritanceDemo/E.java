package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class E extends D {
    
    public void om(){                                                           // om ::= Object (specific) Method
        System.out.println( "Objekt-(spezifische) Methode von E" );
    }//method()
    
    @Override
    public String toString(){
        return( "Ich bin ein E" );
    }//method()
    
}//class