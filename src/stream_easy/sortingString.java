package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortingString {
	public static void main(String[] args) {
		 
		List<String> names = Arrays.asList("john", "jane", "jack", "doe");
		
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
	}
}
