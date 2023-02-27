import java.util.*;

public class strongNumbers {
  static int[] factorial={ 1, 1, 2, 6, 24, 120,
                               720, 5040, 40320, 362880 };
    public static boolean isStrong(int N) {
      String num=Integer.toString(N);
      
      int sum=0;
      for(int i=0;i<num.length();i++)
      {
        sum+=factorial[Integer.parseInt(num.charAt(i)+"")];
      }
      return sum==N;
      
      
  }
  
  public static void printStrongNumbers(int N)
  {
    for(int i=1;i<=N;i++)
    {
      if(isStrong(i))
      {
        System.out.print(i+" ");
      }
    }
  }
  
  public static void main(String[] args) throws java.lang.Exception
  {
    int N=1000;
    printStrongNumbers(N);
  }
}