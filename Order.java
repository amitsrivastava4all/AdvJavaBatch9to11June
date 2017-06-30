import java.util.ArrayList;

public class Order {
	private int id;
	private String name;
	private ArrayList<Product> productList = new ArrayList<>();
	public Order(int id, String name, ArrayList<Product> productList){
		this.id = id;
		this.name = name;
		this.productList = productList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", productList=" + productList + "]";
	}
	

}
