package javaP;

public class ClassA1 {

	public void method1(){
		
		String[] arr = {"a", "c", "d", "e"};
		System.out.println(arr[0]);
		
		//Print all values
		int arrLength = arr.length;
		
		/*for(int i = 0; i<arrLength; i++){
			System.out.println(arr[i]);
		}*/
		
		/*for ( string  : arr) {
			System.out.println(arr);
		}*/
		
		String s = "There are 365 days in a year.";
		//365
		
		/*char[] arr1 = s.toCharArray();
		for(int i = 0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}*/
		
		//Extract subString from a string
		
		String arrSub = s.substring(10, 14);
		System.out.println(arrSub);
	}
	
	public void sortArray(){
		int[] arr2 = {3,7,1,5,2};
		
		for(int i = 0; i<arr2.length; i++){
			
			for(int j = 0; j<arr2.length-1; j++){
				
				if(arr2[j] > arr2[j+1]){
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}
		for(int k = 0; k<arr2.length; k++){
			System.out.println(arr2[k]);
		}
	}
	
	public void factorialSeries(){
		int fact = 1;
		int calcFact = 5;
		
		if(calcFact == 0){
			System.out.println("Fact is = 1");
		}
		
		else{
			for (int i= calcFact; i >= 1; i--){
				fact = fact * i;
			}
			
			System.out.println("Fact is = " + fact);
		}
	}
	public static void main(String args[]){
		ClassA1 obj = new ClassA1();
		//obj.method1();
		//obj.sortArray();
		obj.factorialSeries();
	}
}
