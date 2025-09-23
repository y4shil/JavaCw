import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  double stopnieCelsjusza, stopnieFahrenheita;
        System.out.print("Podaj temperature w stopniach Celsjusza: ");
        stopnieCelsjusza = scanner.nextDouble();

        stopnieFahrenheita = 1.8 * stopnieCelsjusza + 32;

        System.out.println("Temperatura w stopniach Fahrenheita: " + stopnieFahrenheita);
       */
        // zad 2
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj druga liczbe: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecia liczbe: ");
        int liczba3 = scanner.nextInt();

        int maks = liczba1;
        if(liczba2>maks) {
            maks = liczba2;
        }
        if(liczba3>maks) {
            maks = liczba3;
        }

        int min = liczba1;
        if(liczba2<liczba1) {
            min = liczba2;
        }
        if(liczba3<min) {
            min = liczba3;
        }

        System.out.println("Najwieksza liczba: "+maks);
        System.out.println("Najmniejsza liczba: " +min);
    }
}