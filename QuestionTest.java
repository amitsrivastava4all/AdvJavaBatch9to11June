import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class QuestionTest {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		for(int i = 1,j=5; i<=5; i++,j--){
			productList.add(new Product(i,"MOBILE"+i,9000+(j*10),i));
		}
		Collections.sort(productList);
		
		Order order = new Order(1001,"Order-1",productList);
		Map<Integer,Order> orderMap = new LinkedHashMap<>();
		orderMap.put(order.getId(),order);
		HashSet<Address> officeSet = new HashSet<>();
		officeSet.add(new Address("Delhi","Delhi","110007","A-10"));
		officeSet.add(new Address("Delhi","Delhi","110007","A-10"));
		HashSet<Address> resSet = new HashSet<>();
		resSet.add(new Address("Mumbai","Mumbai","220007","B-10"));
		resSet.add(new Address("Mumbai","Mumbai","220007","B-10"));
		HashMap<String,HashSet<Address>> addressMap = new HashMap<>();
		addressMap.put("office", officeSet);
		addressMap.put("res", resSet);
		Customer customer = new Customer(1001, "Ram", addressMap, orderMap);
		HashMap<Integer,Customer> customerMap = new HashMap<>();
		customerMap.put(customer.getId(), customer);
		Customer cust= customerMap.get(1001);
		System.out.println("Id "+cust.getId());
		System.out.println("Name "+cust.getName());
		System.out.println("Office "+cust.getAddressMap().get("office"));
		System.out.println("Res "+cust.getAddressMap().get("res"));
		System.out.println("Order 1001 "+cust.getOrderMap().get(1001));
		
//		Collections.sort(productList,
//				(first,second)->first.getName().compareTo(second.getName()));
//		Collections.sort(productList,
//				(first,second)->((Integer)first.getQt()).compareTo(second.getQt()));
		
		
	}

}
