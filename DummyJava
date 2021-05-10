import java.util.Scanner;
class node
{
    int rn;
    node next;

}
public class dubmy {
    node start;
    dubmy()
    {
     start=null;   
    }
    public void insert()
    {
        node newnode=new node();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data to be inserted");
        int roll=sc.nextInt();
        newnode.rn=roll;
        newnode.next=null;
        start=newnode;
    
            
        if (start==null)
        {
            start=newnode;
        }
        else
        {
            node temp;
            temp=start;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void delete()
    {
        System.out.println("deleted element is"+start.rn);
        start=start.next;
    }
    public void traverse()
    {
        if(start==null)
        {
            System.out.println("empty");
        }
        else
        {
            
            for(node current=start;current.next!=null;current=current.next)
            {
                System.out.println("element is"+current.rn);
                
            }
        }
    }
}
