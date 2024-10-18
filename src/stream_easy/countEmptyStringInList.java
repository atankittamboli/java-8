package stream_Easy;

import java.util.Arrays;
import java.util.List;

public class countEmptyStringInList {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", "", "b", "c", "", "d");
		
		long num = strings.stream().filter(i->i.isEmpty()).count();
		System.out.println(num);
	}
}
