import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.exit;

public class Ex1 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		double number1 = 0, number2 = 0, result = 0;
		String op = "";

		out.print("Operation (number op number): ");

		try {
			number1 = in.nextDouble();
			op = in.next();
			if(!validOperator(op)) {							// em vez do default
				err.printf("ERROR: invalid operator %s%n", op);
				exit(2);
			}
			number2 = in.nextDouble();
		} catch(Exception e) {
			err.println("ERROR: read number failure");
			exit(1);
		}

		switch(op) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				if(number2 == 0) {
					err.println("ERROR: divide by zero");
					exit(3);
				}
				else result = number1 / number2;
				break;
//			default:
//				err.printf("ERROR: invalid operator %s", op);
//				exit(2);
		}

		out.printf("%f %s %f = %f%n", number1, op, number2, result);

	}

	static boolean validOperator(String op) {
		assert op != null;
		return op.length() == 1 && "+-*/".contains(op);
	}

}
