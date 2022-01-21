package DSA;

import java.util.Scanner;

public class power
{
    public static int  powerof(int n,int p)
    {
        int j=n;
        if(p==1)
        {
            return j;
        }

        int f=powerof(n,p-1);
        j=j*f;
        return j;
    }
    public static void main(String[] args) {
        int n,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        System.out.println(powerof(n,p));
    }
}
