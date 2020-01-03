/**
1   . An electronics shop has announced the following seasonal discounts on the purchase of certain items.
   Purchase Amount in Rs.           Discount on Laptop        Discount on Desktop PC
          0-25000                         0.0%                     5.0%
      25001-57000                         5.0%                     7.6%
     57001 - 100000                       7.5%                    10.0%
   More than 100000                      10.0%                    15.0%
  Write a program based on the above criteria to input name, address, amount of purchase and type of purchase (L
  for Laptop and D for Desktop) by a customer. Compute and print the net amount to be paid by a customer along
  with his name and address.
  
  (Hint: discount = (discount rate/100)* amount of purchase
         Net amount = amount of purchase – discount)
*/
import java.io.*;
public class switch_case_1
{
 public static void main(String args[]) throws IOException
 {
   InputStreamReader read=new InputStreamReader(System.in);
   BufferedReader in=new BufferedReader(read);
   System.out.println("Enter the name: ");
   String name=in.readLine();
   System.out.println("Enter the address: ");
   String address=in.readLine();
   System.out.println("Enter the amount of purchase: ");
   double amt=Integer.parseInt(in.readLine());
   System.out.println("Enter the type of purchase, i.e. 'L' for Laptop and 'D' for Desktop: ");
   char ch=(char)(in.read());
   double totamt=0,d=0;
   switch(ch)
   { 
      case 'L':
      case 'l':
      
       if (amt>0&&amt<=25000)
       d=0;
       else if(amt>25000&&amt<=57000)
       d=(5.0/100.0)*amt;
       else if(amt>57000&&amt<=100000)
       d=(7.5/100.0)*amt;
       else if(amt>100000)
       d=(10.0/100.0)*amt;
       else
       System.out.println("Wrong input");
       break;
      case 'D':
      case 'd':
      
       if(amt>0&&amt<=25000)
       d=(5.0/100.0)*amt;
       else if(amt>25000&&amt<=57000)
       d=(7.6/100.0)*amt;
       else if(amt>57000&&amt<=100000)
       d=(10.0/100.0)*amt;
       else if(amt> 100000)
       d=(15.0/100.0)*amt;
       else 
       System.out.println("Wrong input!!!");
       break;
       
       default:
       System.out.println("Wrong choice!");
       System.exit(0);
    }
  totamt=amt-d;
  String item=ch=='L'?"Laptop":"Desktop";
  System.out.println("Name: "+name);
  System.out.println("Address: "+address);
  System.out.println("Discount on "+item+" is: Rs."+d);
  System.out.println("Final amount is: Rs."+totamt);
 }
}

/** Description Table:
 
 *    VARIABLE                            DATA TYPE                             DESCRIPTION
 
 *     name                                String                          - to store the inputted name as string.
 *    address                              String                          - to store the inputted address.
 *      amt                                double                          - to store the inputted amount of purchase.
 *      ch                             character (char)                    - to store the inputted choice of laptop or desktop.
 *    totamt                               double                          - to store the total amount after applying discount.
 *      d                                  double                          - to store the discount on amount.
 */