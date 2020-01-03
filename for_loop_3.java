/**
3. A prime number is said to be Twisted Prime, if the new number obtained after reversing the digits is also
   a prime number. Write a program to accept a number and check whether the number is Twisted Prime or not.
   Sample Input : 167
   Sample Output :761
   167 is a Twisted Prime Number.
 */
import java.util.*;
public class for_loop_3
{
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     int flag=0,flag2=0, d=0,r=0,h=n;
      for(int i=1;i<=n;i++)
      {
       if (n%i==0)
       flag++;
      } 
      if(flag!=2)
      {
         System.out.println("The number entered is not a prime number, hence it cannot be Twisted Prime Number.");
         System.exit(0);
      }
      while(n!=0)
      {
       d=n%10;
       r=r*10+d;
       n=n/10;
      }
      for(int j=1;j<=r;j++)
      {
       if (r%j==0)
       flag2++;
      } 
      if(flag2==2)
       System.out.println(h+" is a 'Twisted Prime Number'.");
      else 
       System.out.println(h+" is not a 'Twisted Prime Number'.");
    }
} 

/** Description Table:
 
 *       VARIABLE                      DATA TYPE                           DESCRIPTION
 
 *          n                       integer (int)                    - to store the inputted number.
 *        flag                      integer (int)                    - to store the number of factors of the number.
 *        flag2                     integer (int)                    - to store the number of factors of the reversed number.
 *          d                       integer (int)                    - to store the extracted digit.
 *          r                       integer (int)                    - to store the reversed number.
 *          i                       integer (int)                    - to use as a control variable to find the factors of the number.
 *          j                       integer (int)                    - to use as a control variable to find the factors of the reversed number.
 */