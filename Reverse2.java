/*
 8. Write a java program to reverse a words in a given string?
Example : i love raudra and ravindra
		  ravindra and raudra love i
 */
package reverse2;

import java.util.*;

class Reverse2{
    public static void main(String args[]){
    String str[] = "i love raudra and ravindra".split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}
