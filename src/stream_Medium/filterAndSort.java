package stream_Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterAndSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);
		
//		1:-Filter and Sort: Given a list of integers, 
//		use filter to keep only numbers greater than 10 and then sort the result.		
		List<Integer> result = list.stream().filter(i->i>10)
				.sorted().collect(Collectors.toList());				
		
//		2:-Given a list of integers, filter for even numbers,
//		square them, and then sort the results.
		System.out.println(" result "+result);

		List<Integer> filterOperationSort = list.stream()
				.filter(i->i%2==0)
				.map(i-> i*i)
				.sorted().collect(Collectors.toList());				
		
		System.out.println(" filterOperationSort "+filterOperationSort);

	}

}
