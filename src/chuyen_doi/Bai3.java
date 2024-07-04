package chuyen_doi;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của hình vuông: ");
        float side = scanner.nextFloat();

        float area = side * side;
        System.out.println("Diện tích hình vuông: " + area);
    }
}

