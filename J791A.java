import java.util.Scanner;

public class J791A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int b = scn.nextInt();
        int count = 0;
        while (l <= b){
            l *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}
