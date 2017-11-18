package nov_12;

public class ClassA2 extends ClassA1{

	public void method1(){
		super.method1();
		System.out.println("Hi");
	}
	
	public static void main(String args[]){
		ClassA2 obj = new ClassA2();
		obj.method1();
	}
}
