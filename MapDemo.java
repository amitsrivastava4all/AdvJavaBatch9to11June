import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> phones = new ArrayList<>();
		phones.add(2222); //0th index
		phones.add(4444);  //1st Index
		phones.add(5555);
		phones.add(6666);
		System.out.println(phones.get(1));
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(30);
		temp.add(35);
		temp.add(18);
		// Key Can't be Duplicate, But value is duplicate
		HashMap<String,List<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> amitPhones = new ArrayList<>();
		amitPhones.add(22222);
		amitPhones.add(5555);
		phoneMap.put("amit", amitPhones);
		//ArrayList<Integer> ramPhones = new ArrayList<>();
		Integer vv[] = {6666,7777,9999};
		List<Integer> list = Arrays.asList(vv);
		//phoneMap.put("amit", 5555);
		phoneMap.put("ram", list);
		//phoneMap.put("shyam", 5555);
		System.out.println(phoneMap);
		
	}

}
