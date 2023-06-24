//This class have 
//Custom Exception 
//Multilevel inheritance - Passing objects as parameters in constructors in super().
//Passing object and basic datatypes as parameters to constructors.
//Returning objects from method.
//Class Declaration and object declaration.
//Overriding methods and associated object creation.

package ipl;

public class TeamInfo
{
	public static void main(String[]args)
	{
		Info o1 = new Info(2008,2013,"Cricket",'C');
		Info1 o2 = new Info1(2008,2013,"IPL",'I',2022);
		Info o3 = new Info(o1);	
		
		o1.TeamInfo();
		o1.print();
		o3.print();
		
		o2.TeamInfo();
		o2.print();
		
		
		//Custom Exception 
		try {
			throw new Exception("Cricket is one of the popular game of the world!\nThrowing Exception");
			}
		
		catch(Exception e) 
		{
			System.out.println("Cricket...!!!\nException got caught\n");
			System.out.println(e.getMessage());
		}	
		
		
		
	}
}

 class Info
{
	protected Object a1;
	protected Object b1;
	protected Object str1;
	protected Object char1;
	void TeamInfo()
	{
		System.out.println("This is Cricket Tourniment \n");
	}
	Info(Info Obj)
	{
		a1 = Obj.a1;
		b1 = Obj.b1;
		str1 = Obj.str1;
		char1 = Obj.char1;

	}
	
	Info(int x,int y,String str,char c)
	{
		this.a1 =x;
		this.b1 =y;
		this.str1 = str;
		this.char1=c;
	}
	
	
	void print()
	{
		System.out.println(" a1 " + a1 + " b1 " + b1 + "str1 " + str1 + "char1 " + char1);
		System.out.println("In Info Class");
	}
	
}

class Info1 extends Info
{
	//private static final String String = null;
	
	private int y;
	private char c;
	private int z;
	private String str;
	private String x;
	
	void TeamInfo()
	{
		System.out.println("Cricket Tourniment's name is Indian Premier League \n");
	}
	
	Info1(int x,int y,String str,char c,int z)
	{
		super(x,y,str,c);
		//this.x =x;
		//this.y =y;
		//this.str = str;
		//this.c =c;
		this.z  = z;
		
	}
	
	/*Info1(Info1 Obj)
	{
		a1 = Obj.a1;
		b1 = Obj.b1;
		str1 = Obj.str1;
		char1 = Obj.char1;
		this.z=z;
				
	}*/
	void print()
	{
		System.out.println(" x " + this.x +" y "+ this.y + " str " + this.str + " c "+ this.c + " z " + this.z);
		System.out.println("In Info1 Class");
	}	
}