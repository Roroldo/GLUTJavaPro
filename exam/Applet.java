package exam;

import java.util.Arrays;

public class Applet {

    public Applet() {
    }

    public int arrayMin(int [] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

    public double arrayMin(double[] doubles) {
        double min = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            if (min > doubles[i]) {
                min = doubles[i];
            }
        }
        return min;
    }

    public void paint() {
        int[] arr1 = new int[]{26, 82, -3, 65, 18, 9};
        double[] arr2 = new double[]{3.6, 57.2, 8.5, 78.8};
        System.out.println("arr1" + Arrays.toString(arr1) + "最小值：" + arrayMin(arr1));
        System.out.println("arr2" + Arrays.toString(arr2) + "最小值：" + arrayMin(arr2));
    }
}
