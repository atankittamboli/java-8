package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3);
		
		List<Integer> result = list.stream().
				distinct().collect(Collectors.toList());
		
		System.out.println(" result "+result);
	}
}
