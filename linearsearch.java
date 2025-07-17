public class linearsearch {
    public static void  main (String[] args){
    int[] arr={2,4,6,12,34,4};
    int key=24;

    for(int i=0;i<arr.length; i++){
        if(arr[i]==key){
            System.out.println(true);
            break;
        }
    }
    System.out.println(false);
}
}