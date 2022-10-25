
/**
 * Write a description of class Honda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class Honda
{
static int type;
static int cost;
static void gettype()
{
Scanner sc=new Scanner(System.in);
Honda ob=new Honda();
System.out.println("Enter the type of engine");
type=sc.nextInt();
ob.find(type);
}

void find(int type)
{
Scanner sc=new Scanner(System.in);
Honda ob=new Honda();
System.out.println("Enter the cost of the engine");
cost=sc.nextInt();
ob.printcost(type,cost);
}

void printcost(int type,int cost)
{
double finalcost;double rate;
if(type==2)
{
rate=(double)10/100*cost;
finalcost=rate+cost;
System.out.println("Type of vehicle "+type+"stroke");
System.out.println("Previous cost "+cost);
System.out.println("Rate of increment "+rate);
System.out.println("New cost "+finalcost);
}
else if(type==4)
{
rate=(double)12/100*cost;
finalcost=rate+cost;
System.out.println("Type of vehicle "+type+"-stroke");
System.out.println("Previous cost "+cost);
System.out.println("Rate of increment "+rate);
System.out.println("New cost "+finalcost);
}
else
System.out.println("Enter again");
}
}
    
