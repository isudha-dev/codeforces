import java.util.Arrays;
import java.util.Scanner;

public class J158A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scn.nextInt();
        }
        if (scores[k-1] == 0){
            System.out.println(Arrays.stream(scores).filter(i -> i>0).count());
        } else {
            System.out.println(Arrays.stream(scores).filter(i -> i>= scores[k-1]).count());
        }
    }
}
