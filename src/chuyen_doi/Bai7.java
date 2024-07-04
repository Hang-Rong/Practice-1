package chuyen_doi;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hệ số c: ");
        float c = scanner.nextFloat();

        float delta = b * b - 4 * a * c;

        if (delta > 0) {
            float x1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

