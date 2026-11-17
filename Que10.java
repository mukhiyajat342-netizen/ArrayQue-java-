
// Find the maximum occurring element (mode)import java.util.Scanner;
import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int maxElement = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 1;// Har element khud 1 baar toh aaya hi hai
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count < maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        System.out.println("max accuring element:" + maxElement);
        sc.close();
    }
}
