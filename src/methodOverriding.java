
class A {

	public void show() {
		System.out.println("class A --show method");
	}

	public void extraInA() {
		System.out.println("inside A -extra method");
	}
}

class B extends A {
	public void show() {
		System.out.println("class B --show method");
	}

	public void show2() {
		System.out.println("class B --show2 method");
	}

}

class C extends A {
	public void show() {
		System.out.println("class c --show method");
	}

	public void show2() {

		super.show();
	}

}

class methodOverriding {
	public static void main(String[] args) {
		C c = new C();
		c.show2();
		c.show();

		B b = new B();
		b.show();
		b.show2();

		A a = new C();                            //RUN time polymorphism
		a.show(); // C's show method
		// a.show2(); // will not be visible
		a.extraInA(); // inherited from parent reference
		
		B bObj = (B) new A(); // casting can be done here but it will throw the run time  java.lang.ClassCastException: 
									//A cannot be cast to B
		bObj.extraInA();
		

	}

}