import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> ts  = new HashSet<>();
		//LinkedHashSet<String> ts = new LinkedHashSet<>();
		//TreeSet<String> ts = new TreeSet<>();
		ts.add("ram");
		ts.add("shyam");
		ts.add("amit");
		ts.add("ram");
		ts.add("ram");
		ts.add("tim");
		ts.add("mike");
		ts.add("shyam");
		ts.add("shyam");
		ts.add("mike");
		ts.add("john");
		ts.add("john");
		System.out.println(ts);

	}

}
