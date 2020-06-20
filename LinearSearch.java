import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch
{
    static void LSearch(int arr[], int key )
    {
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Key Found!");
        }
        else System.out.println("Key not found!");
    }
	public static void main(String args[]) 
	{
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter Elements: ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("Enter Key: ");
		int key = sc.nextInt();
		
		LinearSearch ob = new LinearSearch();
		long st,ft;
		st=System.nanoTime();
		ob.LSearch(arr,key);
		ft=System.nanoTime();
		System.out.println("\n"+"Time Taken: "+(ft-st));
	}
}

// Time Complexity is O(n)
