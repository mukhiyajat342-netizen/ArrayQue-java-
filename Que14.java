
// Check if an array is in Arithmetic Progression (AP)
import java.util.Arrays;
import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // min length is 3 for a ap
        if (n <= 2) {
            System.out.println("Less Array length");
        }
        // need always sorted array
        Arrays.sort(arr);
        int diff = arr[1] = arr[0];
        boolean isap = true;
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                isap = false;
                break;
            }
        }
        if (isap) {
            System.out.println("Array is in AP");
        } else {
            System.out.println("Array not in a AP");
        }
        sc.close();

    }

}
