import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1: ");
        Integer num1= scanner.nextInt();
        System.out.println("num2: ");
        Integer num2= scanner.nextInt();
        System.out.println("num3: ");
        Integer num3= scanner.nextInt();

        if(num1 >= num2) {

            if(num1 >= num3)
                System.out.println(num1+" is the largest Number");
            else
                System.out.println(num3+" is the largest Number");
        }
        else {

            if(num2 >= num3)
                System.out.println(num2+" is the largest Number");
            else
                System.out.println(num3+" is the largest Number");
        }
    }
}

