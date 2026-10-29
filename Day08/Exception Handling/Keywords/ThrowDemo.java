import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        if (age < 0) {
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
        }
        System.out.println("Age: " + age);
        sc.close();
    }
}

