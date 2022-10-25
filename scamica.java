
/**
 * Write a description of class scamica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class scamica
{
boolean amica(int q,int r)
{
int i;int j;int s=0;int s1=0;int f=1;int g=1;
for(i=1;i<q;i++)
{
if(q%i==0)
s=s+i;
}    

for(i=1;i<r;i++)
{
if(r%i==0)
s1=s1+i;
}    

if(s==r&&s1==q)
return(true);
else 
return(false);


}    
static void main()
{
Scanner ob=new Scanner(System.in);
scamica ob1=new scamica();
System.out.println("Enter two numbers");
int a=ob.nextInt();
int b=ob.nextInt();

boolean o=ob1.amica(a,b);

if(o==true)
System.out.println("Amicable");
else
System.out.println("Not Amicable");
} 
}   
