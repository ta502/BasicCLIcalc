import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("WELCOME TO BASIC-CLI-CALC");
            while (true) {
                System.out.println("What do you want to do? (2 numbers)");
                System.out.println("1. ADDITION (2 NUMs)");
                System.out.println("2. SUBTRACTION (2 NUMs)");
                System.out.println("3. MULTIPLY (2 NUMs)");
                System.out.println("4. DIVIDE (2 NUMs)");
                System.out.println("9. EXIT");
                System.out.println("10. ABOUT");
                System.out.println("CHOOSE:");
                int userInput = scan.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("INFO: YOU'RE ADDING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(userInput2 + userInput3);

                    }
                    case 2 -> {
                        System.out.println("INFO: YOU'RE SUBTRACTING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(userInput2 - userInput3);
                    }
                    case 3 -> {
                        System.out.println("INFO: YOU'RE MULTIPLYING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(userInput2 * userInput3);
                    }
                    case 4 -> {
                        System.out.println("INFO: YOU'RE DIVIDING (2 NUM MODE)");
                        System.out.println("FIRST NUM:");
                        int userInput2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int userInput3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(userInput2 / userInput3);
                    }
                    case 9 -> {
                        System.out.println("INFO: EXIT");
                        System.exit(0);
                    }
                    case 10 -> {
                        System.out.println("BasicCLIcalc IS A BARE-BONES COMMAND LINE CALCULATOR.");
                        System.out.println("THIS SOFTWARE IS RELEASED UNDER NO LICENSE.");
                        System.out.println("VERSION 1.0");
                        System.out.println("Made by @ta502 (Talal)");
                    }
                    default -> throw new InputMismatchException("ERROR: NOT VALID");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: NOT VALID");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: CAN'T DIVIDE BY ZERO");
        }
    }
}