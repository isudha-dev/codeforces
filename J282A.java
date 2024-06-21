import java.util.Scanner;

public class J282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int output = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if(s.charAt(1) == '+'){
                output++;
            } else if (s.charAt(1) == '-'){
                output--;
            }
        }
        System.out.println(output);
    }
}
