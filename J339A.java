import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J339A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for(Character c: s.toCharArray()){
            if(c == '+'){
                continue;
            } else {
                arr.add(c - '0');
            }
        }

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        arr.forEach(i -> sb.append(i+"+"));
        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());

    }
}
