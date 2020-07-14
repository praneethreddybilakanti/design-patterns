class Test 
{
private static volatile Test t;
 private Test()
	{
System.out.println("private constructor");

	}
public static Test getInstance()
	{
synchronized(Test.class)
		{
if(t==null)

	t=new Test();

	return t;
	}
	}
	public void display()
	{


		System.out.println("this is the singleton design pattern example");
	}
	@Override
	public String  toString()
	{

		return "Test";
	}
}
	public class Lazy
	{
	

	public static void main(String[] args) 
	{

Test t=Test.getInstance();
System.out.println(t);
System.out.println(t.hashCode());
t.display();
Test t1=Test.getInstance();
System.out.println(t1);
System.out.println(t1.hashCode());
	}
}
