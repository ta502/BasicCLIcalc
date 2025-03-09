import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Welcome message, initializing Scanner
            System.out.println("WELCOME TO BASIC-CLI-CALC");
            while (true) {
                // Letting the user choose what to do
                System.out.println("What do you want to do? (2 numbers)");
                System.out.println("1. ADDITION (2 NUMs)");
                System.out.println("2. SUBTRACTION (2 NUMs)");
                System.out.println("3. MULTIPLY (2 NUMs)");
                System.out.println("4. DIVIDE (2 NUMs)");
                System.out.println("SECTION 2: 3 NUMBERED OPERATIONS");
                System.out.println("5. ADDITION (3 NUMs)");
                System.out.println("6. SUBTRACTION (3 NUMs)");
                System.out.println("7. MULTIPLY (3 NUMs)");
                System.out.println("8. DIVIDE (3 NUMs)");
                System.out.println("9. EXIT");
                System.out.println("10. ABOUT");
                System.out.println("CHOOSE:");
                // Scan user input, and choose an operation based on their input
                int userInput = scan.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("INFO: YOU'RE ADDING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        int result = add2Num(userInput2, userInput3);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 2 -> {
                        System.out.println("INFO: YOU'RE SUBTRACTING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        int result = sub2Num(userInput2, userInput3);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 3 -> {
                        System.out.println("INFO: YOU'RE MULTIPLYING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        int result = multiply2Num(userInput2, userInput3);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 4 -> {
                        System.out.println("INFO: YOU'RE DIVIDING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        int result = divide2Num(userInput2, userInput3);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 5 -> {
                        System.out.println("INFO: YOU'RE ADDING (3 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("THIRD NUM:");
                        int userInput4 = scan.nextInt();
                        int result = add3Num(userInput2, userInput3, userInput4);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 6 -> {
                        System.out.println("INFO: YOU'RE SUBTRACTING (3 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("THIRD NUM:");
                        int userInput4 = scan.nextInt();
                        int result = sub3Num(userInput2, userInput3, userInput4);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 7 -> {
                        System.out.println("INFO: YOU'RE MULTIPLYING (3 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("THIRD NUM:");
                        int userInput4 = scan.nextInt();
                        int result = multiply3Num(userInput2, userInput3, userInput4);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 8 -> {
                        System.out.println("INFO: YOU'RE DIVIDING (3 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("THIRD NUM:");
                        int userInput4 = scan.nextInt();
                        int result = divide3Num(userInput2, userInput3, userInput4);
                        System.out.println("RESULT:");
                        System.out.println(result);
                        TimeUnit.SECONDS.sleep(2);
                    }
                    case 9 -> {
                        System.out.println("INFO: EXIT");
                        System.exit(0);
                    }
                    case 10 -> {
                        System.out.println("BasicCLIcalc IS A BARE-BONES COMMAND LINE CALCULATOR.");
                        System.out.println("THIS SOFTWARE IS RELEASED UNDER NO LICENSE.");
                        System.out.println("VERSION 1.1");
                        System.out.println("Made by @ta502 (Talal)");
                    }
                    default -> throw new InputMismatchException("ERROR: NOT VALID");
                }
            }
        } catch (InputMismatchException e) {
            // Catch user invalid input
            System.out.println("ERROR: NOT VALID");
        } catch (ArithmeticException e) {
            // Catch dividing by zero
            System.out.println("ERROR: CAN'T DIVIDE BY ZERO");
        } catch (InterruptedException e) {
            // Catch interruptions in the 2 seconds sleep while showing the result
            System.out.println("ERROR: INTERRUPTED");
        }
    }

    // functions for adding, subtracting, multiplying, and dividing, both 2 number calculations and 3 number calculations
    public static int add2Num(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int sub2Num(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiply2Num(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int divide2Num(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static int add3Num(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    public static int sub3Num(int firstNum, int secondNum, int thirdNum) {
        return firstNum - secondNum - thirdNum;
    }

    public static int multiply3Num(int firstNum, int secondNum, int thirdNum) {
        return firstNum * secondNum * thirdNum;
    }

    public static int divide3Num(int firstNum, int secondNum, int thirdNum) {
        return firstNum / secondNum / thirdNum;
    }
}