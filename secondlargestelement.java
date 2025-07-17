public class secondlargestelement {
    public static void main (String[] args){
    int [] arr= {1,3,4,5,5,3};

    int max1=0;
    int max2=0;

    for(int i=0; i<arr.length ;i++){
        if(max1<arr[i]){
            if(max2!=max1)
            max1=arr[i];
        }

    }
    System.out.println(max1);
    }
}
