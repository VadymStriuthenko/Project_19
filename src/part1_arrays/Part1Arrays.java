package part1_arrays;
public class Part1Arrays {
    public static void main(String[] args) {
        // Part 1.1 Array with predefined size
        int[] a = new int[10];
        System.out.println("Part 1.1 Array length: " + a.length);
        // Part 1.2 Array with size from a variable
        int size = 5;
        double[] prices = new double[size];
        System.out.println("Part 1.2 Array length: " + prices.length);
        // Part 1.3 Literal arrays of different types
        int[] numbers = {1, 4, 2, 8, 5};
        double[] doubles = {1.5, 2.25, 3.0};
        String[] names = {"Anna", "Bohdan", "Olena"};
        char[] letters = {'a', 'b', 'c'};
        boolean[] flags = {true, false, true};
        // Part 1.4 array.length
        System.out.println("Part 1.4 numbers length: " + numbers.length);
        System.out.println("Part 1.4 names length: " + names.length);
        // Part 1.5 Set and get element by index
        numbers[4] = 45;
        System.out.println("Part 1.5 5th element value: " + numbers[4]);
        // Part 1.6 for loop
        System.out.println("Part 1.6 for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Part 1.7 enhanced for loop
        System.out.println("Part 1.7 enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
        // Part 1.8 while loop
        System.out.println("Part 1.8 while loop:");
        int i = 0;
        while (i < letters.length) {
            System.out.println(letters[i]);
            i++;
        }
        // Other types (double and boolean)
        System.out.println("First double: " + doubles[0]);
        System.out.println("First boolean: " + flags[0]);
        // Part 1.9 Error: index does not exist (take screenshot)
        System.out.println("Part 1.9 Error:");
        System.out.println(numbers[1000]);
    }
}
