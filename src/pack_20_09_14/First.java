package pack_20_09_14;

import java.util.Random;

public class First {

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 8, 6, 3, 5, 7};
        mergeSort(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(
            int lowerBound) {
        Random r = new Random();
        int[] array = new int[
                lowerBound + r.nextInt(5)];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = r.nextInt(20) - 10;
        }
        return array;
    }

    public static void mergeSort(int[] array) {
        if (array.length == 1) {
//            System.out.println(array[0]);
            return;
        }
        int[] left = new int[array.length / 2];
        int[] right =
                new int[array.length - left.length];
        for (int i = 0; i < array.length; i++) {
            if(i<left.length) {
                left[i] = array[i];
            } else {
                right[i-left.length] = array[i];
            }
        }
        printArray(left);
        printArray(right);

        mergeSort(left);
        mergeSort(right);

    }

    public static int[] merge(int[] left,
                              int[] right) {
        int[] result = new int[
                left.length + right.length];
        int leftI = 0;
        int rightI = 0;
        for (int i = 0; i < result.length; i++) {
            if(leftI >= left.length){
                // перенести все правые в конец
            }
            if(rightI >= right.length){
                // перенести все левые.
            }
            if(left[leftI] < right[rightI]) {
                result[i] = left[leftI];
                leftI++;
            } else {
                result[i] = right[rightI];
                rightI++;
            }
        }
    }

}
