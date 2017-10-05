import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        float val2 = (float)0.26418;
        System.out.println(Math.round(val1*val2*10)/10f);
    }
}
