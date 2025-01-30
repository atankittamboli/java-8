package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallest {

	public static void main(String[] args) {

//		 second smallest element in a list of integers ?
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);
		
		 Optional<Integer> result = list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst();

//		 second highest element in a list of integers ?
		 
		 Optional<Integer> result1 = list.stream().distinct().sorted()
		 .skip(list.size()-2)
		 .findFirst();
		System.out.println(result1);
		
	}
}
