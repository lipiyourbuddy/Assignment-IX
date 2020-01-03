/**
 * 6. Write a program to accept a number from the user and check whether it is an Armstrong
Hint: Armstrong number: A number is an Armstrong number if the sum of the cubes of digits is equal to the
original number.
 */

import java.util.*;
public class while_6
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter a number to check whether it is an Armstrong number: ");
    int n=in.nextInt();
    int temp=n,d=0,sum=0;
    while(n!=0)
    {
     d=n%10;
     sum=sum+(int)Math.pow(d,3);
     n=n/10;
    }
    if(sum==temp)
    System.out.println("It is an Armstrong number.");
    else 
    System.out.println("It is not an Armstrong number.");
  }
}

/** Description Table:
 
 *   VARIABLE                                     DATA TYPE                           DESCRIPTION
 *      n                                            int                         - to store the inputted number
 *    temp                                           int                         - to store the number in another variable.
 *      d                                            int                         - to store the extracted digit.
 *     sum                                           int                         - to store the sum of the digits powered with their positions
 */
  