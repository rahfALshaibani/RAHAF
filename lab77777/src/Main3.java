import java.util.Stack;
public class Main3 {
        public static void main(String[] args) {
            String postfixExpression = "5 2 + 8 3 - * 4 /";
            double result = evaluatePostfixExpression(postfixExpression);
            System.out.println("Result: " + result);
        }

        public static double evaluatePostfixExpression(String postfixExpression) {
            Stack<Double> stack = new Stack<>();

            String[] tokens = postfixExpression.split(" ");

            for (String token : tokens) {
                if (isNumeric(token)) {
                    stack.push(Double.parseDouble(token));
                } else {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result = performOperation(operand1, operand2, token);
                    stack.push(result);
                }
            }

            return stack.pop();
        }

        public static boolean isNumeric(String str) {
            try {
                double d = Double.parseDouble(str);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }

        public static double performOperation(double operand1, double operand2, String operator) {
            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    return operand1 / operand2;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
    }

