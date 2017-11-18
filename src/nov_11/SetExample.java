package nov_11;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetExample {

	@Test
	public void listExample(){
		//Dec Set
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("C");
		mySet.add("T");
		mySet.add("D");
		mySet.add("F");
		
		System.out.println(mySet.size());
		
		//System.out.println(mySet.getClass());  =Note
		
		System.out.println(mySet);
		
		//mySet.re
	}
}
