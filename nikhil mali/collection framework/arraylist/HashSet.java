
import java.util.*;

class HashSet
 {
 public static void main (String args[])
 {

			// hash set example 
			
	Set<Integer> a = new HashSet<Integer>();
	
	a.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,11,13}));
	
	Set<Integer> b = new HashSet<Integer>();
	
	b.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));
	
	System.out.println("A set : "+a);
	System.out.println("B set : "+b);
	    //union 2 array into one
	Set<Integer>union = new HashSet<>(a);
	union.addAll(b);
	System.out.println("Union Set: "+union);
	
		//intersection 2 array
	Set<Integer>intersection = new HashSet<>(a);
	intersection.retainAll(b);
	System.out.println("Intersection Set: "+intersection);
	
		//symmetric diffrance of 2 array
	Set<Integer>diffrance = new HashSet<>(b);
	diffrance.removeAll(a);
	System.out.println("Symmetric Diffrance Set: "+diffrance);
	
}
}