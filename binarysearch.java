public class binarysearch {
    //time complexity logn
    public static void main(String[] args){
        int[] array={12,45,67,87,98,99};
        
        int key=98;
        int start=0;
        int end=array.length-1;
        int mid=(start+end)/2;

        while(start<=end)
        {
            if(array[mid]==key)
        {
            System.out.println("Element is present at index: " +mid);
            break;
        }
        else if(key>array[mid])
        {
            start=mid+1;
        }
        else 
        {
            end=mid-1;
        }
        mid=(start+end)/2;
        }
        if(array[mid]!=key)
        {
            System.out.println("Element is not present in array");
           // break;
        }
    }
}
