import java.util.Arrays;

/*Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays or Collections sorting methods.
 * The Comparable interface has compareTo(T obj) method which is used by sorting methods, you can check any Wrapper, String or
 * Date class to confirm this. We should override this method in such a way that it returns a negative integer, zero, or a positive integer
 * if “this” object is less than, equal to, or greater than the object passed as an argument.
 */

public class comparableDemo implements Comparable<comparableDemo> {
	private int id;
	private String name;
	private int salary;
	private int age;

	public comparableDemo(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";

	}

	// name wise sorting
	@Override
	public int compareTo(comparableDemo o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	// id-wise sorting
	/*
	 * 
	 * public int compareTo(comparatorAndComparable o) {
	 * 
	 * return this.id-o.id;
	 */

	public static void main(String[] args) {

		comparableDemo[] empArr = new comparableDemo[4];

		empArr[0] = new comparableDemo(10, "Mikey", 25, 10000);
		empArr[1] = new comparableDemo(20, "Arun", 29, 20000);
		empArr[2] = new comparableDemo(5, "Lisa", 35, 5000);
		empArr[3] = new comparableDemo(1, "Pankaj", 32, 50000);
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr));

	}
	/*
	 * So now we know that if we want to sort java object array or list, we need to
	 * implement java Comparable interface to provide default sorting and we should
	 * implement java Comparator interface to provide different ways of sorting.We
	 * can also create separate class that implements Comparator interface and then
	 * use it.
	 * 
	 */

}
