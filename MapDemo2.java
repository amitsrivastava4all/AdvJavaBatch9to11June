import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		synchronized (list) {
			list.add("gdfg");
		}
		list.add("hfhfgh");
		//List<String> l = Collections.synchronizedList(list);
		
		//Hashtable<String,Integer> map = new Hashtable<>();  //1.2 Synchronized + key can't be null, and no null value
		HashMap<String,Integer> map = new HashMap<>();
		map.put(null, null);
		//HashMap<String,Integer> map = new HashMap<>();
		//LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		//TreeMap<String,Integer> map = new TreeMap<>();
		String t = new String("mike");
		map.put("shyam", null);
		map.put(t, 39999);
		map.put("ram", null);
		map.put("amit", 99999);
		System.out.println(map);
		String t9 = new String("mike");
		System.out.println("%%%%%% "+map.get(t9));
		Map<String,Map<String,ArrayList<String>>> phoneMap = new HashMap<>();
		ArrayList<String> amitEmails = new ArrayList<>();
		amitEmails.add("amit@yahoo.com");
		amitEmails.add("amit@gmail.com");
		ArrayList<String> amitPhones = new ArrayList<>();
		amitPhones.add("4343");
		amitPhones.add("86786");
		HashMap<String,ArrayList<String>> emailPhoneMap = new HashMap<>();
		emailPhoneMap.put("email", amitEmails);
		emailPhoneMap.put("phone",amitPhones);
		
		phoneMap.put("amit", emailPhoneMap);
		
		System.out.println("Amit First Email is "
		+phoneMap.get("amit").get("email").get(0));
		System.out.println("Amit Second Phone is "+phoneMap.get("amit").get("phone").get(1));
		
		
		

	}

}
