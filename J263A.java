import java.util.Scanner;

public class J263A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = -1, col = -1;
        int[][] matrix = new int[5][5];
        for(int r = 0; r<5; r++){
            for(int c = 0; c<5; c++){
                matrix[r][c] = scn.nextInt();
                if(matrix[r][c] == 1){
                    row = r;
                    col = c;
                }
            }
        }
        int count = 0;
        count += row > 2 ? row-2 : 2-row;
        count += col > 2 ? col-2 : 2-col;

        System.out.println(count);
    }

}
