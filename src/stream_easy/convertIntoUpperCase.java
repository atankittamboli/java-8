package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertIntoUpperCase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("john", "jane", "jack", "doe");
		
		List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
