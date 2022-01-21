package DSA;

import java.util.Scanner;

public class count {
    static int Count =0;
    public static int countnum(int n)
    {
        if(n > 0)
        {
            Count = Count + 1;
            countnum (n / 10);
        }

        return Count;
    }




        public static void main (String[] args){

            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println(countnum(n));
        }
    }


