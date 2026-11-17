
// Find the first non-repeating element
import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    // Jab i = 0 aur j = 0 hoga, toh arr[0] == arr[0] hamesha true hoga (kyunki har
                    // number khud ke barabar toh hota hi hai!). Isse found har baar true ho jayega
                    // aur if (!found) kabhi chalega hi nahi. {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr[i]);
                return;
                // we can use break also
                // Exit the program immediately since we only want the FIRST one
            }
        }
        System.out.println("not found repeating element");
        sc.close();
    }
}
