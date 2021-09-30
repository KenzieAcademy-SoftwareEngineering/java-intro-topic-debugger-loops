package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Do not directly modify this array!
        final int[] numbers = new int[]{469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472};

        System.out.println("****Array Analyzer Program****");
        // write your code here
        int len = numbers.length;
        // You can create variables to store each result, for example: int largestNumber = 0;
        int largestNumber = 0;
        int smallestNumber = numbers[0];
        //loop through array one by one
        //each time, compare current number to largest number
        //if current number is bigger than largestNumber
        //current number becomes largestNumber

        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            if (numbers[index] > largestNumber) {
                largestNumber = numbers[index];
            }

            if (currentNumber < smallestNumber) {
                smallestNumber = currentNumber;
            }

        }
        System.out.println(largestNumber);



        /*
        The largest number in the array
        The smallest number in the array
        The sum of all the numbers in the array
        The average value of all the numbers in the array (the sum of all values divided by the number of values) - Hint: This should be a long
        A list of all even numbers in the array
        A list of all odd numbers in the array
        A list of all numbers divisible by 8 in the array
        * */
    }
}
