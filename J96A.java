import java.util.Scanner;

public class J96A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        if(s.length() < 7){
            System.out.println("NO");
            return;
        }
        Character c = s.charAt(0);
        int k = 1;
        while (k < s.length() && k < s.length()-5){
            int count = 1;
            while (k < s.length() && c == s.charAt(k)){
                count++;
                k++;
            }
            if(count >= 7){
                System.out.println("YES");
                return;
            }
            if(k < s.length()){
                c = s.charAt(k);
            }
            k++;
        }
        System.out.println("NO");
    }
}
