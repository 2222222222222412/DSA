package DSA;

public class fiveele
{
    static int k=0;
    public static int  find(int arr[], int currentindex,int searchvalue)
    {

        if(currentindex>=arr.length)
            return k;
        if(arr[currentindex]==searchvalue)
        {
            k=currentindex;
        }
        find(arr,currentindex+1,searchvalue);
        return k;

    }

    public static void main(String[] args)
    {

        int[] arr={1,2,3,4,5};
        int value=2;
        int crindex=0;
        System.out.println(find(arr, crindex, value));//if element not found then it should return 0

    }
}
