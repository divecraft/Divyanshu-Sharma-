package Question;

import java.util.Scanner;

public class Roughf {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] roug= {1,23,4,5,6};
        int c= roug.length;
        int sum =0;
        for (int i=0; i<c;i++){
            int re=roug[i];
            sum+=re;
        }
        System.out.println(sum);
    }
}
