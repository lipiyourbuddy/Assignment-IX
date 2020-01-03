/**
 6. A paper roll manufacturing company offers discount to the dealer and retailer based on the length of the
    paper roll as per the following criteria:
    Length of the paper                       Dealer            Retailer
    Up to 10 meters                            10%                 8%
    11 meters and up to 20 meters              15%                10%
    More than 20 meters                        20%                15%
    Write a program to input the length of paper roll and the amount of purchase. Use a menu driven approach
    having choices (D) for dealer and (R) for retailer to find and print the amount to be paid to the company
    after discount.
 */

import java.util.*;
public class switch_case_6
{
    public static void main (String args[])
    {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the length of paper roll in metres: ");
      double l=in.nextDouble();
      System.out.println("Enter the amount of purchase: ");
      double amt=in.nextDouble();
      System.out.println("Enter your choice for calculation of the total amount:\n1. D for Dealer\n2. R for Retailer");
      char ch=in.next().charAt(0);
      double totamt=0, di=0;
      String str="";
      if(ch=='D'||ch=='d')
       str="Dealer";
      else if (ch=='R'||ch=='r')
       str="Retailer";
      switch(ch)
      {
        case 'D':
        case 'd':
        if(l>0&&l<=10)
        di=10.0/100.0*amt;
        if(l>10&&l<=20)
        di=15.0/100.0*amt;
        if(l>20)
        di=20.0/100.0*amt;
        break;
        
        case 'R':
        case 'r':
        if(l>0&&l<=10)
        di=8.0/100.0*amt;
        if(l>10&&l<=20)
        di=10.0/100.0*amt;
        if(l>20)
        di=15.0/100.0*amt;
        
        break;
        
        default:
        System.out.println("Wrong input");
        System.exit(0);
      }
      totamt=amt-di;
      System.out.println("Amount of purchase: Rs."+amt+"\nDiscount for "+str+": Rs."+di+"\nTotal amount: Rs."+totamt);
    }
}
      
/** Description Table:
 
 *      VARIABLE                          DATA TYPE                             DESCRIPTION 
 
 *         l                               double                          - to store the length of paper roll in metre.
 *        amt                              double                          - to store the amount of purchase.
 *        ch                           character (char)                    - to store the entered choice.
 *       totamt                            double                          - to store the total amount after applying discount.
 *        di                               double                          - to store the discount.
 *        str                              String                          - to store the the choice- Dealer or Retailer to 
                                                                             be displayed in output.
 */     