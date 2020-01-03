/** switchcase question 4:
Write a program to print a triangle or an inverted triangle based upon the users choice.
SAMPLE INPUT AND OUTPUT
Enter your choice 1 for TRIANGLE and 2 for INVERTED TRIANGLE : 1
Enter a String : bluej
B
L L
U U U
E E E E
J J J J J
Enter your choice 1 for TRIANGLE and 2 for INVERTED TRIANGLE : 2
Enter a String : bluej
B L U E J
B L U E
B L U
B L
B
*/

import java.util.*;
public class switch_case_4
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    
    System.out.println("Enter your choice 1 for TRIANGLE and 2 for INVERTED TRIANGLE : ");
    int ch=in.nextInt();
    
    System.out.println("Enter a String : ");
    String s=in.next();
    
    s=s.toUpperCase();
    s=s.trim();
    int len=s.length();
    
    switch (ch)
    {
      case 1: 
      
      for(int i=0;i<len;i++)
      {
        for(int j=0;j<=i;j++)
        {
          char c=s.charAt(i);
          System.out.print(c+" ");
        }
        System.out.println();
        }
      break;
      
      case 2: 
      
      for(int i=len-1;i>=0;i--)
      {
        for(int j=0;j<=i;j++)
        {
          char c=s.charAt(j);
          System.out.print(c+" ");
        }
        System.out.println();
        }
        break;
        
      default: 
      System.out.println("Wrong choice!");
    }
    }
}

/**
Description Table: 

   VARIABLE                             DATA TYPE                         DESCRIPTION
      ch                                  char                            - to store the user's choice.
      s                                  String                           - to store the entered string.
     len                                  int                             - to store the length of the string.
     i, j                                 int                             - control variables.
      c                                  char                             - to extract each character.
 */
