package chuyen_doi;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        float length = scanner.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        float width = scanner.nextFloat();

        float area = length * width;
        System.out.println("Diện tích hình chữ nhật: " + area);
    }
}

