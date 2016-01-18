package com.core.java.Generics;

class GenericTest<T extends Number>{
	T obj;
	
	GenericTest(T obj){
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void show()
	{
		System.out.print("the type of obj is: "+obj.getClass().getName());
	}
	
	
	
}

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*GenericTest<String> g1 = new GenericTest<String>("Vishnu");
		g1.show();
		System.out.println(g1.getObj());
		*/
		
		GenericTest<Byte> g0 = new GenericTest<Byte>((byte) 10);
		g0.show();
		System.out.println(" : "+g0.getObj());
		
		GenericTest<Integer> g2 = new GenericTest<Integer>(100);
		g2.show();
		System.out.println(" : "+g2.getObj());
		
		GenericTest<Double> g3 = new GenericTest<Double>(10.65);
		g3.show();
		System.out.println(" : "+g3.getObj());
		
		GenericTest<Float> g4 = new GenericTest<Float>(10.65f);
		g4.show();
		System.out.println(" : "+g4.getObj());
		

	}

}
