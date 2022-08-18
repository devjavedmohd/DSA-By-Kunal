public class CountNums {
    public static void main(String[] args) {
//        int n = 128644844;
//
//        int count = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//
//            if (rem == 4) {
//                count++;
//            }
//
//            n = n/10;
//        }
        int n = 12545435;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }

            n = n/10;
        }
        System.out.println(count);

    }
}
