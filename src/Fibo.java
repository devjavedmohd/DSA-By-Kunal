import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 2;

        while (count <= n) {
            int temp = secondTerm;
            secondTerm = secondTerm + firstTerm;
            firstTerm = temp;
            count++;
        }
        System.out.println(secondTerm);
    }
}
