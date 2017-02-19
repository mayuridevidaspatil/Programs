/* Name : Poonam I. Patil
   Roll_no : 08
   Div : B
*/
import java.util.*;

abstract class shape
{
   double dim1,dim2;
   shape(double a, double b)
   {
       dim1=a;
       dim2=b;
   }

   abstract void area();
}

class rectangle extends shape
{
     rectangle(double a, double b)
     {

         super(a,b);
     }
     
      void area()
      {
           System.out.println("Area of rectangle is : "+(dim1*dim2));
      
      }


}
class triangle extends shape
{
     triangle(double a, double b)
     {

         super(a,b);
     }
     
      void area()
      {
           System.out.println("Area of triangle is : "+((dim1*dim2)/2));
      
      }


}

class abst
{
    public static void main( String args[])
    {

          shape ref;

          double a,b;

          Scanner in = new Scanner(System.in);

          System.out.println("\n enter 1st input no. : ");
          a=in.nextInt();

          System.out.println("\n enter 2nd input no. : ");
          b=in.nextInt();

          ref=new rectangle(a,b);
          ref.area();
          ref=new triangle(a,b);
          ref.area();


    }
}

/* ***** OUTPUT *****

 student@student-Pegatron:~$ javac abst.java
 student@student-Pegatron:~$ java abst

  enter 1st input no. : 
  5

  enter 2nd input no. : 
  5
  Area of rectangle is : 25.0
  Area of triangle is : 12.5

*/
