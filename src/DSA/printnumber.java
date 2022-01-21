package DSA;

import java.util.Scanner;

public class printnumber
{
    public static int print(int n)
    {
        if(n==0)
            return 1;

         int k=print(n-1);
        System.out.print(k-(k-n)+" ");
        return k;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(n);

    }
}
