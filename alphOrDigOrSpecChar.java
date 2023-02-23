
  import java.util.*;  
  class alphOrDigOrSpecChar  
  {  
    public static void main(String[] args)  
    {  
      Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
      
      char a=sc.next().charAt(0);
      if(a>='a' && a<='z' )
      {
        System.out.print("Alpha");
      }
      else if(a>='0' && a<='9')
      {
        System.out.print("Digit");
      }
      else
      {
        System.out.print("Special character");
      }
        
      
    }  
  }  