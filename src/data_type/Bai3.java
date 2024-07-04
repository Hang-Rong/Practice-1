package data_type;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Tổng: " + sum);
        System.out.println("Tích: " + product);
        System.out.println("Hiệu: " + difference);
        System.out.println("Thương: " + quotient);
        System.out.println("Số dư: " + remainder);
    }
}
