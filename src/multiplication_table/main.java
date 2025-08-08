package multiplication_table;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice what size multiplication table: ");
        int n = scanner.nextInt();
        int[][] table = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i][j] = i * j;
            }
        }

        System.out.print("  |");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("----" + "----".repeat(n));
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
