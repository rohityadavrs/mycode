//wap in java to take input of string type and display string with msg.

import java.lang.*;
import java.util.*;
class Input
{
public static void main(String[]arr)
{
	String name;
System.out.print("enter your name :");
// creat the object scanner class
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.print("hello ! "+name);
}
}