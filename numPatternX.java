/*
Output:

1               1 
. 2           2 
. . 3       3 
. . . 4   4 
. . . . 5 
. . . 4   4 
. . 3       3 
. 2           2 
1               1 

*/

import java.util.*;

public class pattX {
  public static void patternX(int n)
  {
    int x=n;
    for(int i=1;i<=2*n-1;i++)
    {
      if(i<=n)
      {
        for(int j=1;j<i;j++)
        {
          System.out.print(". ");
        }
        System.out.print(i+" ");
        if ( i != n ) 
        {
          for(int k=1;k<=2*(n-i)-1;k++)
          {
            System.out.print("  ");
          }
          System.out.print(i+" ");
        }
      }
      else
      { 
        x=--x;
        for(int l=1;l<=(2*n)-i-1;l++)
        {
          System.out.print(". ");
        }
        System.out.print(x+" ");
        for(int h=1;h<=2*(i-n)-1;h++)
        {
          System.out.print("  ");
        }
        System.out.print(x+" ");
      }
      System.out.println();
    }
    
    
  }
  

  public static void main(String[] args) throws java.lang.Exception
  {
    int n=5;
    patternX(n);
  }
}