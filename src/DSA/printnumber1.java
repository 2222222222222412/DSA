package DSA;

import java.util.Scanner;

public class printnumber1
{
    public static void  print(int n)
    {
        if(n==0)
            return;
        print(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(n);

    }
}
