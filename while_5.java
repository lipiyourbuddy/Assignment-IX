/**
 5. Write a program to print the sum of the series:
    S=1+(1*2)+2+(1*2*3)+3+. . . . .+(1*2*3*....*n)+n
 */
import java.util.*;
public class while_5
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the limit for the series: ");
    int n=in.nextInt();
    int i=2,f,sum=1,j=2;
    while(i<=n)
    {
      f=1;
      while(j<=i)
      {
        f=f*j;
        j++;
      }
      sum=sum+f+i;
      i++;
      j=1;
    }
    System.out.println("Sum of series is: "+sum);
  }
}
/** Description Table;
 
 *    VARIABLE                             DATA TYPE                            DESCRIPTION
 *       n                                   int                          - to store the limit.
 *       i                                   int                          - to use as control variable.
 *       f                                   int                          - to store the factorial.
 *      sum                                  int                          - to store the sum of the series.
 *       j                                   int                          - to be multiplied to get the factorial.
 */