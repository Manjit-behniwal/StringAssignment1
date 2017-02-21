/*
 5. Write a java program to remove characters from 
the first string which are present in the second string?

 */
package remove1;
import java.util.*;

public class Remove1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first string");
        String a =s.nextLine();
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter second string");
        String b =s1.nextLine();
        char[] ss = a.toCharArray();
        char[] ss1 = b.toCharArray();

        for(int i=0;i<ss1.length;i++){
          for(int j=0;j<ss.length;j++){
                if(ss[j] == ss1[i]){
                    ss[j] = 'x'; 
                }
            }
         }
        System.out.println(Arrays.toString(ss));
    }
}