import java.util.ArrayList;
import java.util.Iterator;

class arrayListString
 {
 public static void main (String args[])
 {
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