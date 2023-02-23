//to keep inserting string input in string variable 
import java.util.*;  
class tempHC  
{  
  public static void main(String[] args)  
  {  
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    
    int temp=sc.nextInt();
    
    if(temp<0){
      System.out.println("Freeing weather");
      
    }
    else{
      if(temp<10)
      {
        System.out.println("Very cold weather");
      }
      else if(temp<20)
      {
        System.out.println("Cold weather");
      }
      else if(temp<30)
      {
        System.out.println("Normal in temperature");
      }
      else if(temp<40)
      {
        System.out.println("Its hot");
      }
      else
      {
        System.out.println("Its very hot");  
      }
        
        
        
        
      
      
    }
  }  
}  