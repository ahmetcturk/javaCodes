package week_12Tuesday;

class Lister<E>{
	// Field in type of E
	private E e;
	
	public E getE(){
		return e;
	}
	
	public void setE(E e){
		this.e = e;
	}
	
	
}

public class GenericClass1 {

	public static void main(String[] args) {
		Lister<Integer> integerLister = new Lister<Integer>();
		integerLister.setE(4298);
		System.out.println(integerLister.getE());
		
		Lister<Object> object = new Lister<Object>();
		object.setE(true);

	}

}
