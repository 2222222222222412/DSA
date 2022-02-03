package DSA;

import java.util.Scanner;
//55 35 67 56 40 89
// 67 55 43 20 64 80
public class Task
{
    static int i=0,f;
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%5!=0 )
            {
                for (int j = i; j < arr.length; j++)
                {
                    if(arr[j]%5==0)
                    {
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
            }
        }
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
        sort(arr);
        for (int i = 0; i <n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
