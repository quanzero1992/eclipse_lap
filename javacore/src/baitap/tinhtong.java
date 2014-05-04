package baitap;

public class tinhtong 
{
tinhgt t1 =new tinhgt(3);
public tinhtong()
{
t1.start();
try
{
t1.join();
long P=t1.getResult();
System.out.print("\nket qua "+P);
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[]arg)
{
new tinhtong();
}
}
class tinhgt extends Thread
{
int n;
long gt;
public tinhgt(int k) 
{
k=n;
}
public void run()
{
for(int i=2;i<=n;i++)
{
gt*=i;
}
System.out.print("\nF1 "+gt);
}
public long getResult()
{
return gt;
}
}
