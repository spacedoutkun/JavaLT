
import java.util.*;  
class leapYear  
{  
  public static void main(String[] args)  
  {  
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    
    int yr=sc.nextInt();
    
    if(((yr%4 == 0) && (yr%100!= 0)) || (yr%400 == 0)){
      System.out.println("Leap year");
      
    }
    else{
      System.out.println("Not");
    }
  }  
}  