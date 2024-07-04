package dieu_kien;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phút gọi: ");
        int minutes = scanner.nextInt();

        float cost;
        if (minutes <= 50) {
            cost = minutes * 1.0f;
        } else if (minutes <= 100) {
            cost = 50 * 1.0f + (minutes - 50) * 0.75f;
        } else {
            cost = 50 * 1.0f + 50 * 0.75f + (minutes - 100) * 0.5f;
        }

        System.out.println("Cước điện thoại: " + cost + "$");
    }
}
