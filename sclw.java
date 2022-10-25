
/**
 * Write a description of class sclw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class sclw
{
static void main()
{
Scanner ob=new Scanner(System.in);
String n="";int max=0;String st;
System.out.println("Enter a sentence which ends with a fullstop");
while(true)
{
st=ob.next();
if(st.length()>max)
{
max=st.length();
n=st;
}
if(st.equals("."))
break;
}
System.out.println("Longest word "+n);
System.out.println("Length "+max);
}
}    
