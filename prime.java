
/**
 * Write a description of class prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class prime
{
int n;
prime()
{
n=0;
}

void input(int x)
{
n=x;
}

void display()
{
int k=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
k++;
}
if(k==2)
System.out.println("Prime"); 
else
System.out.println("Not Prime");       
}
}    
 