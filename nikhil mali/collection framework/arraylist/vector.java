import java.util.Vector;

class vector
 {
 public static void main (String args[])
 {

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
	
}
}