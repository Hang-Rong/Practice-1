package dieu_kien;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm bài kiểm tra: ");
        float testScore = scanner.nextFloat();
        System.out.print("Nhập điểm thi giữa kỳ: ");
        float midTermScore = scanner.nextFloat();
        System.out.print("Nhập điểm thi cuối kỳ: ");
        float finalScore = scanner.nextFloat();

        float averageScore = (testScore + midTermScore + finalScore) / 3;

        if (averageScore >= 8.5) {
            System.out.println("Học sinh đạt hạng: Giỏi");
        } else if (averageScore >= 7.0) {
            System.out.println("Học sinh đạt hạng: Khá");
        } else if (averageScore >= 5.0) {
            System.out.println("Học sinh đạt hạng: Trung bình");
        } else {
            System.out.println("Học sinh đạt hạng: Yếu");
        }
    }
}
