import java.util.Scanner;
public class smallestthreenumber {
        public static void main(String[] args)   
    {  
        int smallest, temp;  
    
        Scanner sc = new Scanner(System.in);  
         
        System.out.println("Enter the numbers ");  
        int a = sc.nextInt();
        int b = sc.nextInt();   
        int c = sc.nextInt();  
          
        temp=a<b?a:b;  
        
        smallest=c<temp?c:temp;  
         
        System.out.println("The smallest number is "+smallest);  
    }  

}
