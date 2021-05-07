package Com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MystreamOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gh = new ArrayList<>();

		gh.add("red");
		gh.add("ready");
		gh.add("hangout");
		gh.add("hubli");
		gh.add("try");
		gh.add("tea");
		// stream.filter()

		gh.stream().filter((s) -> s.startsWith("r")).forEach(System.out::println);

		// stream.map()

		gh.stream().filter((s) -> s.startsWith("r"))

				.map(String::toUpperCase).forEach(System.out::println);
		// stream.sorted()

		gh.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// stream.collect

		List<String> jal = gh.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(jal);

	}

}
