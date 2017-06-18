import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CRUD {
	static int sum2 = 0;
	public static void main(String[] args) {
		Object o = 100;
		o="Hello";
		o = true;
		//List<String> songsList = new ArrayList<>();
		//songsList = new Vector<>();
		//songsList = new LinkedList<>();
		ArrayList<String> songsList = new ArrayList<>();
		//list.add(100);
		//list.add(90.20);
		songsList.add("It's My Life");
		songsList.add("Bang Bang");
		songsList.add(0,"Boom Boom");
		System.out.println(songsList);
		//songsList.remove(0);
		//songsList.remove("Bang Bang");
		songsList.set(0, "Hi");
		System.out.println(songsList);
		Collections.sort(songsList);
		System.out.println("After Sort "+songsList);
		if(songsList.contains("Hi")){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		Integer x[] = {10,20,30,40,50};
		List<Integer> l = Arrays.asList(x);
		System.out.println(l);
		int sum = 0;
		// 1st way
//		for(int i = 0; i<l.size(); i++){
//			sum = sum + l.get(i);
//		}
		//2nd Java 1.4
//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()){
//			sum = sum + i.next();
//		}
		// 3rd
//		ListIterator<Integer> j= l.listIterator();
//		while(j.hasNext()){
//			sum = sum + j.next();
//		}
//		while(j.hasPrevious()){
//			sum = sum + j.previous();
//		}
		
		
		//4th way (Enhance for Loop) 1.5
//		for(int i : l){
//			sum = sum + i;
//		}
		// Java 1.8 
		l.forEach((q)->{
			sum2 = sum2 + q;
		});
		System.out.println(sum2);
		
		
		//int t = (Integer)list.get(0);
	}

}
