/**
 3. Write a program to enter a number and check whether it is a palindrome or not.
 */

import java.util.*;
public class do_while_3
{
  public static void main(String args[])
  {
    Scanner in =new Scanner (System.in);
    System.out.println("Enter a number to check whether it is a palindrome or not.");
    int n=in.nextInt();
    int temp=n,d=0,r=0;
    do
    {
     d=temp%10;
     r=r*10+d;
     temp=temp/10;
    }
    while(temp!=0);
    if(r==n)
    System.out.println("It is a palindrome number.");
    else
    System.out.println("It is not a palindrome number.");
  }
}

/**Description Table:
 
 *   VARIABLE                      DATA TYPE                      DESCRIPTION
       
 *      n                         integer(int)                - to store the inputted number.
 *     temp                       integer(int)                - to store the number in another variable.
 *      d                         integer(int)                - to store the extracted digit.
 *      r                         integer(int)                - to store the reversed number.
 */ 