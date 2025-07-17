public class istriangle {
    public static void main(String[] args)
    {
        int a=3,b=4,c=5;

        if(a<b+c && b<a+c && c<a+b){
            System.out.println("is a triangle");
        }
        else{
            System.out.println("is not a triangle");  
        }
    }
}
