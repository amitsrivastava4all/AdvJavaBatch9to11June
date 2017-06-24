import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();
		//ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(12);
		l.add(15);
		l.add(1);
		l.add(10);
		l.add(10);
		for(int i : l){
			System.out.println(i);
			l.add(1000);
		}
		System.out.println(l);
		//System.out.println(l);
		int thirdElement = l.get(2);  // Array 3rd element (Integer) store int (AutoBoxing)
		System.out.println(thirdElement);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(11);
		ts.add(20);
		ts.add(10);
		ts.add(20);
		Iterator<Integer> i = ts.iterator();
		int sum = 0;
		while(i.hasNext()){
			int j = i.next();  // Reterive Current Element and Go on Next Element
			i.remove();
			if(j==10){
				break;
			}
			/*if(j>10){
				sum+=j;
			}*/
		}
		System.out.println(ts);
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(11);
		ns.add(20);
		ns.add(10);
		ns.add(20);
		ns.add(1);
		ns.add(5);
		ns.add(2);
		// Navigation 
		int val = ns.ceiling(5); // >=
		System.out.println("Ceiling "+val);
		val = ns.floor(2);  // <=
		System.out.println("Floor "+val);
		val = ns.higher(5); //> 
		System.out.println(" Higher "+val);
		val = ns.lower(5);  //<
		System.out.println(" Lower "+val);
		
	}

}
