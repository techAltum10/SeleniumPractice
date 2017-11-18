package nov_11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListExample {
	
	@Test
	public void testList(){
		
		//Dec List
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("B");
		myL.add("C");
		myL.add("T");
		myL.add("D");
		myL.add("F");
		
		int listSize = myL.size();
		System.out.println(listSize);
		
		System.out.println(myL.get(2));
		
		System.out.println(myL);
		
		myL.remove(myL.size()-1);
		System.out.println(myL);
		
		//myL.re
	}
}
