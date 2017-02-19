import java.util.*;
public abstract class stud
{

 void info();

}

public class marks extends stud
{
    
    scanner in=new Scanner(System.in);
    void info()
    {
      system.out.println("Enter the name of student:");
      String s=in.nextLine();
      system.out.println("String:"+s);
      system.out.println("Enter the roll number of student:");
      int i=in.nextInt();
      system.out.println("integer:"+i);
    }
   
    
}

class test 
{

    public static void main(String[] args)
    {
    
      marks m=new marks();
      m.info();
    }
}



