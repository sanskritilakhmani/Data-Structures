 
import java.util.Scanner;

public class Arrayexample4 {
    Arrayexample4()
    {
        Scanner sc= new Scanner(System.in);
        int ar[]= new int[10];
        
        //input
        System.out.println("Enter elements in array");
        for( int i=0;i<ar.length; i++)
        {
            ar[i]=sc.nextInt();
        }
        int pos=0;
        int neg=0;
        //process
        for(int i=0; i<10;i++)
        {
            if(ar[i]>=0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
        }
        //output
        System.out.println("Number of positive" + pos);
        System.out.println("Number of negative" + neg);
    }
    public static void main(String args[]){
       Arrayexample4 obj = new Arrayexample4(); 
    }
}
