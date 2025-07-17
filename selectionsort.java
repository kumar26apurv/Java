import java.util.*;
public class selectionsort {
    static void selection_sort(int arr[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
    
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex]){
                minIndex=j;
                }
            }
            //swap(arr[minIndex],arr[i]);
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]=temp;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        selectionsort ob = new selectionsort();
        int arr[] = {64,25,12,22,11};
        ob.selection_sort(arr,5);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}