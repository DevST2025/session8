package ra.calculatorapp.bussiness;

public class Calculator {
    public static double calculate(double num1, double num2, String operator) throws ArithmeticException {
        switch (operator) {
            case "Addition":
                return num1 + num2;
            case "Subtraction":
                return num1 - num2;
            case "Multiplication":
                return num1 * num2;
            case "Division":
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
