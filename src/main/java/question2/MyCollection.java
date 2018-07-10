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
	 int addcount = 0;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
		// arrayList = new ArrayList<String>(Arrays.asList(numArray));
	}

	public int search(String searchingNum) {
		// TODO Auto-generated method stub
		for(int i= 0;i<getCount();i++)	{
			if(numArray[i] == searchingNum)
				return 1;
		}
		return -1;
	}

	public boolean add(String numberToAdd) {
		// TODO Auto-generated method stub
	
		for(int i = 0;i< numArray.length;i++) {
			
			if(numArray[i] == numberToAdd) {
				return false;
			}
		}
		
		if(addcount < numArray.length) {
			System.out.println("in the if");
		numArray[addcount] = numberToAdd;
		addcount++;
		
		}
		else {
			 doubleCapacity();
		
			numArray[addcount] = numberToAdd;
			
			
			addcount++;
	
			
			
		}
		return true;
		

	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub
		 String[] tmp = new String[2*numArray.length];
		    System.arraycopy(numArray,0,tmp,0,numArray.length); 
		   numArray = tmp;
	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		int count =0;
		  for(int i=0; i<numArray.length; i++)
	       {
	           if(numArray[i] == numberToRemove)
	           {
	               for(int j=i; j<(numArray.length-1); j++)
	               {
	            	   numArray[j] = numArray[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	         return false;
	       }
	       else
	       {
	           return true;
	           
	       }
	}

	public int getCount() {
		// TODO Auto-generated method stub
		//System.out.println(arrayList);
		return numArray.length;
	}

	public String[] rotate(int n) {
		// TODO Auto-generated method stub
		for(int i = 0;i<numArray.length;i++) {
			System.out.println(numArray[i]);
		}
		
		leftRotate(numArray, n, numArray.length);
		return numArray;
	}
	
	  void leftRotate(String arr[], int d, int n) 
	    {
	        for (int i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	 
	    void leftRotatebyOne(String arr[], int n) 
	    {
	        int i;String temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[i] = temp;
	    }
	 
	
	public String toString( ) {
		
		String str = "{";
		
		int count  = 0;
		 for(int i = 0;i<numArray.length;i++){  
			  count++;
			
			  String element = numArray[i];
			 
			  if(element != null) {
				  if(i == 0) {
				  str = str + element;
				  }
				  else {
					  str = str+  "," + element ;
				  }
			  }
		
		   
		  } 
		  str += "}";
		  System.out.println(str);  
		  return str;
		
	}

}
