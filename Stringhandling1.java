package com.pack1;

public class Stringhandling1 
{
void meth1()
{
	//string which were created by using string classname immutable
	String s1="java";
	System.out.println("Before concadination s1:"+s1);
	System.out.println(s1.concat(" is awesome"));
	//s1=s1.concat("is awesome");
	System.out.println("After concadination s1:"+s1);
}
public static void main(String[] args) 
{
	Stringhandling1 aobj=new Stringhandling1();
	aobj.meth1();
}
}
