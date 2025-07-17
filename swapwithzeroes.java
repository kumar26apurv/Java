public class swapwithzeroes {

    void sortzero(int[] arr,int n){
    //int[] arr={1,0, 2,0, 0, 3};

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
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
        swapwithzeroes ob = new swapwithzeroes();
        int arr[] = {1,0,0,3,5,0,4};
        ob.sortzero(arr,7);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
