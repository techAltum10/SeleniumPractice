package nov_12;

public class ClassA3 {
//https://www.dynatrace.com/resources/ebooks/javabook/how-garbage-collection-works/
	int i = 10;
	
	public void method1(){
		try{
			int t = i/0;
			System.out.println(t);
		}
		/*catch(Exception ex){
			System.out.println("Can not divide by ZERO.");
		}
		*/
		finally{
			System.out.println("Always");
		}
	}
	
	public static void main(String args[]){
		ClassA3 obj = new ClassA3();
		obj.method1();
	}
}
//finally - BLOCK - Code written inside this block will get execute always.
//finalize() - method - It is called by GarbageCollector class(Thread) before collecting eligible objects.

