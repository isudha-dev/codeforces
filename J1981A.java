import java.util.Arrays;
import java.util.Scanner;

public class J1981A {
    /*
        assume there is number <= l which is power of 2 (lets say k). This will always be true because
        l ranges from 1 which is 2^0.
        Now k*2 will always be <= r because 2l <= r and k is less than l.
        So we have to find k in range l, r which is power of 2. And then when we keep dividing it by 2, we will get
        max value.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        int[] ans = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int l = scn.nextInt();
            int r = scn.nextInt();
            ans[i] = solve(r);
        }

        Arrays.stream(ans).forEach(System.out::println);
    }

    public static int solve(int r){
        int x = 1;
        int count = 0;
        while(x*2 <= r){
            count++;
            x*=2;
        }

        return count;
    }
}
