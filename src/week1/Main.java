/**
 * Created by Elijah on 15.12.2015.
 */
package week1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr1 = new int[length+1];
        int [] arr2 = new int[length+1];
        for (int i = 0; i < length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < length; i++) {
            arr2[i] = scanner.nextInt();
        }

        FirstEnterInArrays(length, arr1, arr2);

        /*
        System.out.println("Now with direct");
        Factorization(16);


        System.out.println(AlgsWeek1.FibonacciRec(3));
        System.out.println(AlgsWeek1.FibonacciNotRecursive(5));
        System.out.println(AlgsWeek1.IsPrime(437));
        System.out.println(AlgsWeek1.QuickPower(5, 4));
        */
    }
    public static void FirstEnterInArrays(int n, int [] arr1, int [] arr2){
        // Input -- two arrays with the equal length
        // Output -- first pair of elements such as a[i] + b[j] = max{a[i] + b[j]}
        int max = arr1[0] + arr2[0];
        int first = 0;
        int second = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (arr1[i] + arr2[j] > max) {
                    //System.out.println("i = " + i + "j = " + j);
                    //System.out.println("Old max = " + max);
                    max = arr1[i] + arr2[j];
                    //System.out.println("Now, max = " + max);
                    first = i;
                    second = j;
                }
            }
        }
        System.out.println(first + " " + second);
        System.out.println("hello");
    }
}
