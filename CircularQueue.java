
import java.util.Scanner;
public class CircularQueue
{
    int ar[];
    int Front, rear;
    
    CircularQueue()
    {
        ar= new int[5];
        Front=-1;
        rear=-1;
    }
    void insert()
    {
        if(rear==4 && Front==0 || rear==Front-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("Enter Data");   
            Scanner sc2=new Scanner(System.in);
            int data=sc2.nextInt();
            
            if(Front==-1)
            {
                Front=0;
            }
            else if(rear<4)
            {
                rear=rear + 1;
            }
            else if(rear==4 && Front!=0)
            {
                rear=0;
            }
            ar[rear]=data;
            System.out.println("Data inserted................");
        }
        
    }
    void delete()
    {
         if(Front== -1 || rear == -1)
        {
            System.out.println(" Circular Queue Empty");
        }
        else
        {
            if(Front==rear)
            {
                System.out.println("Deleted.........." + ar[Front]);
                Front = -1;          
                rear= -1;
            }
            else if(Front<rear)
            {
                System.out.println("Deleted............" + ar[Front]);
                Front= Front + 1;
            }
            else if(Front==4)
            {
                System.out.println("Deleted............" + ar[Front]);
                Front=0;
            }
            else if(rear<Front)
            {
                System.out.println("Deleted............" + ar[Front]);
                Front= Front + 1;
            }
            
        }
        
    }
    void traverse()
    {
        
        if(Front==-1  ||  rear==-1)
        {
            System.out.println("Queue empty :)");
            
        }
        else
        {
            if(Front <= rear)
            {
            for(int i=Front; i<=4; i++)
            {
                System.out.println(" "  +  ar[i]);
            }
            }
            else
            {
               for(int i=0; i<=rear ; i++)
            {
                System.out.println(" "  +  ar[i]);
            } 
            }
                
        }
    }
    void searchnode()
    {
        
    }
    void peek()
    {
        
    }
    void poll()
    {
        
    }
    public static void main(String args[])
    {
        CircularQueue obj = new CircularQueue();
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
