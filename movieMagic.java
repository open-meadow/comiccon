
/**
 * Write a description of class movieMagic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class movieMagic
{
static int year;static String title;static float rating;
static Scanner sc=new Scanner(System.in);
movieMagic()
{
year=0;
title="";
rating=0;
}
void accept()
{
System.out.println("Enter the year in which the movie was released");
year=sc.nextInt();
System.out.println("Enter the name of the movie");
title=sc.nextLine();
System.out.println("Enter the rating of the movie");
rating=sc.nextFloat();
}
void display()
{
System.out.println(title);
System.out.println("Released in "+year);
if(rating>=0&&rating<=2)
System.out.println("Flop movie");  
else if(rating>=2.1&&rating<=3.4)
System.out.println("Mediocre movie");
else if(rating>=3.5&&rating<=4.5)  
System.out.println("Good movie");
else if(rating>4.5)
System.out.println("Masterpiece");
}   
static void main()
{
movieMagic ob=new movieMagic();
ob.accept();
ob.display();
}
}
