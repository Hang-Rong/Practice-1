package chuyen_doi;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int age = scanner.nextInt();

        if (age > 0 && age < 120) {
            System.out.println(age + " là tuổi của một người");
        } else {
            System.out.println(age + " không phải là tuổi của một người");
        }
    }
}

