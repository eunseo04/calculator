package org.example.Lv3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator <Double> calculator = new Calculator<>(Double.class);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                String a = scanner.nextLine();
                calculator.setValue1(a);
                System.out.print("두 번째 숫자를 입력하세요: ");
                String b = scanner.nextLine();
                calculator.setValue2(b);
                System.out.print("사칙연산 기호를 입력하세요: ");
                char c = scanner.next().charAt(0);
                calculator.setOperator(c);
                if(c == '/' && b.equals("0")){
                    throw new Exception();
                }
                calculator.operation();
                calculator.addArray();
                System.out.println(calculator.getArray());
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("숫자를 입력해주세요!");
            } catch (ArithmeticException e) {
                System.out.println("연산자가 잘못되었습니다!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                scanner.nextLine();
            }
            System.out.print("더 연산하시겠습니까? ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
        }
        try{
            System.out.print("숫자를 입력해주세요: ");
            Double num = scanner.nextDouble();
            calculator.setNum(num);
            calculator.removeResultArr();
            System.out.println(calculator.getArray());
        } catch (NullPointerException e) {
            scanner.nextLine();
        }
    }
}
