/* Program to implement abstract class
   Name: Mayuri Devidas Patil
   Roll Number: 04
   Section: B(TE)
*/

import java.util.*;
abstract class stud
{

 abstract void info();


}

 class marks extends stud
{
    
    Scanner in=new Scanner(System.in);
    void info()
    {
      System.out.println("Enter the name of student:");
      String s=in.nextLine();
      System.out.println("String:"+s);
      System.out.println("Enter the roll number of student:");
      int i=in.nextInt();
      System.out.println("integer:"+i);
    }
   
    
}

class test 
{

    public static void main(String[] args)
    {
    
    stud ref = new marks();
      ref.info();
    }
}



/*    *** OUTPUT ***

student@student-HCL-Desktop:~$ javac test.java
student@student-HCL-Desktop:~$ java test
Enter the name of student:
Mayuri Patil
String:Mayuri Patil
Enter the roll number of student:
4
integer:4
*/
