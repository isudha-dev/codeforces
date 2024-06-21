import java.util.Arrays;
import java.util.Scanner;

public class J71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int k = s.length();
            if(k < 11){
                output[i] = s;
            } else {
                output[i] = s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(k-1);
            }
        }
        Arrays.stream(output).forEach(System.out::println);
    }
}
