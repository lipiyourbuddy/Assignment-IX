/**
 2. Write a Program in Java to input a number and check whether it is a Harshad number (or Niven number) or
    not. Harshad number or Niven number is a number which is divisible by the sum of its digits. 
    For example,
    1) 21 is a Harshad number because it is divisible by the sum of its digits.
    21 -> sum of digits -> 2+1 = 3 and 21 is divisible by 3 -> 21/3 = 7.
*/

import java.util.*;
public class while_2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number to check whether it is a Harshad (or Niven) number or not: ");
    int n=in.nextInt();
    int temp=n,d=0,sum=0;
    while(n!=0)
    {
     d=n%10;
     sum=sum+d;
     n=n/10;
    }
    if(temp%sum==0)
    System.out.println(temp+" is a Harshad number as it is divisible by the sum of its digits.");
    else
    System.out.println(temp+" is not a Harshad number as it is not divisible by the sum of its digits.");
  }
}

/** Description Table
 
 *    VARIABLE                             DATA TYPE                            DESCRIPTION
 *       n                                   int                             - to store the inputted number.
 *     temp                                  int                             - to store the number in another variable
 *       d                                   int                             - to store the extracted digit
 *      sum                                  int                             - to store the sum of the digits
 */