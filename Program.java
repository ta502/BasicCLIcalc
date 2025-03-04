import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("WELCOME TO BASIC-CLI-CALC");
            while (true) {
                System.out.println("What do you want to do? (2 numbers)");
                System.out.println("1. ADDITION");
                System.out.println("2. SUBTRACTION");
                System.out.println("3. MULTIPLY");
                System.out.println("4. DIVIDE");
                System.out.println("5. EXIT");
                System.out.println("6. ABOUT");
                System.out.println("CHOOSE:");
                int user_input = scan.nextInt();
                switch (user_input) {
                    case 1 -> {
                        System.out.println("INFO: YOU'RE ADDING");
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 + user_input_3);

                    }
                    case 2 -> {
                        System.out.println("INFO: YOU'RE SUBTRACTING");
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 - user_input_3);
                    }
                    case 3 -> {
                        System.out.println("INFO: YOU'RE MULTIPLYING");
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 * user_input_3);
                    }
                    case 4 -> {
                        System.out.println("INFO: YOU'RE DIVIDING");
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 / user_input_3);
                    }
                    case 5 -> {
                        System.out.println("INFO: EXIT");
                        System.exit(0);
                    }
                    case 6 -> {
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