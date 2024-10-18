package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LastElementInList {

	public static void main(String[] args) {

//		find the last element in a list ?
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);

		Optional<Integer> lastElement = list.stream().skip(list.size()-1).findFirst();
		
		System.out.println(lastElement);
	}

}
