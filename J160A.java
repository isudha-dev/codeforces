import java.util.Arrays;
import java.util.Scanner;

public class J160A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        int mySum = 0;
        int count = 0;
        for (int i = n-1; i >= 0; i--){
            if(mySum > sum-mySum){
                break;
            } else {
                mySum += arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
