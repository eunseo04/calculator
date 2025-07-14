package org.example.Lv1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = scanner.next().charAt(0);

            if (a < 0 || b < 0) {
                System.out.println("음수가 포함되어있습니다!");
            } else {
                switch (c) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '%':
                        if (b == 0) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                            break;
                        } else {
                            System.out.println(a % b);
                            break;
                        }
                    default:
                        System.out.println("연산자가 잘못되었습니다!");
                }
            System.out.print("더 연산하시겠습니까? ");
            String str = scanner.next();
            if (str.equals("exit")) {
                break;
                }
            }
        }
    }
}
