package interview;

public class ArraylargestElement {
	public static void main(String[] args) {
		
		int [] arr = new int [] {52, 22, 33, 99, 88, 77};
	    
		int largevalue = arr[0];
	    
		int minvalue =arr [0];
	    
		for (int i = 0; i < arr.length; i++) {
	     
	      if(arr[i] > largevalue)
	       
	    	  largevalue = arr[i];
	    }
	    System.out.println("Largest element of given array: " + largevalue);
	    
	    for(int j=0;j<arr.length;j++) {
	    
	    	if(arr[j]<minvalue) 
	    	
	    		minvalue=arr[j];
	    }
	    System.out.println("minimum element of given array :" + minvalue);
	    }
	}


