import java.util.Scanner;

public class J281A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int i = s.charAt(0);
        if(i >= 65 && i <= 90){
            System.out.println(s);
        } else {
            Character c = (char) (s.charAt(0) - 32);
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(s.substring(1));
            System.out.println(sb.toString());
        }
    }
}
