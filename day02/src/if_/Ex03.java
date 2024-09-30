package if_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 입력: ");
        int b = sc.nextInt();
        System.out.print("연산자 입력: ");
        String c = sc.next();

        if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("/")) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("0으로 나눌 수 없습니다!");
            }
        } else if (c.equals("%")) {
            if (b != 0) {
                System.out.println(a % b);
            } else {
                System.out.println("0으로 나눌 수 없습니다!");
            }
        } else {
            System.out.println("잘못된 연산자를 입력하셨습니다!");
        }

        sc.close();
    }
}