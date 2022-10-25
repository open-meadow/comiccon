
/**
 * Write a description of class scanner_palin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class scpalin
{
int palin(int a)
{
int f=0;int r;int s=0;int t=a;
while(t>0)
{
r=t%10;
s=s*10+r;
t=t/10;
}
if(s!=a)
f=1;
return(f);
}
int pal(String q)
{
int i;String str="";int f=0;
int l=q.length();char b;
for(i=0;i<l;i++)
{
b=q.charAt(i);
str=str+b;
}    
if(str.equalsIgnoreCase(q))
f=1;
return(f);
}
static void main()
{
Scanner ob=new Scanner(System.in);
scpalin ob1=new scpalin();
int a;int n;String s;int b;
System.out.println("Enter 1 for finding palindrome number and 2 for finding palindrome word");
int e=ob.nextInt();
switch(e)
{
case 1:
System.out.println("Enter a number");
a=ob.nextInt();
n=ob1.palin(a);
if(n==0)
System.out.println("Palindrome");
else
System.out.println(" NotPalindrome");    
break;
case 2:
System.out.println("Enter a word");
s=ob.next();
b=ob1.pal(s);
if(b==1)
System.out.println("Palindrome");
else
System.out.println(" NotPalindrome");    
break;
default:
System.out.println("Try again");
}
}
}
 