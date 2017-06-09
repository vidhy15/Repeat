import java.io.*;
import java.util.*;
public class Repeat
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i,j,dup=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
          for(j=1;j<n;j++)
          {
              if(a[i]==a[j] && i!=j)
              {
                  dup=a[i];
                  break;
              }
          }
        }if(dup>0)
        {
            System.out.println(dup);
        }
              else
              {
                  System.out.println("No duplicate);
              }
          
        
    }
}

