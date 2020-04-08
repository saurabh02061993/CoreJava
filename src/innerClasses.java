
/* There are 3 types of inner classes we can have:
 * 
 *  1. Member inner class implementation
 *  2. Static inner class implementation
 * 	3. Anonymous inner class implementation
 */

class AB {
	public int i = 10;

	public void show() {
		System.out.println("class A show method");

	}

	class BC { // class inside a class AB

		public void hello() {
			System.out.println("Inner class Hello world and i is " + i);
		}

		public void show() {
			System.out.println("Inner class B show method");

		}
	}

}

/*
 * 
 * Static inner classes
 * 
 * 
 */

class CD {

	public static int i = 10; // Need to make it static to share it between classes.

	public void show() {
		System.out.println("class A show method implementing for static inner class");

	}

	static class DE { // class inside a class AB

		public void hello() {
			System.out.println("Static Inner class Hello world and i is " + i);
		}

		public void show() {
			System.out.println("Static Inner class B show method");

		}
	}

}

/*
 * Anonymous inner class A class that have no name is known as anonymous inner
 * class in java. It should be used if you have to override method of class or
 * interface. Java Anonymous inner class can be created by two ways: 1. Class
 * (may be abstract or concrete). 2. Interface
 */

abstract class normal {
	abstract void show();

}

interface saurabhInterface {
	void implementSaurabh();

}

class innerClasses {

	public static void main(String[] args) {

		/*
		 * Member inner class
		 * 
		 */

		AB a = new AB();
		System.out.println(a.i);
		a.show();
		AB.BC b = a.new BC();
		b.hello();
		b.show();

		/*
		 * Static inner class
		 * 
		 */
		System.out.println("\n************* Static inner class *********************\n");
		CD cd = new CD();
		cd.show();
		CD.DE obj = new CD.DE();
		obj.hello();
		obj.show();

		/*
		 * Anonymous inner class
		 * 
		 */
		System.out.println("\n************* With abstract class *********************\n");

		normal n = new normal() {

			public void show() {
				System.out.println("TestAnonymousInner class shhow method");

			}
		};

		n.show();

		System.out.println("\n********* with interface Anonymous *************************\n");
		saurabhInterface sp = new saurabhInterface() {

			@Override
			public void implementSaurabh() {
				System.out.println("Implementing interface method in inner Anonymous class ");

			}
		};
		sp.implementSaurabh();

	}

}
