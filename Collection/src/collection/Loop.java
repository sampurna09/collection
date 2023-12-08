package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Loop {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("aaaaaab");
		names.add("bbbbbbbc");
		names.add("cccccd");
		names.add("ddddde");
		names.add("eeeeeef");
		
		//for each loop
		
		for(String strNames:names) {
			System.out.print(strNames+"\t"+strNames.length()+"\t");
			StringBuffer br = new StringBuffer(strNames);
			System.out.println(br.reverse());
		}
		
		System.out.println("=======================================");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String next= itr.next();
			System.out.println(next);
		}
		
		
		System.out.println("+++++++++++++++++");
		
		///back ward 
		
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious()) {
			String previous = litr.previous();
			System.out.println(previous);
		}
		
		
		///for each
		System.out.println("////////////////////////////////////////");
		
		names.forEach(e->{
			System.out.println(e);
		});
		
	}

}
