// import java.util.Scanner;

// public class Palindrome {
//     @FunctionalInterface
//     interface Pal {
//         boolean check(int number);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         Pal Palin = num -> {
//             int reversed = 0, remainder, original = num;
//             while (num != 0) {
//                 remainder = num % 10;
//                 reversed = reversed * 10 + remainder;
//                 num /= 10;
//             }
//             return original == reversed;
//         };

//         if (Palin.check(number)) {
//             System.out.println(number + " is a palindrome.");
//         } else {
//             System.out.println(number + " is not a palindrome.");
//         }
//     }
// }
import java.util.Scanner;

@FunctionalInterface
interface IsPalindrome {
    boolean check(String text);
}

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = sc.nextLine();  // Capture entire line

        // Lambda expression for case-insensitive palindrome check
        IsPalindrome isPalindrome = str -> new StringBuilder(str.toLowerCase()).reverse().toString().equals(str.toLowerCase());

        if (isPalindrome.check(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
        sc.close();
    }
}
