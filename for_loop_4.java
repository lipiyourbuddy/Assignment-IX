/**
4. A string is said to be 'Unique'. If none of the alphabets present in the string are repeated. Write a program to
accept a string and check whether the string is Unique or not.
Sample Input : COMPUTER
Sample Output : COMPUTER is a Unique String.
*/

import java.util.*;
public class for_loop_4

{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter a String: ");
    String s=in.nextLine();
    s=s.toUpperCase();
    s=s.trim();
    int len=s.length();
    for(int i=0;i<len;i++)
    {
      char c=s.charAt(i);
      for(int j=i+1;j<len;j++)
      {
        char c2=s.charAt(j);
        if(c==c2)
         {
           System.out.println(s+" is not a Unique String.");
           System.exit(0);
        }
     }
   }
   System.out.println(s+" is a Unique String.");
  }
}

/** Descripton Table: 
 
 *      VARIABLE                             DATA TYPE                             DESCRIPTION
 *         s                                  String                               - to accept the string or word from user.
 *        len                                   int                                - to store length pg the word.
 *       i, j                                   int                                - control variables.
 *         c                                    char                               - to store the extracted character from word.
 *        c2                                    char                               - to extract other characters from word and compare.
 */