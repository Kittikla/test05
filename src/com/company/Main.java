package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x >= 5_000_001) {
            System.out.println((float) (x * 35) / 100);
        } else if (x >= 2_000_001) {
            System.out.println((float) (x * 30) / 100);
        } else if (x >= 1_000_001) {
            System.out.println((float) (x * 25) / 100);
        } else if (x >= 750_001) {
            System.out.println((float) (x * 20) / 100);
        } else if (x >= 500_001) {
            System.out.println((float) (x * 15) / 100);
        } else if (x >= 300_001) {
            System.out.println((float) (x * 10) / 100);
        } else if (x >= 150_001) {
            System.out.println((float) (x * 5) / 100);
        } System.out.println("ไม่ต้องเสียภาษี");
    }
    }
