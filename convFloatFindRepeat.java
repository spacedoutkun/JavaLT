//Java program to enter elements in Array, convert them into float and then display the repreated.
/*
No of Ele
3

1 
2
3

pos 
2

ele 
3

1.0 3.0 2.0 3.0 

repeated 
3.0

*/
 
import java.util.*;
  
class Main
{
   
    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("No of Ele ")
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("pos ");
        int pos=sc.nextInt();
        System.out.println("ele ");
        int x=sc.nextInt();
        int newArr[]=new int[n+1]; 
        
        for(int i=0;i<n+1;i++)
        {
            if(i<pos-1){
                newArr[i]=arr[i];
            }
            else if(i==pos-1) 
            {
                newArr[i]=x;
            }
            else{
                newArr[i]=arr[i-1];
            }
        }
        
        for(int i=0;i<n+1;i++)
        {
            System.out.print((float)newArr[i]+" ");
        }
        
        System.out.println();
        for(int i=0;i<n+1;i++)
        {
            
            for(int j=i+1;j<n+1;j++)
            {
                if(newArr[i]==newArr[j] && i!=j)
                {
                    System.out.println("repeated ");
                    
                    System.out.println((float)newArr[j]);    
                } 
            }
            
            
        }
       
    }
}
