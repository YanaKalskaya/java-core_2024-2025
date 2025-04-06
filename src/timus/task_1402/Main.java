package timus.task_1402;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        BigInteger cocktails = BigInteger.ZERO;

        for (int k = 2; k <= N; k++) {
            cocktails = cocktails.add(factorial(N).divide(factorial(N - k)));
        }
        System.out.println(cocktails);
        in.close();
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//
//        long cocktails = 0;
//
//        for (int k = 2; k <= N; k++) {
//            cocktails += fact(N) / fact(N - k);
//        }
//        System.out.println(cocktails);
//        in.close();
//    }
//
//    public static int fact(int n) {
//        if (n <= 1) return 1;
//        return n * fact(n - 1);
//    }
//}