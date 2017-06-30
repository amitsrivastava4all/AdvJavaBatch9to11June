import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Customer {
	
	private String name;
	private int id;
	private Map<String,HashSet<Address>> addressMap = new HashMap<>();
	private Map<Integer, Order> orderMap = new LinkedHashMap<>();
	public Customer(int id, String name, Map<String,HashSet<Address>> addressMap, Map<Integer, Order> orderMap){
		this.id = id;
		this.name = name;
		this.addressMap = addressMap;
		this.orderMap = orderMap;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, HashSet<Address>> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<String, HashSet<Address>> addressMap) {
		this.addressMap = addressMap;
	}
	public Map<Integer, Order> getOrderMap() {
		return orderMap;
	}
	public void setOrderMap(Map<Integer, Order> orderMap) {
		this.orderMap = orderMap;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", addressMap=" + addressMap + ", orderMap=" + orderMap + "]";
	}
	

}
