import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class J1980A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        int[] output = new int[tc];
        for (int i = 0; i < tc; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            String s = scn.next();
            output[i] = solve(s, m);
        }
        Arrays.stream(output).forEach(System.out::println);
    }

    public static int solve(String s, int m){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int count = 0;
        if(map.size() < 7){
            count += (7-map.size()) * m;
        }

        for(int i: map.values()){
            if(i < m){
                count += (m-i);
            }
        }

        return count;
    }
}
