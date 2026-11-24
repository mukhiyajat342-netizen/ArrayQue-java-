// Find the minimum absolute difference between any two elements
import java.util.Scanner;
import java.util.Arrays;

public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Give a higher array length ");
            return ;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] < minDiff) {
                minDiff = arr[i] - arr[i - 1];
            }
        }
        System.out.println("Min absolute diffrence : "+ minDiff);
        sc.close();
    }

}
