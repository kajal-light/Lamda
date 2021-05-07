package Com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mystream {

	public static void main(String[] args) {
		// Stream.of()
		// we creating stre,am of fix number

		Stream<Integer> sr = Stream.of(1, 2, 0, 4, 7);

		sr.forEach(p -> System.out.println(p));
		// Stream.of(array)
		// we are creating stream from array

		Stream<Integer> sr1 = Stream.of(new Integer[] { 6, 2, 0, 4, 51 });

		sr1.forEach(p -> System.out.println(p));

//list.stream

		// we are creating stream from list
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			a.add(i);
		}

		Stream<Integer> sr11 = a.stream();

		sr11.forEach(p -> System.out.println(p));
//streamcollector

		// collect stream elements to alist

		// first we are creating a streamon integer 1 to 10 then we are processing to
		// find even numbers
		// at last we are collecting all the numbers in to alist

		List<Integer> b = new ArrayList<>();

		for (int i = 1; i < 10; i++) {

			b.add(i);

		}
		Stream<Integer> s = b.stream();

		List<Integer> evenNumber = s.filter(i -> i % 2 == 0)

				.collect(Collectors.toList());
		System.out.println(evenNumber);
		//

		List<Integer> c = new ArrayList<>();

		for (int i = 1; i < 10; i++) {

			c.add(i);

		}

		Stream<Integer> sw = c.stream();
		Integer[] evenNumber1 = sw.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		for (int i = 0; i < evenNumber1.length; i++) {
			System.out.println(evenNumber1[i]);
			
		}

	}

}
