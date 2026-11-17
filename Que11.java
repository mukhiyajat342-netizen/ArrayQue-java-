// Find the median of an array
import java.util.Scanner;
import java.util.Arrays;
public class Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //to find median array will sorted in assending order only
        double median; 
        if (n%2==0){
            median = arr[n/2]; 
        }
        else {
            // Even case m ham middle ke 2 elements ka average lenge
            median = (arr[(n/2)-1]+arr[n/2])/2.0; 
        }
        System.out.println("Median:"+ median);
        sc.close();
    }
}
