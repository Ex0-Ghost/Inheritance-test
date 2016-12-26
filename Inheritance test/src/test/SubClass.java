package test;

public class SubClass extends SuperClass {
	int var =2;
	String name = "SUB";
	static void hidden(){//this method hides an inherited method
		 System.out.println("this is Sub class Hidder Method");
	 }
 void overridden() {//overrides inherited method 
		System.out.println("Inherited and overridden method in Subclass" + name);
	}

 void SubMethod() {

		System.out.println("Sub Class defined method" + name);//prints "SUB" which hides superclass field (name)
	}
}
