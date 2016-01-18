package com.core.java.Fundamental;

class InstanceSuper{
	
}

public class InstanceofDemo extends InstanceSuper{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceofDemo in = new InstanceofDemo();
		InstanceSuper is = in;  //new InstanceofDemo();
		in.checkObject(is);

	}

	private void checkObject(InstanceSuper is) {
		// TODO Auto-generated method stub
		if(this == is){
			System.out.println("Both objects are same");			
		}
		else{
			System.out.println("Both Objects are not same");
		}
		if(is instanceof InstanceofDemo){
			System.out.println("This object is belongs to InstanceDemo");			
		}
		else{
			System.out.println("this object is not belongs to InstanceDemo");
		}
		if(this instanceof InstanceSuper){
			System.out.println("This object is belongs to InstanceSuper");			
		}
		else{
			System.out.println("this object is not belongs to InstanceSuper");
		}
		
	}

}
