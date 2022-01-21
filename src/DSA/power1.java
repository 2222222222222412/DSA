package DSA;

import java.util.Scanner;

public class power1
{
    public static int   powerof(int n,int p)
    {

        if(p==0)
        {
            System.out.println(n);

        }


          return n*powerof(n,p-1);

    }
    public static void main(String[] args) {
        int n,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        System.out.println(powerof(n,p));
    }
}
