/*Aim:Program for implementation of funtion overloading and overwriding
  Name:Patil Mayuri Devidas
  Section:TE(B)
  Roll No: 04*/

import java.util.*;
import java.io.*;


class intro
{
  Scanner s=new Scanner(System.in);
  void disp()
  {
   System.out.println("Enter the name of the student:");
   String c=s.nextLine();
   System.out.println("Name of the student is:"+c);
  }
}



class marks extends intro
{
  
  void disp1()
  {Scanner s1=new Scanner(System.in);
    System.out.println("Enter the marks of the student:");
    int i=s1.nextInt();
   System.out.println("Marks of the student is:"+i);
  }
}



class first extends marks
{

  void disp3()
  {  Scanner s2=new Scanner(System.in);
    System.out.println("Enter the percentage of student:");
    float f=s2.nextFloat();
    System.out.println("Percentage of the student is:"+f);
  }
 public static void main(String args[])
 {
  System.out.println("Student Information:");
  intro o=new intro();
  o.disp();
  
  marks m=new marks();
  m.disp1();

  first f1=new first();
  f1.disp3();
   
 }
} 


/***** OUTPUT *****
student@student-HCL-Desktop:~$ javac first.java
student@student-HCL-Desktop:~$ java first
\Student Information:
Enter the name of the student:
Mayuri Patil
Name of the student is:\Mayuri Patil
Enter the marks of the student:
88
Marks of the student is:88
Enter the percentage of student:
9.09
Percentage of the student is:9.09
student@student-HCL-Desktop:~$ */


