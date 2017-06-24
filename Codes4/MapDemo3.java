import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("amit", 1111);
		map.put("ram", 2111);
		map.put("shyam", 3111);
		Set<String> set = map.keySet();
		
		Iterator<String> keys = set.iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println("Key "+key+" Value "+map.get(key));
		}
		System.out.println("***********************************");
		for(Map.Entry<String, Integer> i: map.entrySet()){
			System.out.println(i.getKey()+ " "+i.getValue());
		
		}

	}

}
