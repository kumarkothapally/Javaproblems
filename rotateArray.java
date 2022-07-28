import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
      arr[i] =sc.nextInt();
        }
         int k = sc.nextInt();
      rotate(arr,k);
       
       

      
      
       
    }
    public static void rotate(int[] arr,int k)
    {
        int i=0;
        int j=arr.length-1;
        int p=arr.length;
      if(k>arr.length)
      {
          k=k%p;
      }
      reverse(0,j,arr);
reverse(0,k-1,arr);
reverse(k,j,arr);
 for(int m=0; m<arr.length;m++)
        {
            System.out.print(arr[m]+" ");
        } 
    }

 public static void reverse(int i, int j,int[] arr)
 {
while(i<j)
      {
     arr[i]=arr[i]+arr[j];
     arr[j]= arr[i]-arr[j];
     arr[i]=arr[i]-arr[j];
     i++;
     j--;
      } 
 }
}
