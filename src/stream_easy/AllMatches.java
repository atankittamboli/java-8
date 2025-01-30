package stream_easy;

import java.util.Arrays;
import java.util.List;

public class AllMatches {

	public static void main(String[] args) {
		
//		1:-check if all elements in a list are greater than a given value??
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);

		Boolean result = list.stream().allMatch(i->i<100);

		System.out.println(result);
	}

}
