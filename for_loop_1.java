/**
1. Write a program to input a range of numbers and display all the pairs of amicable nos.
Hint: A pair of numbers are amicable if the sum of the factors of one number(excluding itself) is equal to the
second number and vice-versa.
**/

import java.util.*;
public class for_loop_1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Lower Limit: ");
    int ll=in.nextInt();
    System.out.println("Enter the Upper Limit: ");
    int ul=in.nextInt();
    int sum1,sum2,i,ii;
    System.out.println("Amicable numbers within this limit are: ");
    for(i=ll;i<=ul;i++)
    { 
      sum1=0;
      for(int j=1;j<i;j++)
      {
        if(i%j==0)
        sum1+=j;
      }
      for(ii=i+1;ii<=ul;ii++)
      {sum2=0;
          for(int p=1;p<ii;p++)
          {
            if(ii%p==0)
            sum2+=p;
          }
      if(sum1== ii && sum2==i)
      System.out.println(i+", "+ii);
    }
  }
}
}

/** Description Table:
 
 *  VARIABLES                              DATA TYPE                             DESCRIPTION
 *     ll                                integer(int)                       - to store the lower limit
 *     ul                                integer(int)                       - to store the upper limit
 *    sum1                               integer(int)                       - to store the sum of factors of the first number
 *    sum2                               integer(int)                       - to store the sum of factors of the second number
 *   i, ii                               integer(int)                       - to use as control variables for both loops
 *   j, p                                integer(int)                       - to store the factors of the numbers.    
 */
 