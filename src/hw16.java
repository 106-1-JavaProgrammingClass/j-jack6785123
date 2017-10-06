import java.util.Scanner;

public class hw16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Float A1 = scn.nextFloat();//半徑
        Float A2 = scn.nextFloat();//高

        System.out.println((double)Math.PI*Math.pow(A1,2)*A2);
    }
}
