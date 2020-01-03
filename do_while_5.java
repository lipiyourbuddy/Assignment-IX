/**
5. Write a program to accept a string and convert it into lowercase, if it is in uppercase. Display the new word
by replacing only the vowels with the character following it.
Sample Input :Computer Applications
Sample Output:cpmpvtfr bppljcbtjpns
*/

import java.util.*;
public class do_while_5
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter a String: ");
    String s=in.nextLine();
    s=s.toLowerCase();
    int len=s.length();
    int i=0;
    do
    {
      char c=s.charAt(i);
      if(c=='a')
       s=s.replace(c,'b');
      else if(c=='e')
       s=s.replace(c,'f');
      else if(c=='i')
       s=s.replace(c,'j');
       else if(c=='o')
       s=s.replace(c,'p');
       else if(c=='u')
       s=s.replace(c,'v');
       
       i++;
    }
    while(i<len);
    
    System.out.println(s);
}
}

/**
 Description Table: 
 
   VARIABLE                       DATA TYPE                        DESCRIPTION
      s                            String                          - to store the entered sentence or word.
     len                             int                           - to store the length of the word or sentence.
      c                             char                           - to extract each character.
 */