package data_type;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.println("Xin chào " + name + ", tôi năm nay " + age + " tuổi.");
    }
}
