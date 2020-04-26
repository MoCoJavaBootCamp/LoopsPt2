import java.util.Scanner;

public class LoopsPt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID;

        do {
            System.out.println("Enter the number of desired program or 0 to quit\n" +
                    "1 - Cubed Numbers\n" +
                    "2 - Multiplication Table\n" +
                    "3 - Odd Numbers and Sum\n" +
                    "4 - Even Numbers and Sum\n" +
                    "5 - Incrementing Loop\n" +
                    "6 - Repeating Loop\n" +
                    "7 - Incrementing Spaced Numbers\n" +
                    "8 - One-Zero Loop\n" +
                    "9 - Check Number Palindrome\n" +
                    "10 - Sum Numbers 100-200 Divisible by 9\n");
            ID = input.nextInt();

            switch (ID) {
                case 1:
                    cubedNums();
                    break;
                case 2:
                    multTable();
                    break;
                case 3:
                    oddNumsAndSum();
                    break;
                case 4:
                    evenNumsAndSum();
                    break;
                case 5:
                    incrementingLoop();
                    break;
                case 6:
                    repeatSelfLoop();
                    break;
                case 7:
                    incrementingSpacedNums();
                    break;
                case 8:
                    oneZeroLoop();
                    break;
            case 9:
                numIsPalindrome();
                break;
            case 10:
                sum100To200Divisor();
                break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }
        } while (ID != 0);
    }
    //1. Prompt user for input, display the cube of all numbers up to that bound.
    public static void cubedNums() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cubed Numbers selected\n" +
                "Enter a number:");
        int num = input.nextInt();
        int product = 1;

        for (int i = 1; i <= num; i += 1) {
            System.out.printf("%d: " + Math.pow(i, 3) + "\n", i);
        }
    }
    //2. Prompt user for input, display the multiplication table for that number up to 10.
    public static void multTable() {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Table selected\n" +
                "Enter a number");
        int num = input.nextInt();

        for (int i = 1; i <= num; i += 1) {
            int product = i * num;
            System.out.printf("%d x %d = %d\n", i, num, product);
        }
    }
    //3. Prompt user for input, output all odd numbers up to that bound and then the sum of those odd numbers.
    public static void oddNumsAndSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd numbers and Sum selected\n" +
                "Enter a number");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i += 2) {
            sum += num;
            System.out.printf("%d\n", i);
        }
        System.out.printf("Sum: %d\n", sum);
    }
    //4. Prompt user for input, output all even numbers up to that bound and then the sum of those even numbers.
    public static void evenNumsAndSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Even numbers and Sum selected\n" +
                "Enter a number");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i += 2) {
            sum += num;
            System.out.printf("%d\n", i);
        }
        System.out.printf("Sum: %d\n", sum);
    }
    //5. Incrementing growth loop
    public static void incrementingLoop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Incrementing Loop selected\n" +
                "Enter a number:");
        int num = input.nextInt();
        String numStr = "";

        for (int i = 1; i <= num; i += 1) {
            numStr = numStr.concat(Integer.toString(i));
            System.out.printf("%s\n", numStr);
        }
    }
    //6. Repeat self loop
    public static void repeatSelfLoop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Repeat Self Loop selected\n" +
                "Enter a number:");
        int num = input.nextInt();
        String numStr = "";

        for (int i = 1; i <= num; i += 1) {
            String currentDigit = Integer.toString(i);
            currentDigit = currentDigit.repeat(i);
            numStr += currentDigit + "\n";
            System.out.printf("%s\n", numStr);
        }
    }
    //7. Incrementing space loop
    public static void incrementingSpacedNums() {
        Scanner input = new Scanner(System.in);
        System.out.println("Incrementing Spaced Numbers selected\n" +
                "Enter a number:");
        int targetNum = input.nextInt();
        int currentNum = 1;
        int numsPerLine = 0;
        int numsOnLine = 0;
        String numString = "";

        while (currentNum <= targetNum) {
            while (numsOnLine <= numsPerLine) {
                numString += Integer.toString(currentNum);
                currentNum += 1;
                numsOnLine += 1;
            }
            System.out.printf("%s\n", numString);
            numString = "";
            numsOnLine = 0;
            numsPerLine += 1;
        }
    }
    //8. Zero-one loop
    public static void oneZeroLoop() {
        Scanner input = new Scanner(System.in);
        System.out.println("One-Zero Loop selected\n" +
                "Enter a number:");
        int targetNum = input.nextInt();
        int currentNum = 1;
        int numsPerLine = 0;
        int numsOnLine = 0;
        String numString = "";

        for (int i = 1; i <= targetNum; i += 1) {

            while (numsOnLine <= numsPerLine) {
                numString += Integer.toString(currentNum);
                numsOnLine += 1;

                if (currentNum == 1) {
                    currentNum = 0;
                } else {
                    currentNum = 1;
                }
            }
            System.out.printf("%s\n", numString);
            numString = "";
            numsOnLine = 0;
            numsPerLine += 1;
        }
    }
    //9. Check if number is a palindrome
    public static void numIsPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Number is a Palindrome selected\n" +
                "Enter a number:");
        int num = input.nextInt();
        String numStr = Integer.toString(num);
        String numReversed = "";
        int numLength = numStr.length();

        for (int i = numLength - 1; i >= 0; i -= 1) {
            numReversed += numStr.charAt((i));
        }

        if (numStr.equals(numReversed)) {
            System.out.printf("%d is a palindrome.\n", num);
        } else {
            System.out.printf("%d is not a palindrome.\n", num);
        }
    }
    //10. Sum numbers 100-200 divisible by 9
    public static void sum100To200Divisor() {
        System.out.println("Sum Numbers 100-200 Divisible by 9 selected\n");
        int sum = 0;

        for (int i = 100; i <= 200; i += 1) {
            if (i % 9 == 0) {
                sum += i;
            }
        }
        System.out.printf("The sum of numbers 100-200 divisible by 9 is: %d.\n", sum);
    }
}
