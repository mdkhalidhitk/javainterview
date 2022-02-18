package StreamApiExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {

	public class Employee {

		private Long id;
		private String name;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Employee(Long id, String name) {

			this.id = id;
			this.name = name;
		}

	}
//SELECT DISTINCT(salary) AS salary
	//FROM tbl_salary
	//ORDER BY salary DESC
	//LIMIT 1 OFFSET (n - 1);
	public static String reverseWordCharacters(String str) {
		String tem = Pattern.compile(" +").splitAsStream(str).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("------------" + tem);
		return tem;
	}

	public static String reverseWordsInString2(String str) {
		String tem = String.join(" ", Pattern.compile(" +").splitAsStream(str).collect(LinkedList::new,
				LinkedList::addFirst, (a, b) -> a.addAll(0, b)));
		System.out.println("--tem---tem------" + tem);
		return tem;
	}

	public static void main(String[] args) throws InterruptedException {
		Testing te = new Testing();
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("--tem---thread one------");
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("--tem---thread twoooooooo------");
			}
		};

		// Start the downloads.
		thread1.start();
		thread2.start();

		// Wait for them both to finish
		// thread1.join();
		// thread2.join();
		String s1 = "how are you";
		reverseWordsInString2(s1);
		String str = Arrays.asList(s1).stream().map(s -> new StringBuilder(s1).reverse().toString())
				.collect(Collectors.toList()).get(0);
		String word[] = s1.split("\\s");
		String remobeDuplicate = Arrays.stream(word).collect(Collectors.toList()).get(0);
		reverseWordCharacters(s1);
		int intearrya[] = { 2, 4, 2, 3, 9, 4 };
		// List<Integer> remobeDuplicate1=
		// Arrays.stream(intearrya).boxed().distinct().collect(Collectors.toList());
		Map<String, Employee> map1 = new HashMap<>();
		Map<String, Employee> map2 = new HashMap<>();


		Stream combined = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream());

	
	}
		

	

}
