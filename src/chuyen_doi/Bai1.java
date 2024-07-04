package chuyen_doi;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ (°C): ");
        float celsius = scanner.nextFloat();

        float fahrenheit = celsius * 9/5 + 32;
        System.out.println("Nhiệt độ (°F): " + fahrenheit);
    }
}
