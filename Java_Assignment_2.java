Q1
package java1;

public class Shape {
	
		private
			int width,height;

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape m1=new Shape();
		m1.setWidth(200);
		m1.setHeight(300);
		
System.out.println(m1.getWidth());
System.out.println(m1.getHeight());

	}

}

Q2
package java1;

public class Myclass {
	
		private int num,num1;
		Myclass()
		{
			System.out.println("Def called");
		}
		Myclass(int num)
		{
			this.num=num;
			System.out.println("one value inti");
		}
		Myclass(int a,int b)
		{
			num=a;
			num1=b;
			System.out.println("two value inst");
		}
		public int getNum()
		{
			return num;
		}
		public int getNum1()
		{
			return num1;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m1=new Myclass();
		Myclass m2=new Myclass(200);
		Myclass m3=new Myclass(300,100);
		
		System.out.println(m1.getNum());
		System.out.println(m2.getNum());
		System.out.println(m3.getNum()+"  "+m3.getNum1());
		
	}

}

Q3
package java1;

public class Emp {
	private static int cnt=13;
	
	static int getCnt()
	{
		return cnt;
	}
	
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Emp.getCnt());
	}

}

Q4
package java1;

public class DemoOb {
	private int num;
	DemoOb()
	{
		System.out.println("def cons");
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOb m1=new DemoOb();
		m1.setNum(100);
		DemoOb m2=m1;
		m2=new DemoOb();
		m2.setNum(50);
		System.out.println(m1.getNum());
		System.out.println(m2.getNum());
	}

}
Q5
package java1;

class A {
	private int num=10;
	private static int num1=50;
	A()
	{
		System.out.println("def A cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
}
class B{
	private int num=56;
	static int num1=89;
	B()
	{
		System.out.println("def B cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
}
class C{
	private int num=45;
	private static int num1=47;
	C()
	{
		System.out.println("def C cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
}

	
	
	
public class Demo5{	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		System.out.println(a1.getNum());
		System.out.println(A.getNum1());
		B b1=new B();
		System.out.println(b1.getNum());
		System.out.println(B.getNum1());
		C c1=new C();
		System.out.println(c1.getNum());
		System.out.println(C.getNum1());
		
		
		
	}

}

Q6
package java1;

class A {
	private int num=10;
	private static int num1=50;
	A()
	{
		System.out.println("def A cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
	static {
		System.out.println(" A static");
	}
}
class B{
	private int num=56;
	static int num1=89;
	B()
	{
		System.out.println("def B cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
	static {
		System.out.println(" B static");
	}
}
class C{
	private int num=45;
	private static int num1=47;
	C()
	{
		System.out.println("def C cons");
	}
	public int getNum()
	{
		return num;
	}
	public static int getNum1()
	{
		return num1;
	}
	static {
		System.out.println(" C static");
	}
}

	
	
	
public class Demo5{	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		System.out.println(a1.getNum());
		System.out.println(A.getNum1());
		B b1=new B();
		System.out.println(b1.getNum());
		System.out.println(B.getNum1());
		C c1=new C();
		System.out.println(c1.getNum());
		System.out.println(C.getNum1());
		
		
		
	}

}

