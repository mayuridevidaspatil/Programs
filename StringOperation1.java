
//program for the string operation in java

import java.util.*;
class StringOperation1
{
public static void main(String []args)
{
System.out.println("enter two  string");

Scanner input=new Scanner(System.in);
String str1=input.nextLine();
String str=input.nextLine();

String str2=str1.toUpperCase();
String str3=str1.toLowerCase();
System.out.println("new string in uppercase= "+str2);
System.out.println("new string in lowercase= "+str3);

int a=str1.length();
System.out.println("legth of string = "+a);

char x=str1.charAt(2);
System.out.println("character at position 2 is ="+x);

String str4=str1.trim();
System.out.println("trimmed string is ="+str4);

String str5= str1+str;
System.out.println("concatenated string "+str5);

if(str1.equals(str))
System.out.println("two strings are equal");
else
System.out.println("two strings are not equal");

if(str1.equalsIgnoreCase(str))
System.out.println("two strings with igoring case are equal");
else
System.out.println("two strings with igoring case are not equal");

}
}



/* output


G:\java programs>javac StringOperation1.java

G:\java programs>java StringOperation
Error: Could not find or load main class StringOperation

G:\java programs>java StringOperation1
enter two  string
ssbt coet
jalgaon
new string in uppercase= SSBT COET
new string in lowercase= ssbt coet
legth of string = 9
character at position 2 is =b
trimmed string is =ssbt coet
concatenated string ssbt coetjalgaon
two strings are not equal
two strings with igoring case are not equal

*/
