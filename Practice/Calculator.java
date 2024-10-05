import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Digit : ");
            double num1 = sc.nextInt();
            System.out.print("Enter 2nd Digit : ");
            double num2 = sc.nextInt();
            System.out.print("Enter Operator ( + , - , * , / , % ) : ");
            char ope = sc.next().charAt(0);

            switch (ope) {
                case '+' -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case '-' -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case '*' -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case '/' -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                case '%' -> System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                default -> System.out.println("Enter valid operator !");
            }
        }
    }

}
