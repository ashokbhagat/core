package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		// Sorting
		List<String> names = Arrays.asList("B", "X", "M", "A", "J");
		names.sort((o1, o2) -> o1.compareTo(o2));
		//names.forEach((name) -> System.out.println(name));
		
		//Filter
		//names.stream().filter(name -> name.compareTo("A")>=1).forEach(name->System.out.println(name));
		
		//Creating Stream, sorting and distinct
		//Stream.of(1,1,6,7,2,3,4,46,7).distinct().sorted().forEach(System.out::println);
		
		//Another way to create distinct stream
		//Stream.of(1,1,6,7,2,3,4,46,7).collect(Collectors.toSet()).forEach(System.out::println);
		
		//Converting to Array
		//Stream.of(1,1,6,7,2,3,4,46,7).filter(num->num%2==0).toArray();
		
		//Generate infinite stream
		//Stream<Double> stream = Stream.generate(() -> { return Math.random(); });
        //stream.forEach(p -> System.out.println(p));
		
		//Calling Runnable
		//Thread t = new Thread(()->System.out.println("Thread Running"));
		//t.start();
		
		List<String> users = new ArrayList<>();
		users.add("Amitabh");
		users.add("Shekhar");
		users.add("Aman");
		users.add("Rahul");
		users.add("Shahrukh");
		users.add("Salman");
		users.add("Yana");
		users.add("Lokesh");
		
		//mapping to uppercase
		users.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		//Match
		System.out.println(users.stream().anyMatch(s->s.startsWith("A")));
		System.out.println(users.stream().allMatch(s->s.startsWith("A")));
		
		//Filter
		System.out.println(users.stream().filter(s->s.startsWith("A")).count());
		
	}

}
