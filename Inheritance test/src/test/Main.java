package test;

public class Main {

	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		SubClass sub = new SubClass();
		/*
		//this gives same result
		SubClass sub = new SubClass();
		SuperClass sup = sub;
		*/
		
		System.out.println("==Testing Super Class reference Type==");
		System.out.println(sup.var);//prints the hidden superclass field because we're using superclass reference type
		sup.inherited();
		sup.overridden();
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
