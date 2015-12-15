package week1;

import java.util.Scanner;

/**
 * Created by Elijah on 15.12.2015.
 */
public class AlgsWeek1 {

    // Recursive algorithm
    public static int FibonacciRec(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return FibonacciRec(n - 1) + FibonacciRec(n - 2);
    }

    // Non-recursive
    public static int FibonacciNotRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        int prev = 1;
        int current = 1;
        for (int i = 2; i <= n; ++i) {
            int temp = current;
            current += prev;
            prev = temp;
        }
        return current;
    }

    // Is number prime?
    public static boolean IsPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Quick power
    public static double QuickPower(double a, int n) {
        double result = 1;
        double aInDegreeOf2 = a;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= aInDegreeOf2;
            }
            aInDegreeOf2 *= aInDegreeOf2;
            n = n >> 1;
        }
        return result;
    }

    // Simple Factorization
    public static void Factorization(int n) {
        int temp = n;
        for (int i = 2; i * i <= n; i++) {
            if (temp % i == 0) {
                temp = temp / i;
                System.out.print(i+ " ");
                i = i - 1;
            }
        }
        if (temp != 0 && temp != 1) {
            System.out.println(temp);
        }
    }

    // Linear Search
    public static boolean HasElement( double [] arr, int count, double element) {
        for (int i = 0; i < count; ++i) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

}




















