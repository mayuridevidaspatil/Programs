
// program for packege creation and use in java

package info; //creating package
public class Student
{
     private int x;
     private int y;
     private int z; 
       public Student(int a,int b)
	{
	  x=a;
	  y=b;
          z=x+y;

	}
       
	 public void addition()
	{
	  System.out.println("addtion="+z);
	}
}
