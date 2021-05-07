package Com.lamda;

import java.util.ArrayList;
import java.util.List;

public class Mylamda {

	public static void main(String[] args) {

		// anonymous class
		// implement SAM WITH anonymous classes in java
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("i am kajal");
			}
		}).start();

		Myinterface ref = () -> 3.14;

		System.out.println(ref.getValue());
//Lamda expression with parameter

		// declare a reference to myinterface
		// assing a lamda expression to the references

		stringInterface val = (str) -> {

			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;

		};
		// call the method of the interface
		System.out.println(val.reverse("kajal"));

		// DECLARE A REFERNCE TO GENERICSiNTERFACE
		// the GEnericINterfcae operates on string data
		// assign lamda expression to it

		GenericsInterface<String> as = (str) -> {

			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;

		};

		System.out.println(as.function("kadu"));
		// declare another refernceto genericinterface
		// the generic interface operateson integer data
		// assign a lamda expresion to it

		GenericsInterface<Integer> as1 = (n) -> {

			int result = 1;
			for (int i = 1; i <= n; i++)
				result = result * i;
			return result;

		};

		System.out.println(as1.function(5));
//creat an object of list list using array
		
		
		List<String> myPlaces=StreamMain.getPlaces();
		
		System.out.println("places from nepal");
		
		
		//filterplaces from nepal
		
		
		myPlaces.stream()
		.filter((p)->p.startsWith("NEPAL"))
		.map((P)->P.toUpperCase())
		.sorted()
		.forEach((p)->System.out.println(p));
		
		
	}
	

}
	
	


