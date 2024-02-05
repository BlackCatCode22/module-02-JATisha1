import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        System.out.println("num1: ");
        int num1 = getAnIntFromTheUser();
        System.out.println("num2: ");
        int num2 = getAnIntFromTheUser();

        int number = compareTwoInts(num1, num2);
        System.out.println("largest number: " + number);

        int sumNum= sumTwoInts(num1,num2);
        System.out.println("sum of two integers: "+ sumNum);
    }

    public static int getAnIntFromTheUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int compareTwoInts(int a, int b) {
        int large;
        if (a > b) {
            large = a;
        } else {
            large = b;
        }
        return large;
    }

    public static int sumTwoInts(int a,int b) {
        int sum= a+b;
        return sum;
    }
}
