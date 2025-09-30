import java.util.Scanner;

public class zadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.print("Podaj liczbę całkowitą dodatnią: ");
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



        //zad2

        System.out.print("Podaj liczbę całkowitą A: ");
        int A = scanner.nextInt();

        System.out.print("Podaj liczbę całkowitą B (większą niż A): ");
        int B = scanner.nextInt();

        if (A >= B) {
            System.out.println("B musi być większe niż A!");
            return;
        }

        int sumaWhile = 0;
        int i = A;
        while (i <= B) {
            sumaWhile += i;
            i++;
        }
        System.out.println(sumaWhile);

        int sumaDoWhile = 0;
        int j = A;
        do {
            sumaDoWhile += j;
            j++;
        } while (j <= B);
        System.out.println(sumaDoWhile);

        int sumaFor = 0;
        for (int k = A; k <= B; k++) {
            sumaFor += k;
        }
        System.out.println(sumaFor);

        scanner.close();



        //zad 3

        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba nie jest dodatnia. Program kończy działanie.");
            return;
        }

        int potega = 1;

        while (potega <= n) {
            System.out.println(potega);
            potega *= 2;
        }

        scanner.close();


        //zad 4
        int suma = 0;
        int liczba;

        do {
            System.out.print("Podaj liczbę (0 kończy): ");
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);

        System.out.println("Suma podanych liczb: " + suma);

        scanner.close();

        */
        //zad 5
        int liczba;
        boolean pierwsza = true;
        int min = 0;
        int max = 0;

        System.out.println("Podawaj liczby całkowite (0 kończy):");

        while (true) {
            liczba = scanner.nextInt();

            if (liczba == 0) {
                break;
            }

            if (pierwsza) {
                min = liczba;
                max = liczba;
                pierwsza = false;
            } else {
                if (liczba < min) min = liczba;
                if (liczba > max) max = liczba;
            }
        }

        if (pierwsza) {
            System.out.println("Nie podano żadnych liczb.");
        } else {
            int suma = min + max;
            double srednia = suma / 2.0;

            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
            System.out.println("Suma: " + suma);
            System.out.println("Średnia arytmetyczna: " + srednia);
        }

        scanner.close();
    }
}
