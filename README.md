# Strukturinis Programavimas Task 1
## Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

### Example 1:
Input: `x = 121`

Output: `true`

Explanation: `121 reads as 121 from left to right and from right to left.`


### Example 2:
Input: `x = -121`

Output: `false`

Explanation: `From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.`


### Example 3:
Input: `x = 10`

Output: `false`

Explanation: `Reads 01 from right to left. Therefore it is not a palindrome.`


### Constraints:
* `-231 <= x <= 231 - 1`


## Solution:
```
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
```

## Algorithm explanation:
* Program accepts user input `userInput`.
* Method `isPalindrome` is called with parameter `userInput`.
  * `userInput` is split in to `firstHalf` and `secondHalf`.
  * `secondHalf` is checked if it is longer than `firstHalf`. If it is then the first character is removed.
  * `secondHalf` is reversed.
  * Method returns `firstHalf == secondHalf`.
* The result is returned to user.
  
