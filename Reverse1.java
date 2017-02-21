/*
 program to reverse q string*/
package reverse1;

import java.util.*;
public class Reverse1 {

    public static void main(String[] args) {
        String reverse =" ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String input = in.nextLine();
        int length = input.length();
        for(int i=length-1;i>=0;i--){
         reverse = reverse +input.charAt(i);
        }
        System.out.println("Reverse string is  ");
        System.out.println(reverse);
    }
    
}
