package week_11Recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.security.auth.x500.X500Principal;

public class LambdaWithMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("ZM ", 248);
		map.put("NFX", 543);
		map.put("SPOT", 500);
		map.put("TESLA", 1500);
		
		map.forEach((k,v) -> System.out.println(k + ", Market Price : " + v));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(9);
		list.add(8);
		
		list.forEach((n) -> System.out.println(n));
		
		double sum = list.stream().mapToDouble(x -> Math.sqrt(x)).sum();
		System.out.println(sum);

	}

}
