package dieu_kien;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " lớn hơn 0");
        } else if (number < 0) {
            System.out.println(number + " nhỏ hơn 0");
        } else {
            System.out.println(number + " bằng 0");
        }
    }
}
