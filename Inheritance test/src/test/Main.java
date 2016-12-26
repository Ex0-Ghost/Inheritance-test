package test;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		SuperClass sup = sub; //now sup is just pointing to the same object as sub does
		/*
		//this gives same result
		SubClass sub = new SubClass();
		SuperClass sup = sub;
		*/
		
		System.out.println("==Testing Super Class reference Type==");
		System.out.println(sup.var);//prints the hidden superclass field because we're using superclass reference type
		sup.inherited();
		sup.overridden();// virtual method- invocation 
		sup.hidden();//invokes superclass method because superclass reference type is used
		// this causes compile time error, maybe compiler\jvm recognizes members by reference type
		// sup.SubMethod()
		
		System.out.println("==Testing Sub Class reference Type==");
		System.out.println(sub.var);//prints the subclass field because we're using subclass reference type
		sub.inherited();
		sub.overridden();
		sub.SubMethod();
		sub.hidden();//invokes subclass method

	}

}
