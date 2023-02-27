import java.util.*;   
public class sumArray
{   
    public static void main(String args[])   
    {   
        int m, n, i, j;   
        Scanner sc=new Scanner(System.in);   
        System.out.print("Enter the number of rows: ");   
        
        m = sc.nextInt();   
        System.out.print("Enter the number of columns: ");   
        
        n = sc.nextInt();   

        int array[][] = new int[m][n];   
        
        System.out.println("Enter the elements of the array1: ");   
        
            for (i = 0; i < m; i++)   
            {    
                for (j = 0; j < n; j++)
                {
                    array[i][j] = sc.nextInt();   
                }
            }      
            System.out.println("Elements of the array1 are: ");   
            for (i = 0; i < m; i++)   
            {   
                for (j = 0; j < n; j++)   
                {
                    System.out.print(array[i][j] + " ");   
                
                }
                System.out.println();   
            }   
         
         System.out.println("Enter the elements of the array2: ");   
        
        
        int array1[][] = new int[m][n];   
        
        
        
            for (i = 0; i < m; i++)   
            {     
                for (j = 0; j < n; j++)  
                {
                    array1[i][j] = sc.nextInt();   
                }
            }       
            System.out.println("Elements of the array2 are: ");   
            for (i = 0; i < m; i++)   
            {   
                for (j = 0; j < n; j++)   
                {    
                    System.out.print(array1[i][j] + " ");   
                    
                }
                System.out.println();   
            }   
            
            System.out.println("sum of the array is: ");   
            for (i = 0; i < m; i++)   
            {   
                for (j = 0; j < n; j++)   
                {      
                    System.out.print(array[i][j] +array[i][j] );   
                    
                }
                System.out.println();   
            }   
    }
}  