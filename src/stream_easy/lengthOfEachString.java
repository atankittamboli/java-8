package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lengthOfEachString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("john", "jane", "jack", "doe");
		
		List<Integer> result = names.stream().map(String::length).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
