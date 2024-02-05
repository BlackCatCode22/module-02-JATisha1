import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user input: ");
        String name = scanner.nextLine();
        String rev = "";
        for (int i=name.length()-1;i>=0;i--) {
            rev = rev+name.charAt(i);
        }
        System.out.println("The reverse string is: " + rev);

    }
}