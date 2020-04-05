
public class staticAnalysis {

	// It is the static class
	// Unlike top level classes, Inner classes can be Static. Non-static nested
	// classes are also known as Inner classes.
	static class newStaticClass {
		int newVariable = 10;

		public newStaticClass(int x) {
			System.out.println("variable vlaue before : " + newVariable);

			this.newVariable = x;

			System.out.println("variable vlaue after : " + newVariable);
		}

		public void variableValueNow() {
			System.out.println("adding 30 :" + (30 + newVariable));

		}

	}

	// Since static variables are shared across all the instances of Object, they
	// are not thread safe.

	// static block -executes at the time of class loading
	static {
		System.out.println("this is just a static block-1 executing at class loads");
	}
	static {
		System.out.println("this is just a static block-2 executing at class loads");
	}

	static int x = 20; // This is static so it can be used both inside static/non-static methods
	int y = 20;

	// this is non static method
	public void nonStaticMethod() {
		x = x + 5;
		System.out.println("Inside non-staic method x is " + x);

		y = y + 10;
		System.out.println("Inside non-staic method y is" + y);

	}

	// It is static method
	public static void main(String[] args) {

		x = x + 2;
		System.out.println("Inside main method x is" + x);
		// System.out.println(y); Error :Cannot make a static reference to the
		// non-static field y

		staticAnalysis st = new staticAnalysis();
		st.nonStaticMethod();
		// new staticAnalysis.newStaticClass(100);
		staticAnalysis.newStaticClass t = new staticAnalysis.newStaticClass(100);
		t.variableValueNow();
		// new staticAnalysis()

	}

}
