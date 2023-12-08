package collection;

import java.util.HashMap;



public class MapExample {
public static void main(String[] args) {
	//Dublicate keys are not allowed
	HashMap<String, Integer> courses = new HashMap<>();
	courses.put("Math", 1000);
	courses.put("Science", 30000);
	courses.put("English", 5000);
	System.out.println(courses);
	courses.forEach((e1,e2)->{
		System.out.println(e1+"===>"+e2);
	});
}
}
