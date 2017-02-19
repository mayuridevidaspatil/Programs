//program for the abstract class and abstract method.

abstract class Shape  // abstract class
 {
    abstract void draw();  //abstract method
    void callmetoo()
    {
	System.out.println("this is concrete method");
    }
}
class Rectangle extends Shape
{
void draw()
 {
        System.out.println("drawing rectangle");
  }
}
class TestAbstraction1
{
public static void main(String args[])
{
 Shape s=new Rectangle();// object created
 s.draw();
 s.callmetoo();
}
}

/*output
G:\java programs>javac TestAbstraction1.java
G:\java programs>java TestAbstraction1
drawing rectangle
this is concrete method
*/
