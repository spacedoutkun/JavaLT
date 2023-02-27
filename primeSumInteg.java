import java.util.*;

public class Main {
  public static boolean checkPrime(int n)
  {
    boolean isPrime=true;
    if(n==0 || n==1)
    {
      isPrime=false;
    }
    else{
      int count=0;
      for(int i=2;i<n/2;i++)
      { 
        
            if(n%i==0)
            {
              isPrime=false;
              break;
            }
        
      }
      
      
    }
    return isPrime;
  }
  

  public static void main(String[] args) throws java.lang.Exception
  {
    int N=16;
    
    boolean flag=false;
    for(int i=1;i<N/2;i++)
    {
      if(checkPrime(i)==true)
      {
       
        if(checkPrime(N-i)==true)
        {
          System.out.printf("%d = %d + %d\n", N, i, N - i);
          flag=true;
        }
      }
    }
    if (!flag)
      System.out.println(N + " cannot be expressed as the sum of two prime numbers.");
    
  }
}