package test;

public class SuperClass {
	int var = 1;//this is hidden in subclass can be called in subclass object using superclass reference type

	String name = "SUPER";
 static void hidden(){//this method is hidden in sublcass can be called statically superclass (or in superclass objects),
	 //can also be called in subclass objects if superclass reference type is used.Why?
	 System.out.println("this is Super class Hidden Method");
 }
void inherited() {//this method is inherited but not overridden in subclass
	/*
	 * Question: even if this method was called in a subclass's object still name refers to superclass name which is hidden in subclass
	 * Whether its called by superclass reference type or sub class reference type see Main class
    */
		System.out.println(" inherited method: this is Super class" + name);
		
	}

 void overridden() {//this method is inherited and overridden in subclass
	 //so no way to use this in subclass even with superclass reference type 
		System.out.println("Inherted and overridden method in Super class");
	}
}
