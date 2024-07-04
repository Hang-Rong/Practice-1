package dieu_kien;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập doanh số bán hàng: ");
        float sales = scanner.nextFloat();

        float commission;
        if (sales >= 100000) {
            commission = sales * 0.1f;
        } else if (sales >= 50000) {
            commission = sales * 0.07f;
        } else {
            commission = sales * 0.05f;
        }

        System.out.println("Hoa hồng nhận được: " + commission);
    }
}
