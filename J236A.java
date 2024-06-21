import java.util.HashSet;
import java.util.Scanner;

public class J236A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        HashSet<Character> set = new HashSet<>();
        for(Character c: s.toCharArray()){
            set.add(c);
        }

        if(set.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
