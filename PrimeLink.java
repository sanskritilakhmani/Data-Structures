
import java.util.Scanner;

class Node
{
    int rollno;
    Node next;
}
public class PrimeLink

{
    Node START;
    Primelink(){
        START=null;
    }
    void addnode()
    {
        System.out.println("Enter your choice");
        Scanner sc2=new Scanner(System.in);
       int rn=sc2.nextInt();
        Node newnode= new Node();
        newnode.rollno=rn;
        newnode.next=null;
        
        int a=0;
        for(int i=2; i<rn; i++)
        {
            if( rn%i==0)
                a++;
          
        }
        if(a==0)
        {

                if(START==null)
                {
                    START=newnode;
                }
                else 
                {
                    Node current=START;
                    while(current.next != null)
                    {
                        current = current.next;
                    }
                    current.next = newnode;
                }
                System.out.println("Data Inserted.........");
        }
    }
    void deletenode ()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Deleted Node is ............." + START.rollno);
            START = START.next;
            
        }
    }
    void traversenode ()
    {
        if(START == null)
        {
            System.out.println("List empty");
            
        }
        else
        {
            Node current;
            for(current=START; current != null; current=current.next)
            {
                System.out.print(" "+current.rollno);
            }
        }
            
    }
   void searchnode()
   {
       if(START == null)
       {
           System.out.println("List Empty");
       }
       else
       {
           System.out.println("Enter Searching element.............");
           Scanner sc3= new Scanner(System.in);
           int sea= sc3.nextInt();
           
           Node current;
           int count=0;
           for(current = START; current!=null; current = current.next)
           {
               if(current.rollno == sea)
               {
                   count++;
                   break;
               }
           }
           if(count>0)
           {
               System.out.println("Roll no found");
           }
           else
           {
               System.out.println("Roll no not found");
           }
       }
   }
   
    
    public static void main(String args[])
    {
        SinglyLinkedList obj= new SinglyLinkedList();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");
            
            System.out.println("Enter your choice");
            Scanner sc= new Scanner(System.in);
            int ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Wrong Choice");
                    
            }
        }
    }
}
