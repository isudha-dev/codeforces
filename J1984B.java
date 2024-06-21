import java.util.ArrayList;
import java.util.Scanner;

public class J1984B {
    /*
        9 -> 19 -> 10, 9 XXXX
        8 -> 18 -> 9, 9
        7 -> 17 -> 9, 8
        6 -> 16 -> 9, 7
        5 -> 15 -> 9, 6
        4 -> 14 -> 9, 5
        3 -> 13 -> 8, 5
        2 -> 12 -> 7, 5
        1 -> 11 -> 6, 5
        0 -> 10 -> 5, 5

        3393938
        num = 18, 12, 18, 12, 18, 12, 2
              9 7   9   7   9   7   0
              9 5   9   5   9   5   0

        1434
        14  12  13  0

        98765432123456789

        1337
        17  12  12  0

        200

        1434
        14  12  13  0

        11111111111111111

        4741
        11  13  16  3

        1601
        11  19  15  0
        6
        5


        273
        3341



     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Long num = scanner.nextLong();
            output.add(solve(num));
        }

        output.forEach(System.out::println);
    }

    public static String solve(Long num){
        String numberStr = Long.toString(num);
        int l = numberStr.length();
        if(numberStr.charAt(0) != '1'){
            return "No";
        }
        if(numberStr.charAt(l-1) == '9'){
            return "No";
        }

        for(int i = l-2; i>0; i--){
            if(numberStr.charAt(i) == '0'){
                return "No";
            }
        }

        return "Yes";
    }

    /*
    10000
4081
1828
7846
7301
9058
5396
3561
2381
3516
7963
9766
7692
7999
302
5742
1492
793
1460
7833
1612
6730
7445
9179
3370
8654
9246
3107
7114
2625
6495
9882
7043
9419
3628
164
6351
5359
3099
9957
7857
5504
4336
6463
7199
8939
70
9491
8753
2933
82
1665
2679
837
6551
3664
4915
7724
5627
6317
982
9049
7958
9646
9895
6168
9238
7525
3199
7416
5017
190
2049
1977
5699
6591
6784
4741
1601
273
3341
3328
347
9413
6148
269
5660

     */

}
