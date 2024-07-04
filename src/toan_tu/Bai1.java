package toan_tu;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        System.out.println("Tổng: " + (num1 + num2));
        System.out.println("Hiệu: " + (num1 - num2));
        System.out.println("Tích: " + (num1 * num2));
        System.out.println("Thương: " + (num1 / num2));
        System.out.println("Số dư: " + (num1 % num2));
    }
}
