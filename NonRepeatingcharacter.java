/*
 9. Given a string, find its first non-repeating character?
	Example : Given String : ravindra
					Output : v
 */
package non.repeatingcharacter;
import java.util.HashMap;
import java.util.Scanner;


public class NonRepeatingcharacter {

    
    public static void main(String[] args)
    {
        
        
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        char c=NonRepeatingcharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character NonRepeatingcharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable= 

                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
       
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }
} 


