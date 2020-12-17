package week_12Thursday;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;

// Stream api is used for processing collection of objects

public class StreamExamples {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(5,6,7,2,3,4,5,1);
		
		// This statement change the element of the arraylist in given implementation
		// map()
		System.out.println(number.stream().map(x -> x*x*x).collect(Collectors.toList()));
		
		List<Integer> cubes = number.stream().map(x -> x*x*x).collect(Collectors.toList());
		System.out.println(cubes);
		
		// filter()
		System.out.println(number.stream().filter(x -> x%2==0).collect(Collectors.toList()));
		
		// sorted()
		System.out.println(cubes.stream().sorted().collect(Collectors.toList()));
		
		// forEach()
		cubes.stream().sorted().forEach(x -> System.out.println(x));
		

	}

}
