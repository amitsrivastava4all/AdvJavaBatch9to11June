import java.util.ArrayList;

//class MyStack<T extends Number>{
class MyStack<T>{
	T data;
	ArrayList<T> tList = new ArrayList<>();
	public T push(T data){
		this.data = data;
		tList.add(this.data);
		return this.data;
	}
	public T pop(){
			if(tList.size()==0){
				//return null;
				
				throw new RuntimeException("Size is Empty !");
			}
			return tList.remove(tList.size()-1);
		
		
	}
	public void peep(){
		for(T t : tList){
			System.out.println(t);
		}
	}
	
}
public class TemplateDemo {

	public static void main(String[] args) {
		MyStack<String> s  = new MyStack<>();
		s.push("ram");
		s.push("shyam");
		s.push("mike");
		System.out.println("Pop "+s.pop());
		System.out.println("Peep");
		s.peep();
		System.out.println("***************************");
		MyStack<Integer> s1  = new MyStack<>();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		System.out.println("Pop "+s1.pop());
		System.out.println("Peep");
		s1.peep();
	}

}
