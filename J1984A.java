import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J1984A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int arrLen = scanner.nextInt();
            int[] arr = new int[arrLen];
            for (int j = 0; j < arrLen; j++) {
                arr[j] = scanner.nextInt();
            }
            output.add(solve(arr.length, arr));
        }
        scanner.close();

        output.forEach(System.out::println);
    }

    public static String solve(int len, int[] arr){
        // right range of red => len - 1 or until arr(len-1) == arr(j) where j -> len-2 : 2
        // left range of red => 0 or until arr(0) == arr(j) where j -> 1 : len-3

        // right range of blue = right range of red - 1 / left range of red + 1

        int rR = len - 1 ;
        int lR = 0;

        int j = len - 2;
        while(arr[rR] == arr[j] && j >= 2){
            rR = j;
            j--;
        }

        j = 1;
        while (arr[lR] == arr[j] && j <= len - 3 && j < rR - 1) {
            lR = j;
            j++;
        }

        int rB = rR - 1;
        int lB = lR + 1;

        if(arr[rR]-arr[lR] == arr[rB]-arr[lB]){
            return "No";
        }

        ArrayList<Character> output = new ArrayList<>(len);

        for(int i = 0; i<=lR; i++) {
            output.add('R');
        }

        for (int i = lB; i <= rB; i++) {
            output.add('B');
        }

        for(int i = rR; i<len; i++) {
            output.add('R');
        }

        String sOutput = output.stream().map(String::valueOf).collect(Collectors.joining());
        return "Yes"+"\n"+ sOutput;

    }

    // 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 64950001 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532 939050532
}
