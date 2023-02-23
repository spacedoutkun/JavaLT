//to keep inserting string input in string variable 
import java.util.*;  
class strInputContin  
{  
  public static void main(String[] args)  
  {  
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    System.out.print("Enter a string: "); 
    
    while(sc.hasNext()==true)
    {
      String str= sc.next();              //reads string   
      System.out.print("You have entered: "+str+" ");
    }
                 
  }  
}  