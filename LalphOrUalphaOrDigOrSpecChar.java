
  import java.util.*;  
  class LalphOrUalphaOrDigOrSpecChar  
  {  
    public static void main(String[] args)  
    {  
      Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
      
      char a=sc.next().charAt(0);
      if(a>='A' && a<='A' )
      {
        System.out.print("Uppercase");
      }
      else if(a>='a' && a<='z')
      {
        System.out.print("Lowercase");
      }
      else if(a>='0' && a<='9')
      {
        System.out.print("Digit");
      }
      else
      {
        System.out.print("Special char");  
      }
        
      
    }  
  }  