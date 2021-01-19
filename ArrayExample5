
import java.util.*;
public class Arrayexample5
{
    Arrayexample5(){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        //input
        System.out.println("Enter array elements");
        for(int i=0; i<ar.length; i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=0;
        //process
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]<ar[i-1]){
                max=ar[i];
                ar[i]=ar[i-1];
                ar[i-1]=max;
            }
            else
                continue;        
        }
        
        //output
        System.out.println("The second highest number is : " + ar[4] );
    }
       public static void main(String args[])  
       {
           Arrayexample5 obj=new Arrayexample5();
       }
    
}
