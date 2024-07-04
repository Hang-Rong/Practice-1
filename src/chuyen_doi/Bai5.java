package chuyen_doi;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh kề a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập cạnh kề b: ");
        float b = scanner.nextFloat();

        float area = (a * b) / 2;
        System.out.println("Diện tích tam giác vuông: " + area);
    }
}

