//  1. Insert an element at a given position

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Insert");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int insert = sc.nextInt();
        int at_index = sc.nextInt();
        for (int i = n - 1; i > at_index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[at_index] = insert;
        System.out.println("After Insert");
        for (int after : arr) {
            System.out.print(after+" ");
        }
        sc.close();
    }

}
