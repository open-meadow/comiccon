
/**
 * Write a description of class passbyref here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class passbyref
{
int[] aray(int x[])
{
for(int i=0;i<10;i++)
x[i]=x[i]+2;
return(x);
}
static void main()
{
Scanner sc=new Scanner(System.in);
passbyref ob=new passbyref();
int m[]=new int[10];int i;
System.out.println("Enter 10 numbers");
for(i=0;i<10;i++)
m[i]=sc.nextInt();
int c[]=ob.aray(m);
for(i=0;i<10;i++)
System.out.print(c[i]+" ");
}
}    
