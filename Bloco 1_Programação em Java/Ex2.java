import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.exit;

public class Ex2 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<Double> stack = new Stack<>();
		double number = 0;
		String op = "";
		double number1, number2, result = 0;

		while(in.hasNext()) {

			try {
				number = in.nextDouble();
				stack.push(number);
				out.println("Stack: " + stack.toString());

			} catch (Exception e) {

				if(stack.size() == 0) {
					err.println("ERROR: two operands missing!");
					exit(1);
				} else if(stack.size() == 1) {
					err.println("ERROR: one operand missing!");
					exit(1);
				}

				op = in.next();
				number2 = stack.pop();
				number1 = stack.pop();

				switch(op) {
					case("+"):
						result = number1 + number2;
						stack.push(result);
						break;
					case("-"):
						result = number1 - number2;
						stack.push(result);
						break;
					case("*"):
						result = number1 * number2;
						stack.push(result);
						break;
					case("/"):
						result = number1 / number2;
						stack.push(result);
						break;
//					default:
//						err.printf("ERROR: ...");
//						exit(2);
				}


				out.println("Stack: " + stack.toString());
			}
		}


	}
}
