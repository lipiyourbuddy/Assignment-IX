/**'Bank of India' announces a new rates for Term Deposit Schemes for their customers and Senior Citizens as
    given below:
    Term              Rate of Interest(General)  Rate of Interest(Senior Citizen)
    Upto 1year                7.5%                          8.0%
    Upto 2years               8.5%                          9.0%
    Upto 3years               9.5%                         10.0%
    More than 3years         10.5%                         11.0%
    The senior citizen is applicable to those customers, whose age is 60 years or more. Write a program to accept the
    sum(p) in term deposit scheme, age of the customer and the term. The program displays the information in the
given format:
Amount Deposited      Term       Age         Interest Earned        Amount Paid
    XXXXX              XXX        XX             XXXXX                 XXXXX
**/
    
import java.util.*;
public class if_else_3
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the age: ");
   int age=in.nextInt();
   System.out.println("Enter the Term Deposit: ");
   double p=in.nextDouble();
   System.out.println("Enter the Term (in years): ");
   double term=in.nextDouble();
   double ri=0,amount=0,interest=0;
   if(age<60)
   {
       if(term<=1)
       ri=7.5;
       else if(term<=2)
       ri=8.5;
       else if(term<=3)
       ri=9.5;
       else if(term>3)
       ri=10.5;
       else
       System.out.println("Wrong input");
    }
    else if(age>=60)
    {
        if(term<=1)
       ri=8.0;
       else if(term<=2)
       ri=9.0;
       else if(term<=3)
       ri=10.0;
       else if(term>3)
       ri=11.0;
       else
       System.out.println("Wrong input");
    }
    
    else
    System.out.println("Wrong input");
    interest=ri*p*term/100.0;
    amount=interest+p;
    System.out.println("Amount Deposited \tTerm in years \tAge \tInterest Earned \tAmount Paid");
    System.out.println(p+" \t\t\t"+term+" \t\t"+age+" \tRs."+interest+" \t\tRs."+amount);
}
}


/** Description Table:
 
 *     VARIABLE                              DATA TYPE                            DESCRIPTION
 
 *       age                               integer (int)                      - to store the inputted age.
 *        p                                   double                          - to store the inputted term deposit which is the
                                                                                principal amount.
 *      term                                  double                          - to store the inputted term in years.
 *       ri                                   double                          - to store the rate of interest.
 *     amount                                 double                          - to store the amount.
 *    interest                                double                          - to store the interest for the deposit.
 */ 