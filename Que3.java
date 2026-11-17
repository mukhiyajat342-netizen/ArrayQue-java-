//3. Update an element at a given index
import java.util.Scanner;
public class Que3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int value = sc.nextInt();
        if (index < 0 || index >= n) {
            System.out.println("Invalid Index ");
        } else {
            arr[index] = value;
            for (int num : arr) {
                System.out.println(num);
            }
        }
        sc.close();
    }

}
