import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class anagramcheck {
    static boolean areanagram(char[] str1 , char[] str2)
    {
        int n1=str1.length;
        int n2=str2.length;

        if(n1!=n2)
            return false;
        

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0;i<n1; i++){
            if(str1[n1]!=str2[n2]){
                return false;
            }
            else{
                return true;
            }
        }
    }
    public static void main(String[] args)
    {
        char str11= {};
        char str21 = { 'w', 's', 'o' , 'h'};


    }
}