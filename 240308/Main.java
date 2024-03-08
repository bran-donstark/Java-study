import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("두 숫자를 입력하세요:");
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//
//        System.out.println("연산을 선택하세요 (+, -, *, /):");
//        char operator = scanner.next().charAt(0);
//
//        double result;
//
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("0으로 나눌 수 없습니다.");
//                    return;
//                }
//                break;
//            default:
//                System.out.println("유효하지 않은 연산입니다.");
//                return;
//        }
//
//        System.out.println("결과: " + result);
//
//        scanner.close();
//    }
        Scanner scanner = new Scanner(System.in);

        System.out.println("나눌 숫자를 입력하세요:");
        int dividend = scanner.nextInt();

        int divisor = scanner.nextInt();

        int remainder = dividend % divisor;

        System.out.println("나머지: " + remainder);

        scanner.close();
    }
    }
