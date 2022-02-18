 package StreamApiExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringApi {

	public static List<Employee> returnDublicateEmployee(List<Employee> emplIst) {
		Set<Integer> nameSet = new HashSet<>();
		emplIst.sort((emp1, epm2) -> emp1.getId().compareTo(epm2.getId()));
		List<Employee> employeesDistinctByName = emplIst.stream().filter(e -> nameSet.add(e.getId()))
				.collect(Collectors.toList());
		employeesDistinctByName.stream().forEach(emp -> {
			System.out.println("distinct employee byId" + emp);

		});
		List<Integer> uniqueId = emplIst.stream().map(e -> e.getId()).distinct().collect(Collectors.toList());
		System.out.println("Unique Employeeid" + uniqueId);
		List<Employee> duplicates = emplIst.stream().collect(Collectors.groupingBy(Employee::getId)).entrySet().stream()
				.filter(e -> e.getValue().size() > 1).flatMap(e -> e.getValue().stream()).collect(Collectors.toList());
		List<String> empName= emplIst.stream().filter(emp->emp.getName().startsWith("k")).map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println("empName " + empName);
		
		//List<Employee> EmployeeLists= emplIst.stream().filter(emp->emp.getName().startsWith("k")).map(emp->emp.getName()).collect(Collectors.toList());
		List<Employee> dist = new ArrayList<>();
		//Collections.copy(dist, emplIst);
		List<Employee> copy = emplIst.stream().collect(Collectors.toList());

		// Clone the list
		List<Employee> cloned_list = new ArrayList<Employee>(emplIst);

		List<Employee> cloned_list1 = new ArrayList<Employee>();

		// Cloning a list
		cloned_list1.addAll(cloned_list);
		System.out.println("onlyDulicateEmployee Employeeid" + duplicates);
		HashMap<Integer, String> map1 = new HashMap<>();
		
		
		HashMap<Integer, String> map2 = new HashMap<>();

		return employeesDistinctByName;

	}

	public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

		Set<T> items = new HashSet<>();
		return list.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the
														// set.
				.collect(Collectors.toSet());

	}

	public static String reverseWordFromString(String str) {
		String revreseWord = String.join(" ", Pattern.compile(" +").splitAsStream(str).collect(LinkedList::new,
				LinkedList::addFirst, (a, b) -> a.addAll(0, b)));
		System.out.println("Actula :  " + str + ":  Reverse The word from string : " + revreseWord);
		return revreseWord;

	}

	// StringBuilder
	public static String reverseString(String str) {
		String revreseWord = new StringBuilder(str).reverse().toString();
		return revreseWord;

	}

	// Using Appache common
//	public String reverseUsingApacheCommons(String input) {
//		return StringUtils.reverse(input);
//	}

	public static List<Integer> removdDplicateValueFromArray(int arrinput[]) {

		List<Integer> uniqueValue = Arrays.stream(arrinput).boxed().distinct().collect(Collectors.toList());
		uniqueValue.forEach(i -> {
			System.out.println("Uniuqe Arrya value" + i);
		});
		uniqueValue.forEach(System.out::print);
		return uniqueValue;

	}

	public static void duplicateCharcterFromString(String input, int arrinput[]) {
	    Stream<String> stringStream = input.codePoints()
		    .mapToObj(c -> String.valueOf((char) c));
		Stream<Character> charsStream =  input.chars().mapToObj(ch -> (char) ch);
		Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Integer> duplicates = Arrays.stream(arrinput).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(
				"Repted charcter from String  " + output + "   Find duplicate number in array   " + duplicates);

	}
	static void getKthHighest(List<Integer> list, int k) {
	    Optional<Integer> element = list.stream().sorted(Collections.reverseOrder()).limit(k).skip(k - 1).findFirst();
	    if(element.isPresent()) {
	        System.out.println("Second Hogest"+element.get());
	    }
	}

	public static void main(String[] args) {
		reverseWordFromString("How are you");
		IntStream strm=IntStream.of(1,2,3,4,8);
		//strm.forEach(num-> num%2==0);
		
		int arrays[] = { 2, 3, 4, 5, 5, 8, 9, 2, 4, 3 };
		Integer array[] = { 2, 3, 4, 5, 5, 8, 9, 2, 4, 3 };  
		List<Integer> list = Arrays.asList(array);
		getKthHighest( list, 2);
		
		removdDplicateValueFromArray(arrays);
		duplicateCharcterFromString("aannjjkklljkffrraa", arrays);
		final List<Employee> employee1 = Arrays.asList(new Employee(1, "kohn"), new Employee(1, "kBob"),
				new Employee(2, "Alice"));
		
		
//		final Employee emp23= new Employee();
//		emp23.setId(1);
		//System.out.println("emp23"+emp23);
		returnDublicateEmployee(employee1);
		String str="khalid";
		String str1= new String("khalid");
		if(str.equals(str1)) {
		    
		    System.out.println(str1.hashCode()+"True value are same "+str.hashCode());
		}else {
		    System.out.println("False vlaure diffrent");
		}

	}

}
