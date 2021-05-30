 
import java.util.Scanner;

public class SinglyQueueArray 
{
    int ar[];
    int Front,rear;
    SinglyQueueArray()
    { 
        ar=new int[5];
        Front=-1;
        rear=-1;
    }
        
    
    void insert()
    {
        if(rear==4)
        {
            System.out.println("Queue Full");
            
        }
        else
        {
            System.out.println("Enter Data");
            Scanner sc2=new Scanner(System.in);
            int data=sc2.nextInt();
            
            if(Front == -1)
            {
                Front = 0;
            }
            rear= rear + 1;
            ar[rear]= data;
            System.out.println("Data Inserted");
        }
    }
    void delete()
    {
        if(Front== -1 || rear == -1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            if(Front==rear)
            {
                System.out.println("Deleted.........." + ar[Front]);
                Front = -1;
                rear= -1;
            }
            else
            {
                
            }
            
        }
    }
    void traverse()
    {
        if(Front==-1  ||  rear==-1)
        {
            System.out.println("Singly queue empty :)");
            
        }
        else
        {
            System.out.println("-------------------Singly queue-------------------");
            for(int i=Front; i<=rear; i++)
            {
                System.out.println(" "  +  ar[i]);
            }
        }
    }
    void peek()
    {
        if(Front==-1 || rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Last Element" + ar[rear]);
        }
    }
    void poll()
    {
        if(Front==-1 || rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("First Element" + ar[Front]);
        }
    }
    public static void main(String args[])
    {
        SinglyQueueArray obj=new SinglyQueueArray();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Press 5 for Last element");
            System.out.println("Press 6 for First element");
            
            System.out.println("Enter your choice...........................");
            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();
            
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4   :
                    System.exit(0);
                    break;
                case 5:
                    obj.peek();
                    break;
                case 6:
                    obj.poll();
                    break;
            
                default :
                    System.out.println("Wrong Choice");
                    
        }
    
    }
    
    }
}



