abstract class  Example
{
	abstract void m1();
	{
		 System.out.println("Hi");
	 }

	 void m2(){
		 System.out.println("hello");
}
}
class Sample extends Example{
   void m1(){
		 System.out.println("Sample m1 Hi");
	 }

	 void m2(){
		 System.out.println(" Sample m2 hello");
}
}
class Test2
{
	public static void main(String[]args)
	{
		Example e=new Sample();
		e.m1();
		e.m2();
	}
}


