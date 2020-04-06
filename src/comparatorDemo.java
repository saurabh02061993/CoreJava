import java.util.Arrays;
import java.util.Comparator;

/*Comparable vs Comparator
 * Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of
 * sorting. For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
 * Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
 * We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically
 * uses the compareTo() method of the class. For Comparator, client needs to provide the Comparator class to use in compare() method.
 */

public class comparatorDemo {

	private int id;
	private String name;
	private int salary;
	private int age;

	public comparatorDemo(int id, String name, int age, int salary) {
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

	public static Comparator<comparatorDemo> SalaryComparator = new Comparator<comparatorDemo>() {

		@Override
		public int compare(comparatorDemo e1, comparatorDemo e2) {
			return (int) (e1.getSalary() - e2.getSalary());
		}

	};
	public static Comparator<comparatorDemo> idComparator = new Comparator<comparatorDemo>() {

		@Override
		public int compare(comparatorDemo e1, comparatorDemo e2) {
			return (int) (e1.getId() - e2.getId());
		}

	};
	public static Comparator<comparatorDemo> ageComparator = new Comparator<comparatorDemo>() {

		@Override
		public int compare(comparatorDemo e1, comparatorDemo e2) {
			return (int) (e1.getAge() - e2.getAge());
		}

	};

	public static Comparator<comparatorDemo> nameComparator = new Comparator<comparatorDemo>() {

		@Override
		public int compare(comparatorDemo e1, comparatorDemo e2) {
			return (int) (e1.getName().compareTo(e2.getName()));
		}

	};

	public static Comparator<comparatorDemo> nameAndIdComparator = new Comparator<comparatorDemo>() {

		@Override
		public int compare(comparatorDemo o1, comparatorDemo o2) {
			int flag = o1.getId() - o2.getId();
			if (flag == 0)
				flag = o1.getName().compareTo(o2.getName());
			return flag;
		}
	};

	public static void main(String[] args) {

		comparatorDemo[] empArr = new comparatorDemo[3];

		empArr[0] = new comparatorDemo(5, "Mikey", 25, 10000);
		empArr[1] = new comparatorDemo(20, "Arun", 29, 20000);
		empArr[2] = new comparatorDemo(20, "Aasa", 35, 1000);

		System.out.println("sort by salary");
		Arrays.sort(empArr, comparatorDemo.SalaryComparator);
		System.out.println(Arrays.toString(empArr));
		System.out.println("\nsort by age");
		Arrays.sort(empArr, comparatorDemo.ageComparator);
		System.out.println(Arrays.toString(empArr));
		System.out.println("\nsort by id");
		Arrays.sort(empArr, comparatorDemo.idComparator);
		System.out.println(Arrays.toString(empArr));
		System.out.println("\nsort by name");
		Arrays.sort(empArr, comparatorDemo.nameComparator);
		System.out.println(Arrays.toString(empArr));

		System.out.println("\nsort by IdAndName");
		Arrays.sort(empArr, comparatorDemo.nameAndIdComparator);
		System.out.println(Arrays.toString(empArr));

	}

}
