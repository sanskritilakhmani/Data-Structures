
import java.util.Scanner;
public class Arrayexample2 {
    //constructor ---> we do not call constructor it will be called automatically by variable
    Arrayexample2()
    {
        Scanner sc= new Scanner(System.in);
        String str[] = new String[5];
        
        System.out.println("Enter ur names..");
        for(int i=0; i<5 ; i++)
        {
            str[i]=sc.next();
        }
        //output
        System.out.println("------------Records-----------");
        for(String var : str)
        {
            System.out.println(var);
        }
    }
    public static void main(String args[])
    {
        Arrayexample2 obj=new Arrayexample2();
      
    }
}
