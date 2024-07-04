package chuyen_doi;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài (m): ");
        float meters = scanner.nextFloat();

        float feet = meters * 3.2808f;
        System.out.println("Chiều dài (ft): " + feet);
    }
}

