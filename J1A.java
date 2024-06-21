import java.util.Scanner;

public class J1A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a = scn.nextInt();

        int countN = 0;
        if(n%a == 0){
            countN += n/a;
        } else {
            countN += n/a;
            countN++;
        }

        m = m - a;
        if(m <= 0) {
            System.out.println(countN);
            return;
        }

        int countM = 0;
        if(m%a == 0){
            countM += m/a;
        } else {
            countM += m/a;
            countM++;
        }

        Long total = (long) (countN-1)*countM + countM + countN;
        System.out.println(total);
    }

}
