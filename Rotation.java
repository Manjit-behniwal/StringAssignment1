/*
 Given a string s1 and a string s2, 
write a java method to say whether s2 is a rotation of s1 ?
Example : given s1 = abcd and s2 = cdab, return true,
given s1 = abcd, and s2 = acbd , return false
 */
package rotation;
public class Rotation
{
   
    static boolean areRotations(String str1, String str2)
    { 
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
     
    public static void main (String[] args)
    {
        String str1 = "ABCD";
        String str2 = "CDAB";
 
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
