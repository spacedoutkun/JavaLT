//Java program to remove repeating characters
/*
IP> HELLO ELLIOT
OP> HELO EIOT
*/
 
import java.util.*;
  
class removeRepeatingChr
{
    static String encode(char s[],int n)
    {
        int index=0;
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<i;j++)
            
            {
                if(s[i]==s[j])
                
                {
                    break;
                } 
            }
            if(i==j)
            {
                s[index++]=s[i];
            }
            
        }
        return String.valueOf(Arrays.copyOf(s,index));
        
    }
   
    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        
        int n=s.length();
        System.out.println(encode(s.toCharArray(),n));
        
    }
}
