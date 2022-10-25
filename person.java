
/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class person
{
static String name;
static double inc;
static String mf;
static int age;
static void accept()
{
Scanner sc=new Scanner(System.in);
person ob=new person();
System.out.println("Enter name,age and income");
name=sc.nextLine();
age=sc.nextInt();
mf=sc.next()

inc=sc.nextDouble();
ob.compute(name,age,mf,inc);
}

void compute(String name,int age,String mf,double inc)
{
person ob=new person();
double ainc=inc*12;
ob.display(name,age,mf,inc,ainc);
}

void display(String name,int age,String mf,double inc,double ainc)
{
System.out.println("Name "+name);
System.out.println("Age "+age);
System.out.println("Gender "+mf);
System.out.println("Monthly income "+inc); 
System.out.println("Annual income "+ainc);     
}
}
