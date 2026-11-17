
// Find the first repeating element
import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
            if (isDuplicate) {
                break;
            }
        }
        if (!isDuplicate) {
            System.out.println("Not Found Dupliate");
        }
        sc.close();
    }
}
