package KiemTra;

import java.util.Scanner;

public class NhapVaoSoLuong_NhapVaoPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử");
        int soluong= sc.nextInt();
        int[] arr= new int[soluong];
        for (int i=0;i<arr.length;i++) {
            System.out.println("Nhập vào phần tử thứ"+i );
            arr[i] = sc.nextInt();
        }
    }
}
