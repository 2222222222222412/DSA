package DSA;

import java.util.Scanner;

public class Task1 {
    static int i = 0, f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort1(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//Below method to shift right side Divisible by 5 elements
    public static void sort1(int arr[]) {
        int l = arr.length, c = arr.length;
        for (int f = 0; f < l; f++){
            for (int j = 0; j <l; j++)
            {if (arr[j] % 5 == 0 && arr[j+1]%5!=0) {
                        int temp = arr[j];
                        for (int k = j; k < l - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        arr[l - 1] = temp;
                        l = l - 1;
                    }
                }
         }
}
}


