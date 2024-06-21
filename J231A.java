import java.util.Scanner;

public class J231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int v = scanner.nextInt();
            int t = scanner.nextInt();
            int sum = p+v+t;
            if(sum > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
