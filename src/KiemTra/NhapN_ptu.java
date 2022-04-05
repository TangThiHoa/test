package KiemTra;

import java.util.Scanner;

public class NhapN_ptu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhập n vào !");
            int n = sc.nextInt();
            int[] hoa;
            hoa = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("thêm phân tử thứ " + i + "vào mảng");
                hoa[i] = sc.nextInt();
            }
        }
    }
}





