
import java.util.Scanner;
public class BubbleSortExample {
    
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[]=new int[5];
        
        //step 1 input
        System.out.println("Enter elements");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        //step 2 process
        for(int r=0;r<4;r++)
        {
            for(int c=0 ; c<4-r ; c++)
            {
                if(ar[c]>ar[c+1])
                {
                    int temp = ar[c];
                    ar[c]=ar[c+1];
                    ar[c+1]=temp;
                }
            }
        }
        // step 3 output
        System.out.println("-------Bubble Sort---------");
        for(int i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
        
    }
    public static void main(String args[])
        {
           BubbleSortExample obj=new BubbleSortExample();
           obj.func();
        }
}
