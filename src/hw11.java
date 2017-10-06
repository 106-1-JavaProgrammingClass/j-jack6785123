import java.util.Scanner;

public class hw11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int as1 = scn.nextInt();
        int as2 = scn.nextInt();
        int as3 = scn.nextInt();
        System.out.println(Math.max(Math.max(as1, as2), as3));
    }

}
