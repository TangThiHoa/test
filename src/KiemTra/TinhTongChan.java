package KiemTra;

import java.util.Scanner;

public class TinhTongChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[]arr={10,12,14,21};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("\n Tổng là : "+sum);

    }
}
