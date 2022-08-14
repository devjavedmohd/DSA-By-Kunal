import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum1 = input.nextInt();
        int sum2 = input.nextInt();

        int sum = sum1 + sum2;

        System.out.println("Sum = " + sum);
    }
}
