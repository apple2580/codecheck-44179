package codecheck;

public class App {
	public static void main(String[] args) {
		//for (int i = 0, l = args.length; i < l; i++) {
			//String output = String.format("argv[%s]: %s", i, args[i]);

		String output = "";
		int input = Integer.parseInt(args[2]);

		if (input % 15 == 0) {
			output = "FizzBuzz";
		} else if (input % 5 == 0) {
			output = "Buzz";
		} else if (input % 3 == 0) {
			output = "Fizz";
		} else {
			output = Integer.toString(input);
		}

		System.out.println(output);
	}
}
