/**
 * Write a program to compute charges for sending parcels where the charges are as follows:
   Upto 100 gms : Rs. 25
   For each additional 50 gms or part thereof: Rs. 10
   Write a program to calculate the charge of a parcel taking weight of the parcel as input.
 */
import java.util.*;
public class if_else_2
{
 public static void main(String args[])
{
 Scanner in =new Scanner(System.in);
 System.out.println("Enter the weight of the parcel in grams: ");
 int w=in.nextInt();
 int charge=0;
 if(w<0)
 System.out.println("Wrong input!!!");
 else if(w<=100)
  charge=25;
 else
  charge=25+((w-100)/50)*10+10;
  System.out.println("Total charge: Rs."+charge);
}
}

/** Description Table:
 
 *          VARIABLE                       DATA TYPE                         DESCRIPTION
 
 *             w                         integer (int)                  - to store the input 
 *                                                                        (weight in grams.)
 *           charge                      integer (int)                  - to store the charges 
 *                                                                        calculated for the given 
 *                                                                        weight of parcel.
 */