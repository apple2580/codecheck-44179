package codecheck;

public class App {
	public static void main(String[] args) {
		//for (int i = 0, l = args.length; i < l; i++) {
			//String output = String.format("argv[%s]: %s", i, args[i]);

		String output = "";
		int input_1 = args[0].substring(2);
		int input_2 = args[1].substring(2);
		int input_3 = Integer.parseInt(args[2]);

		if (input % 15 == 0) {
			output = input_1 + input_2;
		} else if (input % 3 == 0) {
			output = input_1;
		} else if (input % 5 == 0) {
			output = input_2;
		} else {
			output = Integer.toString(input);
		}

		System.out.println(output);
	}
}
