package exam;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        double max = 0;
        for (int i = 0; i < count; i++) {
             double num  = in.nextDouble();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        in.close();
    }

}

