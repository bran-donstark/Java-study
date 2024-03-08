import java.util.Scanner;

public class ex01 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("사용자에게 인사말을 입력하세요:");
            String greeting = scanner.nextLine();

            if (greeting.equals("안녕")) {
                System.out.println("안녕하세요");
            } else {
                System.out.println("인사말을 이해하지 못했습니다.");
            }

            scanner.close();
        }
    }
