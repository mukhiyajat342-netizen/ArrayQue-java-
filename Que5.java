// 5. Count distinct (unique) elements
import java.util.Scanner;
public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for ( int i = 0 ; i<n ;i++){
            boolean isDuplicate = false;
            for( int j = 0; j<i ; j++){
                if ( arr[i]==arr[j]){
                    isDuplicate = true;
                    break; 
                }
            }
            if(!isDuplicate){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
