package collection;

//import util package
import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		System.out.println("Welcome");
		/*
		creating collection
		1> Type Safe ====>> same type of elements/object
		2> Un Type Safe
		*/
		
		//Type safe collection
		ArrayList<String> names = new ArrayList<String>();
		names.add("hari");
		names.add("hari1");
		names.add("hari11");
		names.add("hari111");
		names.add("Ram");
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.contains("Ram"));
		
		//un type safe
		LinkedList list = new LinkedList<>();
		list.add("Hari");
		list.add(11);
		list.add(11.11);
		list.add(true);
		System.out.println(list);
		
		///////////////////////////////////////////////////////
		
		
		Vector<String> vect = new Vector<String>();
		vect.addAll(names);
		System.out.println(vect);
		
		HashSet<Double> nms = new HashSet<>();
		nms.add(14.14);
		nms.add(34.111111);
		nms.add(1.1);
		nms.add(2.1);
		nms.add(3.1);
		
		
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		
	}

}
