package com.core.java.Concepts;

class Singleton{
	private static Singleton str = null;
	
	private Singleton(){		
		
	}
	
	/*public static Singleton getMethod(){
		
		if(str == null)
			return str = new Singleton();
		
		return str;				
	}*/

	public static synchronized Singleton getInstance() {
		if (null == str) {
			synchronized (Singleton.class) {
				if (null == str) {
					str = new Singleton();
				}
			}
		}
		return str;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		// that'll teach 'em
		//throw new CloneNotSupportedException();
		return this;
			
	}
}

public class SingletonDemo /*implements Cloneable*/{

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		/*SingletonDemo sd = new SingletonDemo();
		SingletonDemo sd1 = (SingletonDemo)sd.clone();
		System.out.println(sd.hashCode()+" : "+sd1.hashCode());*/
				
		//Singleton s1 = Singleton.getMethod();
		Singleton s1 = Singleton.getInstance();
		//Singleton ss = new Singleton();
		Singleton s2  = (Singleton)s1.clone();
		
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		
		if (s1 == s2)
			System.out.println("both objects are equal");
		else
			System.out.println("both objects are not equal");
		

	}

}
