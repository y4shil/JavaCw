import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double stopnieCelsjusza, stopnieFahrenheita;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperature w stopniach Celsjusza: ");
        stopnieCelsjusza = scanner.nextDouble();

        stopnieFahrenheita = 1.8 * stopnieCelsjusza + 32;

        System.out.println("Temperatura w stopniach Fahrenheita: " + stopnieFahrenheita);
    }
}