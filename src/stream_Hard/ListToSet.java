package stream_Hard;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {

//		1:-Filter, Transform, and Collect: Given a list of integers,
//		filter for those greater than 5, double them, and collect them into a Set.
		
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);
		
		Set<Integer> result = list.stream().filter(i->i>5).map(i->i*2).collect(Collectors.toSet());
		
		System.out.println(result);
	}

}
