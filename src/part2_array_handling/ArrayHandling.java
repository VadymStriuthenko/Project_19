package part2_array_handling;
import java.util.Random;
import java.util.Scanner;
public class ArrayHandling {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("1 - Input array (2.1) and print (2.3)");
            System.out.println("2 - Random array (2.2) and print (2.3)");
            System.out.println("3 - Sum of array (2.4)");
            System.out.println("4 - Largest value (2.5)");
            System.out.println("5 - Search value (2.6)");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter array length: ");
                int length = scanner.nextInt();
                int[] arr = inputArray(length);
                printArray(arr);
            } else if (choice == 2) {
                System.out.print("Enter array length: ");
                int length = scanner.nextInt();
                int[] arr = randomArray(length);
                printArray(arr);
            } else if (choice == 3) {
                // Part 2.4 Sum of array elements
                System.out.print("Enter array length: ");
                int length = scanner.nextInt();
                int[] arr = inputArray(length);
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }
                printArray(arr);
                System.out.println("Sum = " + sum);
            } else if (choice == 4) {
                // Part 2.5 Largest value
                System.out.print("Enter array length: ");
                int length = scanner.nextInt();
                int[] arr = randomArray(length);
                printArray(arr);
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("Largest value = " + max);
            } else if (choice == 5) {
                // Part 2.6 Search
                int[] arr = randomArray(10);
                printArray(arr);
                System.out.print("Enter value to search: ");
                int value = scanner.nextInt();
                int index = search(arr, value);
                if (index == -1) {
                    System.out.println("Value not found (-1)");
                } else {
                    System.out.println("Value found at index " + index);
                }
            }
        }
        System.out.println("Bye!");
    }
    // Part 2.1 Input Array Method
    static int[] inputArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    // Part 2.2 Random Array Method
    static int[] randomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100); // from 0 to 99
        }
        return arr;
    }
    // Part 2.3 Print Array Method
    static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Part 2.6 Search Method
    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
