import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stopnieCelsjusza, stopnieFahrenheita;
        System.out.print("Podaj temperature w stopniach Celsjusza: ");
        stopnieCelsjusza = scanner.nextDouble();

        stopnieFahrenheita = 1.8 * stopnieCelsjusza + 32;

        System.out.println("Temperatura w stopniach Fahrenheita: " + stopnieFahrenheita);

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



        //zad 3

        System.out.print("Podaj wage: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost: ");
        double wzrost = scanner.nextDouble();

        double bmi = waga/(wzrost * wzrost);

        if(bmi<18.5) {
            System.out.println("Niedowaga");
        }
        else if(bmi <= 24.9) {
            System.out.println("Waga prawidlowa");
        }
        else {
            System.out.println("Nadwaga");
        }



        //zad 4
        System.out.print("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();
        double podatek;

        if (dochod <= 85528) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        if (podatek < 0) {
            podatek = 0; // podatek nie może być ujemny
        }

        System.out.printf("Należny podatek: %.2f zł\n", podatek);



        //zad 5
        double cena;
        int liczbaRat;
        double oprocentowanie = 0;

        do {
            System.out.print("Podaj cenę towaru (100 - 10000 zł): ");
            cena = scanner.nextDouble();
        } while (cena < 100 || cena > 10000);


        do {
            System.out.print("Podaj liczbę rat (6 - 48): ");
            liczbaRat = scanner.nextInt();
        } while (liczbaRat < 6 || liczbaRat > 48);

        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else if (liczbaRat >= 25 && liczbaRat <= 48) {
            oprocentowanie = 0.10;
        }

        double kwotaDoSplaty = cena + (cena * oprocentowanie);
        double rata = kwotaDoSplaty / liczbaRat;

        System.out.printf("Miesięczna rata: %.2f zł (oprocentowanie: %.1f%%)\n", rata, oprocentowanie * 100);


        //zad 6
        System.out.println("Prosty kalkulator: +, -, *, /");
        System.out.print("Podaj pierwszą liczbę: ");
        double liczb1 = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double liczb2 = scanner.nextDouble();

        double wynik;
        boolean blad = false;

        switch (operacja) {
            case '+':
                wynik = liczb1 + liczb2;
                break;
            case '-':
                wynik = liczb1 - liczb2;
                break;
            case '*':
                wynik = liczb1 * liczb2;
                break;
            case '/':
                if (liczb2 == 0) {
                    System.out.println("Błąd: dzielenie przez zero!");
                    blad = true;
                    wynik = 0;
                } else {
                    wynik = liczb1 / liczb2;
                }
                break;
            default:
                System.out.println("Błąd: nieznany operator.");
                blad = true;
                wynik = 0;
        }

        if (!blad) {
            System.out.printf("Wynik: %.2f\n", wynik);
        }

        System.out.println("Naciśnij Enter, aby zakończyć...");
        scanner.nextLine();
        scanner.nextLine();

    }
}