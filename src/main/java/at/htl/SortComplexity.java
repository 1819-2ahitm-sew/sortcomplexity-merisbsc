package at.htl;


import java.util.Random;
import java.util.Scanner;

public class SortComplexity {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int anzahlArr = 0, laenge = 0;

//        System.out.printf("Anzahl der zu sortierenen Arrays: %d", anzahlArr = scanner.nextInt());
//        System.out.printf("Größe der Arrays: ", laenge = scanner.nextInt());

        System.out.print("Anzahl der zu sortierenen Arrays: ");
        anzahlArr = scanner.nextInt();
        System.out.print("Größe der Arrays: ");
        laenge = scanner.nextInt();

        for (int i = 1; i < anzahlArr + 1; i++) {
            System.out.printf("Laufzeit der Sortierung des %4d. Arrays: %d\n", i, sortRandomArray(laenge));
        }


    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {
        int[] arr = generateRandomArray(length);
        long start = System.currentTimeMillis();
        sort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {
        Random random = new Random();

        int[] gen = new int[length];
        for (double number : gen) {
            number = random.nextInt();
        }
        return gen;
    }

    // Sorts an array of numbers in ascending order
    private static void sort(int[] array) {
        //selection sort
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i; j < array.length - i; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    // Swaps the array elements with index i and j
    private static void swap(int[] array, int i, int j) {
        int help = 0;

        help = array[j];
        array[j] = array[i];
        array[i] = help;
    }
}
