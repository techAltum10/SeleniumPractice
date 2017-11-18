package nov_12;

//final public class ClassA1 {
public class ClassA1 {

	//final int i = 10;
	int i = 10;
	
	//final public void method1(){
	public void method1(){
		i = 12;
		System.out.println(i);
	}
}
//In method overriding, always subClass method invoked.
/*
 * final - is a keyword, it has 3 uses
 * 1. Var - If a var is dec final then its value can not be changed.
 * 2. Method - If a method is dec final then it can not be override.
 * 3. Class - If a class is dec final then it can not inherit 
 */
