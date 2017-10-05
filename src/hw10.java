import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char chold = scn.next().charAt(0);
        char chnew =scn.next().charAt(0);
        System.out.println(str.replace(chold,chnew));
    }
}
