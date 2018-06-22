package codecheck;

public class App {
	public static void main(String[] args) {
		//for (int i = 0, l = args.length; i < l; i++) {
			//String output = String.format("argv[%s]: %s", i, args[i]);


		String output = "";
		int len = args.length;
		int len2 = len - 1;
		int input_num = Integer.parseInt(args[len2]);
		int[] intArray = new int[len2];
		String[] strArray = new String[len2];
		int remainder = 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len2; i++) {
			intArray[i] = Integer.parseInt(args[i].substring(0,1));
			remainder = remainder * intArray[i];
			strArray[i] = args[i].substring(2);
		}

		if (input_num % remainder == 0) {
			for (int i = 0; i < len2; i++) {
				sb.append(strArray[i]);
			}
			output = sb.toString();
		}


		/*
		for (int i = len; i-- > 0;) {
			if (i == len ) {
				int num = Integer.parseInt(args[i]);
			} else {

			}
		}
		*/


		/*
		String output = "";
		String input_1 = args[0].substring(2);
		String input_2 = args[1].substring(2);
		int input_3 = Integer.parseInt(args[2]);

		if (input_3 % 15 == 0) {
			output = input_1 + input_2;
		} else if (input_3 % 3 == 0) {
			output = input_1;
		} else if (input_3 % 5 == 0) {
			output = input_2;
		} else {
			output = Integer.toString(input_3);
		}
*/
		System.out.println(output);
	}
}
