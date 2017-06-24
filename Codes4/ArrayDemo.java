import java.io.Serializable;
import java.util.ArrayList;
class M{
	
}
class T extends M implements Serializable{
	
}
class A extends T
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
class D
{
	
}
class ArrayUse
{
	static void showArray(A[] arr){
		
	}
	static void showArrayList(ArrayList<?> aList){
	//static void showArrayList(ArrayList<Object> list){
	//static void showArrayList(ArrayList<? extends Serializable> aList){
	//static void showArrayList(ArrayList<? super A> aList){
	//static void showArrayList(ArrayList<? extends A> aList){
		
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		ArrayList<M> mList = new ArrayList<>();
		ArrayUse.showArrayList(mList);
		ArrayList<T> tList = new ArrayList<>();
	ArrayUse.showArrayList(tList);
	ArrayList<A> aList = new ArrayList<>();
	ArrayUse.showArrayList(aList);
	ArrayList<B> bList = new ArrayList<>();
	ArrayUse.showArrayList(bList);
	
	ArrayList<C> cList = new ArrayList<>();
	ArrayUse.showArrayList(cList);
	
	ArrayList<D> dList = new ArrayList<>();
	ArrayUse.showArrayList(dList);
	
	
	A [] arr = {new A(),new A()};	
	ArrayUse.showArray(arr);
	B [] arr1 = {new B(), new B()};
	ArrayUse.showArray(arr1);
	C [] arr2 = {new C(), new C()};
	ArrayUse.showArray(arr2);
	//D [] arr3 = {new D(), new D()};
	//ArrayUse.showArray(arr3);
	
	
	

	}

}
