
/**
 * Write a description of class scsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class scsa
{
static void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter a sentence");
String s=ob.nextLine();
int l=s.length();
char b;String str="";
for(int i=0;i<l;i++)
{
b=s.charAt(i);
str=str+b;
if(b==' ')
{
if(str.charAt(0)=='a'||str.charAt(0)=='A')
System.out.println(str);
str="";
}
}
System.out.println("Bye bye");
}
}    
