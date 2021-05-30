
import java.util.Scanner;
public class InsertionSorting {
    
    void func()
    {
        Scanner sc= new Scanner(System.in);
        int ar[]=new int[5];
        
        // step 1 input
        System.out.println("Enter elements in array");
        for(int i =0;i<ar.length; i++)
        {
            ar[i]=sc.nextInt();
        }
        // process
        for(int r=0; r<5; r++)//pass
        {
            for(int c=0; c<r;c++)//comp
            {
                if(ar[c]>ar[r])//swapping
                {
                    int temp = ar[c];
                    ar[c]=ar[r];
                    ar[r]=temp;
                }
            }
        }
        // output
        System.out.println("----------Insertion Sort------------");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }   
    public static void main(String args[])
    {
        InsertionSorting obj= new InsertionSorting();
        obj.func();
    }    
}
