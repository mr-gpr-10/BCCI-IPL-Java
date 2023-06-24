//This file have
//Multilevel inheritance - Passing objects as parameters in constructors in super().
//Returning objects from method.
//Usage of 'this' keyword.
//Interfaces with variables.
//Implementing interfaces with default methods.


package ipl;
import java.util.*;


 interface CricketTourni
{
	String s = " BCCI owns IPL \n "; 
	public void method();
	default void method1()
	{
		System.out.println("IPL is comming soon....!!! \n This is default method\n ");
	}
}
public class Teamwins
{
	public static void main(String args[])
	{
		//IPL obj = new IPL();
		//int totalTeams = 1;
	    obj1 = new Scanner(System.in) ;
	    System.out.println("Enter the Total Teams\n");
	    int totalTeams = obj1.nextInt();
		{
		
			System.out.println("Enter the Stats of the Teams ");
			// for(int i=0;i<= obj.total;i++) 
			for(int i=0;i< totalTeams;i++) 
			 {
			 System.out.println("Enter the Total games won by Team " + (i+1) + "\n");  
			 int wins=obj1.nextInt();
			 
			 System.out.println("Enter the Total games lost by Team " + (i+1) + "\n"); 
			 int lost=obj1.nextInt();
			 
			 System.out.println("Enter the Total Runrate of the Team" + (i+1) + " is " + "\n"); 
			 float runrate=obj1.nextFloat();
			 
			 
			 System.out.println("Enter the position of the Team " + (i+1) + " in the Points Table is " + "\n"); 
			 int position=obj1.nextInt();
			 
			 System.out.println("Total games won by Team " + (i+1) + " is " + wins); 
			 System.out.println("Total games lost by Team " + (i+1) + " is " + lost); 
			 System.out.println("Runrate of the Team " + (i+1) + " is " + runrate); 
			 System.out.println("Position of the Team " + (i+1) + " is " + position); 
			 System.out.println("\n");
			 System.out.println("\n");
					 
			 }
			
			Objectsss ob1 = new Objectsss(100, 22);
			Objectsss ob2 = new Objectsss(100, 22);
			Objectsss ob3 = new Objectsss(150, 265);
			Objectsss ob4;
			ob4 = ob1.obj();
			System.out.println("ob4.a: " + ob4.a);
			 
			System.out.println("ob1 == ob2: "  + ob1.equalTo(ob2));
			System.out.println("ob1 == ob3: "  + ob1.equalTo(ob3));
			 
			
			
			
			ob1.method();
			ob1.method1();
			System.out.println("IPL is an Wonderful Cricket Tourniment\nPrinting from Interface variable\n" + CricketTourni.s); 

			
			
		}
	}

	private static Scanner obj1;
}



class Objectsss implements CricketTourni
{
	int a,b;
	public String winnr;
	public String runnr;

	Objectsss(int i, int j)
    {
        a = i;
        b = j;
    }
	
	 boolean equalTo(Objectsss o)
	 { 
		 return (o.a == a && o.b == b);
	 }
	 public void Objects(String winnr, String runnr)
	 {		
		this.winnr=winnr;
		this.runnr=runnr;
	 }
	 public void method() 
	 {
 		System.out.println("IPL is Superbbb...!! \n Its interface method");
	 }
 	 Objectsss obj()
	 {
		Objectsss Ob = new Objectsss(2,4);
		return Ob;
	 }
}
