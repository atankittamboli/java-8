package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinListOfString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange");
		
		String result = strings.stream().collect(Collectors.joining(", "));
		System.out.println(result);
	}
}
