package week_12Thursday;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.CosNaming._BindingIteratorImplBase;

public class StreamExamples2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,4,2,1,5,6,17,7,99,97);
		
		// Parallel Stream
		
		System.out.println(numbers.parallelStream().filter(x -> x%10 == 7).collect(Collectors.toList()));
		
		// Statistics
		
		IntSummaryStatistics statistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
		
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getSum());
		
		System.out.println(statistics.toString());
		

	}

}
