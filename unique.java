
/**
 * Write a description of class unique here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.*;
public class unique
{
    static String s;static String org;static int l;
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        unique ob=new unique();
        System.out.println("Enter a word");
        s=sc.nextLine();
        ob.Arrange(s);
    }

    void Arrange(String s)
    {
        unique ob=new unique();
        l=s.length();
        int i,j,c;
        String s1;org=s;
        for(i=0;i<(l-1);i++)
        {
            s1=s.substring(0,i+1);
            c=0;
            for(j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    continue;
                }
                else
                s1=s1+s.charAt(j);
            }
            s=s1;
            if(c>0)
            l=l-c;
        }
        ob.Display(s,org);
    }
        

    void Display(String s,String org)
    {

        System.out.println("Original word "+org);
        System.out.println("New word "+s);        
    }
}
