
// Check if two arrays are equal
import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 0 || m < 0) {
            System.out.println("Invalid array size");
            return;
        }
        boolean equal = true;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        if (n != m) {
            equal = false;
        }

        else {
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        sc.close();
    }

}
