import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee firstObject, Employee secondObject){
		return firstObject.getName().compareToIgnoreCase(secondObject.getName());
		//return firstObject.getName().compareTo(secondObject.getName());
		//return secondObject.getName().compareTo(firstObject.getName());
	}
}

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee firstObject, Employee secondObject){
		return ((Double)firstObject.getSalary()).compareTo(secondObject.getSalary());
	}
}

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	private String city;
	Employee(int id , String name, double salary, String city){
		this.id = id;
		this.name = name;
		this.salary = salary ;
		this.city = city;
				
	}
	@Override
	public int compareTo(Employee emp){
		return ((Integer)this.id).compareTo(emp.id);
	}
	
	@Override
	public boolean equals(Object object){
		Employee emp ; 
		if(object instanceof Employee){
			emp= (Employee) object ; // Downcasting
			if(this.id == emp.id && 
					(this.name.equals(emp.name)) 
					&& this.salary==emp.salary 
					&& (this.city.equals(emp.city))){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name"+name+" Salary "+salary +" City "+city+"\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	
	
	
}
public class CRUDOperations {
	private static ArrayList<Employee> empList = new ArrayList<>();
	public static String addNewRecord(Employee emp){
		//Employee emp = new Employee(id, name, salary, city);
		empList.add(emp);
		return "Record Added...";
	}
	public static ArrayList<Employee> getEmpList(){
		return empList;
	}
	
	public static void sortById(){
		Collections.sort(empList);  // Sort Comparable
	}
	
	public static void sortByName(){
		Collections.sort(empList,new SortByName()); // Sort Comparator
	}
	
	public static void sortBySalary(){
		//Collections.sort(empList, new SortBySalary());
		/*Collections.sort(empList,new Comparator<Employee>() {
			@Override
			public int compare(Employee firstObject, Employee secondObject){
				return ((Double)firstObject.getSalary()).compareTo(secondObject.getSalary());
			}
		});*/
		Collections.sort(empList,(firstObject,secondObject)
				->((Double)firstObject.getSalary())
				.compareTo(secondObject.getSalary()));
	}
	
	public static double totalSalary(){
		double sum = 0.0;
//		for(int i = 0 ; i<empList.size(); i++){
//			sum += empList.get(i).getSalary();
//		}
//		for(Employee emp : empList){
//			sum+=emp.getSalary();
//		}
		 sum = empList
		.parallelStream()
		.filter((currentObject)->currentObject.getSalary()>3000)
		.mapToDouble((emp)->emp.getSalary()).sum();
		return sum;
	}
	
	public static String deleteRecord(Employee emp){
		int index = empList.indexOf(emp);
		if(index>=0){
			empList.remove(index);
			return "Record Deleted SuccessFully ";
		}
		else{
			return "No Record Found So Can't Delete...";
		}
	}
	
	public static String search(Employee emp){
		
		return empList.contains(emp)?"Record Found....":"No Record Found";
	}
	
	public static Employee takeInput(Scanner scanner){
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Enter the City");
		String city = scanner.next();
		Employee emp = new Employee(id, name, salary, city);
		return emp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		myloop:
		while(true){
		System.out.println("1. Add a New Record");
		System.out.println("2. Delete Record");
		System.out.println("3. Update Record");
		System.out.println("4. Search Record");
		System.out.println("5. Sum of Salary");
		System.out.println("6. Count Employee");
		System.out.println("7. Sort By Id");
		System.out.println("8. Sort By Name");
		System.out.println("9. Sort By Salary");
		System.out.println("10. Print All Records");
		System.out.println("11. Exit");
		System.out.println("Enter your Choice...");
		int choice = scanner.nextInt();
		switch(choice){
		case 1:
			Employee emp = takeInput(scanner);
			String message = addNewRecord(emp);
			System.out.println(message);
			break;
		case 2:
			System.out.println("Enter Info For Deletion...");
			Employee emp3 = takeInput(scanner);
			System.out.println(deleteRecord(emp3));
			break;
			
		case 4:
			Employee emp2 = takeInput(scanner);
			System.out.println(search(emp2));
			break;
		case 5:
			System.out.println("Total Salary "+totalSalary());
			break;
		case 7:
			sortById();
			System.out.println(getEmpList());
			break;
		case 8:
			sortByName();
			System.out.println(getEmpList());
			break;
		case 9:
			sortBySalary();
			System.out.println(getEmpList());
			break;
		case 10:
			System.out.println(getEmpList());
			break;
		case 11:
			System.out.println("Thanks for Using...");
			break myloop;
		}
		
		
		}
		
		
	}

}
