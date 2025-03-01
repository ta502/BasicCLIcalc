import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" ___   _   ___ ___ ___ ___ _    ___ ___   _   _    ___ ");
            System.out.println("| _ ) /_\\ / __|_ _/ __/ __| |  |_ _/ __| /_\\ | |  / __|");
            System.out.println("| _ \\/ _ \\\\__ \\| | (_| (__| |__ | | (__ / _ \\| |_| (__ ");
            System.out.println("|___/_/ \\_\\___/___\\___\\___|____|___\\___/_/ \\_\\____\\___|");
            System.out.println("WELCOME TO BASIC-CLI-CALC");
            while (true) { 
                System.out.println("What do you want to do? (2 numbers)");
                System.out.println("1. ADDITION");
                System.out.println("2. SUBTRACTION");
                System.out.println("3. MULTIPLY");
                System.out.println("4. DIVIDE");
                System.out.println("5. EXIT");
                System.out.println("CHOOSE:");
                int user_input = scan.nextInt();
                switch (user_input) {
                    case 1 -> {
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 + user_input_3);

                    }
                    case 2 -> {
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 - user_input_3);
                    }
                    case 3 -> {
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 * user_input_3);
                    }
                    case 4 -> {
                        System.out.println("FIRST NUM:");
                        int user_input_2 = scan.nextInt();
                        System.out.println("SECOND NUM:");
                        int user_input_3 = scan.nextInt();
                        System.out.println("RESULT:");
                        System.out.println(user_input_2 / user_input_3);
                    }
                    case 5 -> {
                        System.exit(0);
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