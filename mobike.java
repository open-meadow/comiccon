
/**
 * Write a description of class mobike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class mobike
{
static int bno;
static int phno;
static String name;
static int days;
static int charge;
static void main()
{
Scanner sc=new Scanner(System.in);
mobike ob=new mobike();
System.out.println("Enter bike number");
bno=sc.nextInt();   
System.out.println("Enter phone number");
phno=sc.nextInt();   
System.out.println("Enter name");
name=sc.next();   
System.out.println("Enter number of days the bike was taken at rent");
days=sc.nextInt();
ob.compute(bno,phno,name,days);
}

void compute(int bno,int phno,String name,int days)
{
mobike ob=new mobike();
if(days>0&&days<=5)
charge=500*days;
else if(days>5&&days<=10)
charge=(500*5)+(400*days);
else if(days>10)
charge=(500*5)+(400*5)+(200*days);
ob.display(bno,phno,name,days,charge);
}

void display(int bno,int phno,String name,int days,int charge)
{
System.out.println("Bike number "+bno);
System.out.println("Phone number "+phno);    
System.out.println("Name "+name);    
System.out.println("Days "+days);    
System.out.println("Charge "+charge);
}
}        