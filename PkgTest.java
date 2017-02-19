

// importing the created package
import info.*; 
class PkgTest
{
	public static void main(String []args)
	{
	  Student s= new Student(14,15);  //object created
	  s.addition();
	}
}


/* output 
G:\my package\info>javac Student.java
G:\my package>javac PkgTest.java
G:\my package>java PkgTest
addtion=29

*/
