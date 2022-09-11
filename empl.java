import java.io.*;
import java.util.*;
class employee
  {  
    String name,empid;
	float res,as1,as2,as3;
	float p,avg;
	int f=0;
    employee()
		   {
	         System.out.println("\n Enter the Employee Name ,ID and three assesment mark");
			 Scanner sc = new Scanner(System.in);
			 name=sc.nextLine();
             empid=sc.nextLine();		
		     as1=sc.nextFloat();
		     as2=sc.nextFloat();
		     as3=sc.nextFloat();
		   }
    void check()
		   {
		     res=as1+as2+as3;
		     p=((res*100)/300);
			 avg=res/3;
			 if (as1>=75&&as2>=75&&as3>=75)
			     {
				   f=2;
				 }
			 else
			     {
				    f=1;
			     }
		   }
	void show()
	       { 
		     System.out.println("\n\n    ..........EMPLOYEE DETAILS..........");
			 System.out.println("\n      NAME                 : "+name);
			 System.out.println("\n      Employee ID          : "+empid);
			 System.out.println("\n      Mark in Assesment 1  : "+as1);
			 System.out.println("\n      Mark in Assesment 1  : "+as2);
			 System.out.println("\n      Mark in Assesment 1  : "+as3);
			 System.out.println("\n      Average Mark         : "+avg);
		     System.out.println("\n      Total Mark           : "+res);
			 System.out.println("\n      Total Percentage     : "+p+"%");
             if (f==2)
			     {
				   System.out.println("\n Congratulations You are promoted");
				 }
			 else
			     {
				    System.out.println("\n You are demoted better luck next time");
			     }
            }
  }
 
public class empl
  {
    public static void main(String args[])
      {
        try 
		    { 	  
              employee em=new employee();
	          em.check();
			  em.show();
	        } catch (Exception e){}
      }
  }