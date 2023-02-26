import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1;
            while (!scanner.hasNextDouble()) { // 입력값이 숫자가 아닌 경우
                System.out.println("숫자를 입력하세요.");
                scanner.next(); // 다음 입력을 받음
            }
            num1 = scanner.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2;
            while (!scanner.hasNextDouble()) { // 입력값이 숫자가 아닌 경우
                System.out.println("숫자를 입력하세요.");
                scanner.next(); // 다음 입력을 받음
            }
            num2 = scanner.nextDouble();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operator = scanner.next();

            double result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요");
                    continue;
            }

            System.out.printf("%.2f %s %.2f = %.2f\n\n", num1, operator, num2, result);

            System.out.print("계속하려면 y를 입력하세요. 종료하려면 다른 아무 키나 입력하세요: ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }
}