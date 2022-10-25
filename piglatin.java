
/**
 * Write a description of class piglatin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class piglatin
{
static String wd;
static Scanner sc=new Scanner(System.in);
piglatin(String s)
{
wd=s;
}
void display(String wd)
{
wd=wd.toLowerCase();
char b;int l=wd.length();
String str="";String str1="";
for(int i=0;i<l;i++)
{
b=wd.charAt(i);
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
{
str=wd.substring(i,l);
str1=wd.substring(0,i);
break;
}
}
System.out.println("The piglatin form"); 
System.out.println(str+str1+"ay");
}
static void main()
{
System.out.println("Enter a string");
String s=sc.nextLine();
piglatin ob=new piglatin(s);
ob.display(wd);
}
}
      