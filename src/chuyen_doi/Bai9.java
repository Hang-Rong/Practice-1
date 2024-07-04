package chuyen_doi;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập cạnh b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhập cạnh c: ");
        float c = scanner.nextFloat();

        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            System.out.println("a, b, c là cạnh của một tam giác");
        } else {
            System.out.println("a, b, c không phải là cạnh của một tam giác");
        }
    }
}

