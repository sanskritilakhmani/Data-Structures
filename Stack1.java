
import java.util.Scanner;
public class StackExample {
    StackExample() 
    {
        
    }
    void push() //insert
    {
        System.out.println("Push fn is working");
    }
    void pop() //delete
    {
        System.out.println("Pop fn is working");
    }
    void traverse() //view
    {
        System.out.println(" Traverse fn is working");
    }
    public static void main(String args[])
    {
        StackExample obj=new StackExample();
        while(true)
        {
            System.out.println(); 
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println();
            System.out.println("Enter your choice");
            
            Scanner sc= new Scanner(System.in);
            int ch= sc.nextInt ();
            
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    break;
            }
        }
    }
    
}
