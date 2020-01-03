/**
 5. Write a program to accept a sentence and replace any word with another word.
 */

import java.util.*;
public class for_loop_5
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter a sentence: ");
    String s=in.nextLine();
    System.out.println("Enter the word to be replaced: ");
    String rep=in.next();
    System.out.println("What do you want to replace it with?");
    String rep2=in.next();
    String s2=s.replace(rep,rep2);
    System.out.println("Replaced sentence:\n"+s2);
    }
}

/**
 Description Table: 
 
    VARIABLE                        DATA TYPE                      DESCRIPTION
       s                             String                        - to store the entered sentence.
      rep                            String                        - to store the word that has to be replaced.
     rep2                            String                        - to store the word that has to be replaced with instead.
      s2                             String                        - to store the new sentence. 
 */