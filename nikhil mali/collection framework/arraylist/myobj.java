import java.util.*;
class myobj
{
public static void main (String args[])
{
	/*
	
	// arrayList example 
	ArrayList <Integer> a1 = new ArrayList <Integer>();

	a1.add(600);
	a1.add(200);
	a1.add(500);
	a1.add(300);
	a1.add(100);

	System.out.println("List of Value : "+a1);
	System.out.println("Size of Value : "+a1.size());
	System.out.println("200 present : "+a1.contains(200));
	System.out.println("1200 present : "+a1.contains(1200));
	System.out.println("remove : "+a1.remove(2));
	System.out.println("List Value  : "+a1);
	Collections.sort(a1);
	System.out.println("Sorted element"+a1);
	// a1.removeAll(a1);
	// System.out.println("Remopve all : "+a1);
	
	//  iterator example 
	Iterator <Integer> it = a1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	 a1.add(7);
	 a1.add(24);
	 a1.add(10);
	 a1.add(8);
	 a1.add(5);
	 a1.add(65);
	 int count = 0;
	 System.out.println("Number :"+a1);
	 
	 Iterator<Integer> it = a1.iterator();
	 while(it.hasNext())
	 {
		 Integer i = it.next();
		 if(i<10)
		 {
			 it.remove();
			 count++;
		 }
	 } System.out.println("Number :"+a1);
	 System.out.println("Total number delete Count :"+count);
}
}


	  // arrayList in string example 



	ArrayList <String> s1 = new ArrayList<>();
	s1.add("nikhil");
	s1.add("mohit");
	s1.add("varad");
	s1.add("atharv");
	s1.add("gaurav");
	System.out.println("print :"+s1);
	s1.add(0,"ajay");
	System.out.println("Insert 1st "+s1);
	System.out.println("remove :"+s1.remove(3));
	System.out.println("print :"+s1);
	
	Iterator<String> it = s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}	


		//vector example
		
	Vector <Integer> v = new Vector<>();
	v.add(50);
	v.add(10);
    v.add(20);
	v.add(60);
	v.add(100);
	System.out.println("Element :" +v);
	System.out.println("Size : "+v.size());
	v.insertElementAt(90,2);
	System.out.println("Element Added : "+v);
	v.removeElementAt(1);
	System.out.println("Element Removed : "+v);
	v.removeAllElements();
	System.out.println("All Element Removed :"+v);

	Vector v1 = new Vector ();
	Vector v2 = new Vector ();
	Vector v3 = new Vector ();
	
	v1.add("red");
	v1.add("yellow");
	v1.add("white");
	v1.add("blue");
	v1.add("brown");
	System.out.println("List of Colour :"+v1);
	v1.removeElementAt(2);
	
	v2.add("orange");
	v2.add("pinapple");
	v2.add("apple");
	v2.add("mango");
	v2.add("strabery");
	v2.add("banana");
	v2.add("grapes");
	System.out.println("List of Fruit :"+v2);
	
	v3.add(v1);
	v3.add(v2);
	System.out.println("List:"+v3);
	


				// linked list example 
				
		LinkedList <String> obj =  new LinkedList<>();
		obj.add("a");
		obj.addLast("b");
		obj.addFirst("c");
		obj.add(2,"d");
		obj.add("e");
		obj.add(1,"f");
		System.out.println("List:"+obj);
		
			   obj.remove("b");
		       obj.removeFirst();
		       obj.removeLast();
			   obj.remove("f");
		       obj.remove("d");
		System.out.println("List:"+obj);
		
	
	
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
	
*/

			//Assignment linked list
			
		LinkedList <Integer> obj =  new LinkedList<>();
		obj.add(10);
		obj.add(50);
		obj.add(1,40);
		obj.addLast(90);
		System.out.println("List:"+obj);
		
		Iterator<Integer> it = obj.iterator();
		while(it.hasNext())
		{
			 System.out.println(it.next());
		}
		

		 System.out.println("Iteration at position 2 ");
		 Iterator <Integer> itt = obj.listIterator(2);
		 while(itt.hasNext())
		 {
			System.out.println(itt.next());
		 }
		
		obj.addFirst(15);
		obj.addLast(65);
		System.out.println("New List : "+obj);
	}
}