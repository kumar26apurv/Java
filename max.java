public class max {
    public static void main(String[] args){
    int [] arr = {1,3,4,5,5,3};  
    int max = -1 ;

    for(int i=0; i<arr.length; i++)
    {
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println(max);
        int max2=-1;

    //second largesr array
    int[] result= new int[arr.length];
    for(int i=0; i<arr.length;i++ ) 
    {
        if (arr[i] != max) {
            result[i]=arr[i];            
        }
    }
    for(int i=0; i<result.length; i++){
        if(max2<result[i])
        {
            max2=result[i];
        }
    }
    System.out.println(max2);


}
}
