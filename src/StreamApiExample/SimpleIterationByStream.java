package StreamApiExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleIterationByStream {
    private static int sumIterator(List<Integer> list) {
	Iterator<Integer> it = list.iterator();
	int sum = 0;
	while (it.hasNext()) {
		int num = it.next();
		if (num > 10) {
			sum += num;
		}
		
	}
	System.out.println(sum);
	return sum;
}
    
    public static void main(String[] args) {
	List<Integer> list= new LinkedList<>();
	list.add(12);
	list.add(13);
	list.add(23);
	SimpleIteration.sumIterator(list);
    }

}
