//This file have
//Reading console input (next() , nextInt() and nextLine()) using Scanner class.

package ipl;
import java.util.*;


// Main Class
 public class IPL
{
	public static void main(String args[]) 
    {
     
		obj = new Scanner(System.in); // using scanner names are displayed 
     
		System.out.println("Enter the Total Teams ");
		int total = obj.nextInt();  //
		System.out.println("Enter the IPL Team Details ");
     
     for(int i=0;i<=total;i++) 
     {
    	 System.out.println("Details of the Team " + (i+1));
    	 
    	 System.out.println("Enter the Team Name ");
    	 String team = obj.nextLine();
    	 System.out.println("The IPL team is " + team);
    	 
    	 System.out.println("Enter the Team Coach ");
    	 String coach = obj.nextLine();
    	 System.out.println("The IPL team Coach is " + coach);
    	 
    	 System.out.println("Enter the Team Owner ");
    	 String owner = obj.nextLine();
    	 System.out.println("The Owner of the IPL team is " + owner);
    	 
    	 System.out.println("Enter the Home Ground");
    	 String home = obj.nextLine();
    	 System.out.println("Home ground is "+ home);
     
     
    	 System.out.println("Enter the Details of Team Now");
    	 
    	 
    	 Methods a1 = new Methods();  // printing values frm diff class
    	 a1.batsmen();
    	 a1.bowlers();
    	 a1.wk();
     
    	
    	 
     }
     
     
     Constrctrs a11 = new Constrctrs("RCB","Spirits");  // using constructors
     a11.print();
        
     Extend1 b = new Extend1("RCB","Spirits",18,"B'lore");
     b.print();
     
     Extend2 c = new Extend2("RCB","Spirits",18,"B'lore","FAF");
     c.print();
     
     
     
     
     Str k = new Str();
     k.string1();
     k.string2();
     k.string3(); 
     
     
    try {
      int[] sixes = {1, 2, 3};
      System.out.println(sixes[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("ABD is a BIG HITTER");
    }
    
    
    Main1 x = new Main1();
    x.checkAge(15); // Set age to 15 (which is below 18)
 
    }
   
    
	  public void shareToPack()
	    {
	    	System.out.println("Sharing to other package....!!!");
	    }
	  
	  
	  
	public String team;
	public int total;
	public String coach;
	public String owner;
	public String home;
	private static Scanner obj;
	
}


// Class having Scanner class,
 class Methods{
    
	
    Scanner s1 = new Scanner(System.in);
    IPL p1 = new IPL();
    public void batsmen()
    {
        
     System.out.println("Enter the total no of batsmen");
     int n= s1.nextInt();
     System.out.println("Enter the names of batsmen");
     int i=0;
         
     while(i<=n)
     {
         System.out.println("Batsmen are :");
         String batsmen= s1.nextLine();
         System.out.println( (i) + " Batsman is "+ batsmen);
         //System.out.println(bat[i])
        i++ ;
     }
     
     
    }
    
    
  
    
    
    
    
    public void bowlers()
    {
     System.out.println("Enter the total no of bowlers");
     int m= s1.nextInt();
     System.out.println("Enter the names of bowlers");
     for(int i=0;i<=m;i++)
     {
         String bowlers = s1.nextLine();
         System.out.println("Bowlers are :");
         System.out.println( (i) + " Bowler is "+ bowlers);
     }
    
    }
    
    public void wk()
    {
     System.out.println("Enter the wk name ");
     
     String wk= s1.nextLine();
     System.out.println("The wk is " + wk);
    }
    
    
}

//Class having 
class Constrctrs{
    
    String nam,own;
    
    Constrctrs(String nam, String own)
    {
        this.nam=nam;
        this.own=own;
    }
 
    void print()
    {
        System.out.println("The team name is "+ this.nam);
        System.out.println("The team owner is "+ this.own);
    }
    
}

//Class having single inheritance 
class Extend1 extends Constrctrs{
    int no;
    String home;
    
    Extend1(String nam, String own,int no,String home)
    {
        super(nam,own);       
        this.no=no;
        this.home=home;
    }    
    void print()
    {
        
        System.out.println("The team name is "+ this.nam);
        System.out.println("The team owner is "+ this.own);
        System.out.println("The team no is "+ this.no);
        System.out.println("The team home ground is "+ this.home);
    }
}
//Class having multi-level inheritance 
  class Extend2 extends Extend1
{
    String cap;
    Extend2(String nam, String own,int no,String home, String cap)
    {
        super(nam,own,no,home);
        this.cap=cap;
    }
    
    void print()
    {
        System.out.println("The team name is "+ this.nam);
        System.out.println("The team owner is "+ this.own);
        System.out.println("The team no is "+ this.no);
        System.out.println("The team home ground is "+ this.home);
        System.out.println("The team captain is "+ this.cap);
    }
    
}
//Any 2 string handling functions. 
//Class having string handling 
 class Str{
    
	public void string1()
    {
    	//IPL a= new IPL();//a.team;
        String z ="rcb"; 
        String z1 = "RCB";
        String z2 = new String(z);
        
        System.out.println(z + " Equals " + z2 + " -> " + z.equals(z1));
        System.out.println(z + " Equals " + z2 + " -> " + z.equals(z2));
        System.out.println(z + " Equals " + z2 + " -> " + z == z1);
    }
    
     public void string2()
    {
        String y = new String("Guruprasad");
        char[] ch= y.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
    }
    
   public  void  string3()
    {
        int runs=100;
        String s = "ABD and Virat had a  " + runs + "partnership";
        System.out.println(s);
        
        char ch ;
        String ss = new String("Royal Challengers Bangalore");
        ch = ss.charAt(4);
        System.out.println(ch);
    }
}

  
  
//Class having exception 
  
  
 class Main1
 {
   void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.\n To play Dream11 game ");
    }
    else {
      System.out.println("Access granted - You are old enough!!!\n \\n To play Dream11 game");
    }
  }
}
