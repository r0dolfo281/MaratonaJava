package cf.rodolfo.JavaCore.B_Introduction_To_Methods.test;

import cf.rodolfo.JavaCore.B_Introduction_To_Methods.domain.Calculator;

public class CalculatorTest01 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sumTwoNumbers();
		calculator.subtractionTwoNumbers();
		calculator.multiplicationTwoNumbers();
		calculator.divisonTwoNumbers();
	}
}
