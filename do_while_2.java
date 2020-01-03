/**
 2. Write a program to input a decimal number and find its equivalent binary number.
 */
import java.util.*;
public class do_while_2
{
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
   System.out.println("Enter a number in decimal (integer or fractional) to convert to its binary form: ");
   float n=in.nextFloat();
   float d=(float)Math.rint(n);
   String no="";
   int r=0;
   if (d==n)
   {
     do
     {
      r=(int)n%2;
      n=(int)n/2;
      no=r+no;
     }
     while(n!=0);
     System.out.println("The number in binary: "+no);
    }
   else
   {
     float temp=n,pr=0;
     int n2=(int)n;
     float fr=n-n2;
     String num="";
     int i=0;
     do
     {
      r=(int)n%2;
      n=(int)n/2;
      no=r+no;
     }
     while(n!=0);
     
     do
     {
       pr=fr*2;
       i=(int)pr;
       fr=pr-i;
       num=num+i;
     }
     while(fr!=0);
     System.out.println("The number in binary: "+no+"."+num);
   }
}
}

/** Description Table: 
 
 *  VARIABLE                    DATA TYPE                     DESCRIPTION 
 
 *     n                         float                    - to store the inputted decimal number.
 *     d                         float                    - to store the integer part of the number.
 *     no                        String                   - to store the binary number.
 *     r                      integer(int)                - to store the remainder when number is divided by 2.
 *    temp                       float                    - to store the inputted number in another variable.
 *     pr                        float                    - to store the product when fractional part is multiplied by 2.
 *     n2                     integer(int)                - to store the integer part of the number.
 *     fr                        float                    - to store the fractional part of the number.
 *     num                       String                   - to store the fractional part's binary equivalent.
 *     i                      integer(int)                - to store the integer part of the product.
 */