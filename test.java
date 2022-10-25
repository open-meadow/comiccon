
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
int a;int b;

test()
{
a=0;
b=0;
}

test(int a,int b)
{
this.a=a;
this.b=b;
}

void display()
{
int i;int j;int k;int l=0;
for(i=a;i<=b;i++)

k=i;
for(j=i;j<=b;i++)
{
if(k%j==0)
l++;
if(l==2)
{
System.out.println(k);
break;
}
}
}
}

void main()
{
test ob=new test();
test ob1=new test(1,10);
ob1.display();
}
}    