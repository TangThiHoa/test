package KiemTra;

import java.util.Scanner;

public class Intong_chan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum = 0;

        int arr []={ 12,36,11,10};
        System.out.println(arr.length);


        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                sum = sum + arr[j];
            }
        }
        System.out.println("Tổng các số chẵn :" + sum);
    }
}