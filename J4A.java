import java.util.Scanner;

public class J4A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        if(w < 4){
            System.out.println("No");
            return;
        }
        if(w%2 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scn.close();
    }
}
