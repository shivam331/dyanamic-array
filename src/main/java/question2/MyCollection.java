package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 *
 */
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	ArrayList<String> arrayList;
	 int addcount = 0;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
		// arrayList = new ArrayList<String>(Arrays.asList(numArray));
	}

	public int search(String searchingNum) {
		// TODO Auto-generated method stub
		arrayList = new ArrayList<String>(Arrays.asList(numArray));
		if(arrayList.contains(searchingNum))
		{
			return 1;
		}
		
		return -1;
	}

	public boolean add(String numberToAdd) {
		// TODO Auto-generated method stub
	
		for(int i = 0;i< numArray.length;i++) {
			System.out.println(numArray[i]);
			if(numArray[i] == numberToAdd) {
				return false;
			}
		}
//		System.out.println(arrayList);
//		if(arrayList.contains(numberToAdd)) {
//			System.out.println(arrayList);
//			System.out.println("returning false");
//			
//		}
		if(addcount < numArray.length) {
		numArray[addcount] = numberToAdd;
		addcount++;
		return true;}
		else {
			arrayList = new ArrayList<String>(Arrays.asList(numArray));
			arrayList.add(numberToAdd);
			addcount++;
		numArray	= arrayList.toArray(numArray);
			return true;
			
		}
		
//		if(addcount <= arrayList.size()) {
//		arrayList.add(addcount, numberToAdd);
//		 if(arrayList.contains(numberToAdd)) {
//			addcount++;
//			System.out.println(addcount + "  " + arrayList.size());
//			 System.out.println("returning true");
//			
//		}
//		 return true;}
//		else {
//			arrayList.add(numberToAdd);
//			return true;
//		}
		//return false;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub

	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		arrayList = new ArrayList<String>(Arrays.asList(numArray));

		if(arrayList.remove(numberToRemove)) {
			numArray	= arrayList.toArray(numArray);
			
			return true;
		}
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		System.out.println(arrayList);
		return numArray.length;
	}

	public String[] rotate(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString( ) {
		//String str =String.join(", ", arrayList);
		 System.out.println(arrayList);
		String str = "{";
		//Iterator itr=arrayList.iterator(); 
		//int size = arrayList.size();
		 
		int count  = 0;
		 for(int i = 0;i<numArray.length;i++){  
			  count++;
			
			  String element = numArray[i];
			 
			  if(element != null) {
				  if(count == numArray.length) {
				  str = str + element;
				  }
				  else {
					  str = str + element + ",";
				  }
			  }
		
		   
		  } 
		  str += "}";
		  System.out.println(str);  
		  return str;
		
	}

}
