import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        start(scanner);
    }

    public static void start(Scanner scanner) {
        System.out.println("Input an integer:");

        int userInput = scanner.nextInt();
        boolean isPalindrome = isPalindrome(userInput);

        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int userInput) {
        String userInputString = String.valueOf(userInput);

        String firstHalf = userInputString.substring(0, userInputString.length() / 2);
        String secondHalf = userInputString.substring(userInputString.length() / 2);

        if (firstHalf.length() + 1 == secondHalf.length()) {
            secondHalf = secondHalf.substring(1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(secondHalf);
        sb.reverse();
        return firstHalf.contentEquals(sb);
    }
}