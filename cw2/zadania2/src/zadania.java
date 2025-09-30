import java.util.Scanner;

public class zadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podano liczbę niedodatnią. Program kończy działanie.");
        } else {
            System.out.println("Liczby nieparzyste nie większe niż " + n + ":");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i);
                if (i + 2 <= n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
