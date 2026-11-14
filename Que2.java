// 2. Delete an element from a given position

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          int at_index= sc.nextInt();
          if (at_index<0||at_index>=n){
            System.out.println("Invalid Index ");
          }
          else {
          for ( int i = at_index; i<n-1; i++){
            arr[i] = arr[i+1];
          }
        }
          arr[arr.length-1]= 0;
          for ( int num :arr){
            System.out.println(num);
          }
          sc.close();
    }
    
}
