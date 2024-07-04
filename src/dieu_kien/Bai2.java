package dieu_kien;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của học sinh: ");
        int age = scanner.nextInt();

        if (age < 15) {
            System.out.println("Học sinh không đủ điều kiện vào học lớp 10");
        } else {
            System.out.println("Học sinh đủ điều kiện vào học lớp 10");
        }
    }
}
