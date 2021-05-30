
import java.util.Scanner;

class Nodee
{
    int rollno;
    Nodee previous;
    Nodee next;
}
public class DoublyLinkedList

{
    Nodee START;
    DoublyLinkedList()
    {
        START=null;
    }
    void addnode()
    {
        System.out.println("Enter your choice");
        Scanner sc2=new Scanner(System.in);
        int rn=sc2.nextInt();
        
        Nodee newnode= new Nodee();
        newnode.rollno=rn;
        newnode.previous =null;
        newnode.next=null;
        
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Nodee current=START;
            while(current.next!=null)
            {
                 current= current.next;
            }
               current.next=newnode;
               newnode.previous=current;
        }
        System.out.println("Data Inserted................");
        
    }
    void deletenode ()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            if(START.next==null)
            {
                System.out.println("Deleted element......................" + START.rollno);
            }
            else
            {
            Nodee ptr=START;
            Nodee current= START;
            while(current.next!=null)
               {
                ptr=current;
                current=current.next;
                
               }
            
            System.out.println("Deleted element............" + current.rollno);
            if (START.next==null)
            {
                START=null;
            }
            else
            {
                ptr.next=null;
            }
            
        }
    }
    void traversenode ()
    {
        if(START==null)
        {
            System.out.println("doubly list empty");
        }
        else
        {
            //forward
            System.out.println("-------------------Forward-------------------");
            Nodee current=START;
            for(current=START; current.next!=null; current= current.next)
            {
                System.out.println(" "+ current.rollno);
            }
            //reverse
            System.out.println();
            System.out.println("---------------Reverse--------------------");
            Nodee last;
            for(last=current;last.previous!=null; last=last.previous)
            {
                System.out.println(" "+ last.rollno);
            }
        }
    }
   void searchnode ()
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
           
           Nodee current;
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
        DoublyLinkedList obj= new DoublyLinkedList();
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
            
            if (ch==1)
            {
                obj.addnode();
            }
            else if(ch==2)
            {
                obj.deletenode();
            }
            else if(ch==3)
            {
                obj.traversenode();
            }
            else if(ch==4)
            {
                obj.searchnode();
            }
            else if(ch==5)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong Choice");
                    
            }
        }
    }
}
