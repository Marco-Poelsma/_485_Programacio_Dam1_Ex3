/*Exercici 3*/
import java.text.DecimalFormat; // per a limitar el màxim de decimals a 2 posicions, necessito importar aquesta llibreria.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double bonEstat = 1.25;
        final double malEstat = 1.1;
        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //Limita el màxim de decimals a 2.
        double preu;
        int estat;
        System.out.println("Benvingut al programa");
        System.out.println("Introdueix el preu de la teva figureta");
        do{
            preu = input.nextDouble();
            if (preu <= 0){
                System.out.println("El valor introduit és invàlid. Recorda que has d'introduir un valor superior a 0€");
            }
        } while (preu <= 0);
        System.out.println("En quin estat està la teva figura?");
        do {
            System.out.println("1. Bon estat.");
            System.out.println("2. Mal estat.");
            estat = input.nextInt();
            switch (estat){
                case 1:
                    System.out.println("El preu final de la teva figura és de " + preu*bonEstat + "€");
                    break;
                case 2:
                    System.out.println("El preu final de la teva figura és de " + preu*malEstat + "€");
                    break;
                default:
                    System.out.println("Introdueix una opció vàlida. Escull entre les 2 opcions següents:");
                    break;
            }
        } while (estat != 1 && estat != 2);
    }
}