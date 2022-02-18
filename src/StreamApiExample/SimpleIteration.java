package StreamApiExample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleIteration {
    
    
    static int sumIterator(List<Integer> list) {
	int total=list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	System.out.println("total"+total);
	 return total;
}
    
    public static void main(String[] args) {
	List<Integer> list= new LinkedList<>();
	list.add(12);
	list.add(13);
	list.add(23);
	SimpleIteration.sumIterator(list);
	
	Stream<Integer> stream= Stream.of(1,2,3,4);
	System.out.println("stream"+stream.distinct() );

Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4}); 

//works fine

//Stream<Integer> stream1 = Stream.of(new int[]{1,2,3,4}); 
//Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>

String url="http:\\khalid\\hassan,http:\\khalid\\Demo";



List<String> listStr= new ArrayList<String>(Arrays.asList(url.split(",")));

listStr.forEach(t ->System.out.println(t));
 

/*We can use Collection stream() to create sequential stream and parallelStream() to create parallel stream.
Copy*/
List<Integer> myList = new ArrayList<>();
for(int i=0; i<100; i++) myList.add(i);
		
//sequential stream
Stream<Integer> sequentialStream = myList.stream();
		
//parallel stream
Stream<Integer> parallelStream = myList.parallelStream();
	
	


Stream<String> stream11 = Stream.generate(() -> {return "abc";});
Stream<String> stream2 = Stream.iterate("abc", (i) -> i);

    }

}
