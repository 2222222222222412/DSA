package DSA;

import java.util.Scanner;

public class Array
{
    static int i=0,f;
    public static int  sumofele(int arr[])
    {
        int sum=f;
        if(i==arr.length)
        {
            return sum;
        }
         f=arr[i++];
        f=sum+f;
        sumofele(arr);
        return f;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sumofele(arr));






    }
}
