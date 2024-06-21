import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J1980B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        String[] output = new String[tc];
        for (int i = 0; i < tc; i++) {
            int n = scn.nextInt();
            int f = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            if(n == k) {
                output[i] = "YES";
            } else {
                output[i] = solve(arr, n, f, k);
            }

        }

        Arrays.stream(output).forEach(System.out::println);
    }

    /*
        save arr(f-1) -> fav
        sort array in increasing order
        if arr(k-1) < fav => YES
        if arr(k-1) > fav => NO
        if arr(k-1) == fav, check arr(k). if arr(k) == arr(k-) => MAYBE, else YES
     */

    public static String solve(int[] arr, int n, int f, int k){
        int fav = arr[f-1];
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, Collections.reverseOrder());

        if(integerArray[k-1] < fav){
            return "YES";
        } else if(integerArray[k-1] > fav){
            return "NO";
        } else if (integerArray[k-1] == fav){
            if(integerArray[k-1] == integerArray[k]){
                return "MAYBE";
            }
        }
        return "YES";
    }

}
