import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int num2 = input.nextInt();

        // type casting
        int num1 = (int)(123.35f);
        System.out.println(num1);

        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1

        System.out.println(b);


    }
}
