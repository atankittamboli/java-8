package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxValueInList {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(5, 10, 3, 7, 2, 8);
		 
		 Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
		 System.out.println("maxValue "+maxValue);
		 
		 Optional<Integer> max = numbers.stream().max((a,b) -> a.compareTo(b));
		 System.out.println("max "+max);
	}
}
