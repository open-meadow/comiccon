
/**
 * Write a description of class magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class magic
{
static int num,n;
magic(int n)
{
num=n;
}
void inputno()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
}
void display(int num)
{
int r;int s=0;int k=0;
while(num!=0)
{
r=num%10;
s=s+r;
num=num/10;
}
while(s!=0)
{
r=s%10;
k=k+r;
s=s/10;
}
if(k==1)
System.out.println("Magic no.");
else
System.out.println("Not Magic no.");
}
static void main()
{
magic ob=new magic(n);
ob.inputno();
ob.display(n);
}
}
