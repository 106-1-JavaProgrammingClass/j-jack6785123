import java.util.Scanner;

public class hw15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int as1 = Integer.valueOf(str,16);
        System.out.println((char)as1);
    }
}
