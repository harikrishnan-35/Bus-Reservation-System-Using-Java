//import java.util.Scanner;
import java.*;

public class pattern {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "geeksforfeeks";
        printPattern(str);
       // sc.close();
    }

    static void printPattern(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
