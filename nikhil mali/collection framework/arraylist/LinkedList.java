import java.util.LinkedList;
class LinkedList
 {
 public static void main (String args[])
 {
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
}
}