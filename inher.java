import java.util.*;
import java.io.*;


public class intro
{
  Scanner s=Scanner(Sysetm.in);
  void disp()
  {
   system.out.println("Enter the name of the student:");
   char c=s.nextChar();
   system.out.println("Name of the student is:"+c);
  }
}

public class marks extends intro
{
  Scanner s1=Scanner(System.in);
  void disp1()
  {
    system.out.println("Enter the marks of the student:");
    int i=s1.nextInt();
    system.out.println("Marks of the student is:"+i);
  }
}


public class first extends marks
{
  Scanner s2=Scanner(System.in);
  void disp3()
  {
    system.out.println("Student Information:");
    system.out.println("Name of the student is:"+c);
    system.out.println("Marks of the student is:"+i);
  }
 public static void main(String args[])
 {
  marks m=new marks();
  m.disp3();
 }
} 

