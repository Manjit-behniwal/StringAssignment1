/*
 6. Write a java program to print all 
the duplicate characteres in the given string?
 */
package duplicate2;
import java.util.*;


public class Duplicate2 {

    
    public static void main(String[] args) {
        int count=0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String a =s.nextLine();
        char [] input = a.toCharArray();
        int length = a.length();
        for(int i = 0;i<length-1;i++){
            for(int j =i+1;j<length-1;j++)
            {
                if(input[i]==input[j])
                {
                    System.out.println(input[j]);
                    count++;
                   
                    break;
                    
                }
            }
        }
                       
        }
             
    }
    
