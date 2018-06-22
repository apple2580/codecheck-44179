package codecheck;

public class App {
	public static void main(String[] args) {

		String output = "";
		int len = args.length;
		int len2 = len - 1;
		int input_num = Integer.parseInt(args[len2]);
		int[] intArray = new int[len2];
		String[] strArray = new String[len2];
		int remainder = 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len2; i++) {
			intArray[i] = Integer.parseInt(args[i].substring(0,args[i].indexOf(":")));
			remainder = remainder * intArray[i];
			strArray[i] = args[i].substring(args[i].indexOf(":")+1);
		}

		if (input_num % remainder == 0) {
			for (int i = 0; i < len2; i++) {
				sb.append(strArray[i]);
			}
			output = sb.toString();
		} else {
			for (int i = 0; i < len2; i++) {
				if (input_num % intArray[i] == 0) {
					output = strArray[i];
					break;
				}
			}
		}

		if (output.equals("")) {
			output = Integer.toString(input_num);
		}

		System.out.println(output);
	}
}
