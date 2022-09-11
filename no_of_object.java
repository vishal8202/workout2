import java.io.*;
import java.util.*;
class no_of_object
  {
     static int count;
	 no_of_object()
	   {
	     count+=1;
	   }
	 public static void main(String args[])
	  {
	    no_of_object ob1=new no_of_object();
		no_of_object ob2=new no_of_object();
		no_of_object ob3=new no_of_object();
	    no_of_object ob4=new no_of_object();
		no_of_object ob5=new no_of_object();
		no_of_object ob6=new no_of_object();
		System.out.println("\n Number of object = "+count);
	  }
   }