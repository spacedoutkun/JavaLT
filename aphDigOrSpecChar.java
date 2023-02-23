
import java.util.*;  
class AlphDigOrSpecChar  
{  
  public static void main(String[] args)  
  {  
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    
    char a=sc.next().charAt(0);
    
    char b=sc.next().charAt(0); 
    
    Boolean bn1=Character.isLetterOrDigit(a);
    Boolean bn2=Character.isLetterOrDigit(b);
    
    
    if(bn1==true)
    {
      System.out.println(a+"is letter or digit");
    }
    else
    {
      System.out.println(a+"is special character");

    }
      
      
    if(bn2==true)
    {
      System.out.println(b+"is letter or digit");
    }
    else
    {
      System.out.println(b+"is special character");

    }
  }  
}  